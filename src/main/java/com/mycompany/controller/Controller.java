package com.mycompany.controller;

import com.mycompany.model.*;
import com.mycompany.view.ManejoConsola;

import java.util.Scanner;

public class Controller {
    public Controller(){
        inicializar();
    }

    public void inicializar(){
        ManejoConsola consola = new ManejoConsola();
        try (Scanner scanner = new Scanner(System.in)) {
            Cultivo[] cultivos_1 = {new ArbolFrutal("Enero",
                            "ceosecha saludable",
                            "mucho",
                            "aaaddfgg232sa",
                            "gusanos",
                            19,
                            2.5,
                            "Manzanas"),
                    new Legumbre("Primavera",
                            "Otoño",
                            "sol/sombra",
                            "LBG-045",
                            "Empaquetadora" ),
                    new Hortaliza("Verano",
                            "Otoño",
                            "sol/sombra",
                            "HTZ-210",
                            "Mosca blanca",
                            3,
                            6.0,
                            "tomate"  )};

            Cultivo[] cultivos_2 = {
                    new ArbolFrutal("Febrero",
                            "Cosecha dulce",
                            "sol",
                            "ARB-102",
                            "Pulgones",
                            2,
                            7.5,
                            "Cerezo"),

                    new Legumbre("Otoño",
                            "Primavera",
                            "sombra",
                            "LBG-077",
                            "Empaquetadora"),

                    new Hortaliza("Primavera",
                            "Verano",
                            "sol",
                            "HTL-330",
                            "Trips",
                            2,
                            5.5,
                            "lechuga")
            };

            Cultivo[] cultivos_3 = {
                    new ArbolFrutal("Marzo",
                            "Cosecha abundante",
                            "sol/sombra",
                            "ARB-888",
                            "Carpocapsa",
                            1,
                            8.0,
                            "Ciruelo"),

                    new Legumbre("Invierno",
                            "Verano",
                            "sol",
                            "LBG-999",
                            "Cosechadora"),

                    new Hortaliza("Otoño",
                            "Invierno",
                            "sombra",
                            "HTL-555",
                            "Mildiu",
                            1,
                            4.0,
                            "acelga")
            };


            ListaEnlazadaSimple<Vagon> lista = new ListaEnlazadaSimple<>();

            lista.agregarAlFinal(new Vagon("Vagon 1", cultivos_1));
            lista.agregarAlFinal(new Vagon("Vagon 2",cultivos_2));
            lista.agregarAlFinal(new Vagon("Vagon 3",cultivos_3));

//            System.out.print("Ingrese el número de personas (N): ");
//            int n = scanner.nextInt();
//            scanner.nextLine(); // Limpiar buffer
//
//            for (int i = 0; i < n; i++) {
//                System.out.println("\nPersona #" + (i + 1));
//                System.out.print("Nombre: ");
//                String nombre = scanner.nextLine();
//                System.out.print("Edad: ");
//                int edad = scanner.nextInt();
//                scanner.nextLine(); // Limpiar buffer
//
//                lista.agregarAlFinal(new Cultivo(nombre, edad));
//            }

            System.out.println("\n--- Lista de Vagones (" + lista.getTamanno() + ") ---");
            lista.imprimir();
            System.out.println("dato a buscar");

            String nombreExis = scanner.nextLine();
            Vagon vag = new Vagon(nombreExis, cultivos_1);

            Nodo<Vagon> encontrado = lista.buscar(vag);

            Cultivo[] cultivos_encontrados = encontrado.getDato().getCultivos();
            for (Cultivo cultivo : cultivos_encontrados){
                System.out.println(cultivo.toString());
            }
            System.out.println("El valor del vagon es: " + encontrado.getDato().getValor() );


//            System.out.println("dato nuevo");
//            String nombreNuevo = scanner.nextLine();
//            int edadNuevo = scanner.nextInt();
//            Cultivo nuevoDato = new Cultivo(nombreNuevo, edadNuevo);
//            int opcion = consola.opcionesAgregar();
//            switch (opcion){
//                case 1:
//                    lista.agregarAntesDe(datoExistente, nuevoDato);
//                    lista.imprimir();
//                    break;
//                case 2:
//                    lista.agregarDespuesDe(datoExistente, nuevoDato);
//                    lista.imprimir();
//                    break;
//                case 3:
//                    break;
//                default:
//                    System.out.println("Opción inválida. Intente nuevamente.");
//            }
        }
        catch(Exception e){
            System.out.println("error " + e.getMessage());
        }
    }
}

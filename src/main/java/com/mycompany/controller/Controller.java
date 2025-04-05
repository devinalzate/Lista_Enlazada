package com.mycompany.controller;

import com.mycompany.model.ListaEnlazadaSimple;
import com.mycompany.model.Cultivo;
import com.mycompany.view.ManejoConsola;

import java.util.Scanner;

public class Controller {
    public Controller(){
        inicializar();
    }

    public void inicializar(){
        ManejoConsola consola = new ManejoConsola();
        try (Scanner scanner = new Scanner(System.in)) {
            ListaEnlazadaSimple<Cultivo> lista = new ListaEnlazadaSimple<>();

            lista.agregarAlFinal(new Cultivo("Carolina", 26));
            lista.agregarAlFinal(new Cultivo("Andrea", 33));
            lista.agregarAlFinal(new Cultivo("Diana", 15));

            System.out.print("Ingrese el número de personas (N): ");
            int n = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            for (int i = 0; i < n; i++) {
                System.out.println("\nPersona #" + (i + 1));
                System.out.print("Nombre: ");
                String nombre = scanner.nextLine();
                System.out.print("Edad: ");
                int edad = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer

                lista.agregarAlFinal(new Cultivo(nombre, edad));
            }

            System.out.println("\n--- Lista de Personas (" + lista.getTamanno() + ") ---");
            lista.imprimir();
            System.out.println("dato a buscar");

            String nombreExis = scanner.nextLine();

            int edadExis = scanner.nextInt();
            Cultivo datoExistente = new Cultivo(nombreExis, edadExis);
            scanner.nextLine();

            System.out.println("dato nuevo");
            String nombreNuevo = scanner.nextLine();
            int edadNuevo = scanner.nextInt();
            Cultivo nuevoDato = new Cultivo(nombreNuevo, edadNuevo);
            int opcion = consola.opcionesAgregar();
            switch (opcion){
                case 1:
                    lista.agregarAntesDe(datoExistente, nuevoDato);
                    lista.imprimir();
                    break;
                case 2:
                    lista.agregarDespuesDe(datoExistente, nuevoDato);
                    lista.imprimir();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
        catch(Exception e){
            System.out.println("error " + e.getMessage());
        }
    }
}

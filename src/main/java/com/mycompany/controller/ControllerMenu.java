package com.mycompany.controller;
import com.mycompany.model.*;
import com.mycompany.view.*;

import java.util.Scanner;

public class ControllerMenu {
    private ListaEnlazadaSimple<Vagon> listaVagones;
    private ManejoConsola consola;
    private Scanner scanner;

    public ControllerMenu() {
        this.listaVagones = new ListaEnlazadaSimple<>();
        this.consola = new ManejoConsola();
        this.scanner = new Scanner(System.in);
        cargarDatosEjemplo(); // Vagones de prueba
        mostrarMenu();
    }

    private void cargarDatosEjemplo() {
        // Vagon 1
        Cultivo[] cultivos1 = {
                new ArbolFrutal("Enero", "Cosecha saludable", "mucho", "ARB-001", "gusanos", "Manzano"),
                new Legumbre("Primavera", "Otoño", "sol/sombra", "LEG-045", "garbanzo"),
                new Hortaliza("Verano", "Otoño", "sol/sombra", "HOR-210", "Mosca blanca", "tomate")
        };

        // Vagon 2
        Cultivo[] cultivos2 = {
                new ArbolFrutal("Febrero", "Cosecha dulce", "sol", "ARB-102", "Pulgones", "Cerezo"),
                new Legumbre("Otoño", "Primavera", "sombra", "LEG-077", "alubia"),
                new Hortaliza("Primavera", "Verano", "sol", "HOR-330", "Trips", "lechuga")
        };

        listaVagones.agregarAlFinal(new Vagon("Vagon 1", cultivos1));
        listaVagones.agregarAlFinal(new Vagon("Vagon 2", cultivos2));
    }

    public void mostrarMenu() {
        int opcion;
        do {
            consola.imprimir("\n=== MENÚ TREN AGRÍCOLA ===");
            consola.imprimir("1. Mostrar todos los vagones");
            consola.imprimir("2. Buscar vagón por nombre");
            consola.imprimir("3. Calcular valor total del tren");
            consola.imprimir("4. Agregar vagón manualmente");
            consola.imprimir("5. Eliminar vagón");
            consola.imprimir("6. Ver cultivos de un vagón");
            consola.imprimir("7. Operaciones avanzadas con vagones");
            consola.imprimir("0. Salir");
            consola.imprimir("Seleccione: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1 -> mostrarTodosLosVagones();
                case 2 -> buscarVagonPorNombre();
                case 3 -> consola.imprimir("\nValor total del tren: " + calcularValorTotalTren(listaVagones));
                case 4 -> agregarVagonManual();
                case 5 -> eliminarVagon();
                case 6 -> mostrarCultivosDeVagon();
                case 7 -> menuOperacionesAvanzadas();
                case 0 -> consola.imprimir("Saliendo...");
                default -> consola.imprimir("Opción inválida");
            }
        } while (opcion != 0);
    }

    // --- Métodos de las opciones del menú ---
    private void mostrarTodosLosVagones() {
        consola.imprimir("\n--- VAGONES EN EL TREN ---");
        if (listaVagones.estaVacia()) {
            consola.imprimir("No hay vagones registrados.");
            return;
        }

        // Usamos el iterador de la lista
        ListaEnlazadaSimple.Iterador<Vagon> iterador = listaVagones.iterador();
        while (iterador.tieneSiguiente()) {
            Vagon vagon = iterador.siguiente();
            consola.imprimir(vagon.toString());
        }
    }

    private void buscarVagonPorNombre() {
        consola.imprimir("Ingrese nombre del vagón: ");
        String nombreExis = scanner.nextLine();

        // Creamos un vagón "dummy" para buscar
        Vagon vag = new Vagon(nombreExis, new Cultivo[0]);
        Nodo<Vagon> nodoEncontrado = listaVagones.buscar(vag);

        if (nodoEncontrado != null) {
            consola.imprimir("\nVAGÓN ENCONTRADO:");
            consola.imprimir(nodoEncontrado.getDato().toString());
        } else {
            consola.imprimir("Vagón no encontrado.");
        }
    }

    private int calcularValorTotalTren(ListaEnlazadaSimple<Vagon> lista) {
        int total = 0;
        Nodo<Vagon> actual = lista.getCabeza();

        while (actual != null) {
            total += actual.getDato().getValor();
            actual = actual.getSiguiente();
        }
        return total;
    }

    private void agregarVagonManual() {
        consola.imprimir("\n--- NUEVO VAGÓN ---");
        consola.imprimir("Nombre del vagón: ");
        String nombre = scanner.nextLine();

        // Cultivos de base
        Cultivo[] nuevosCultivos = {
                new Cereal("Invierno", "Verano", "sol", "CRL-111", "trigo"),
                new Hortaliza("Otoño", "Invierno", "sombra", "HOR-555", "Oidio", "zanahoria")
        };

        listaVagones.agregarAlFinal(new Vagon(nombre, nuevosCultivos));
        consola.imprimir("¡Vagón agregado exitosamente!");
    }

    private void eliminarVagon() {
        consola.imprimir("Ingrese nombre del vagón a eliminar: ");
        String nombre = scanner.nextLine();

        Vagon aEliminar = new Vagon(nombre, new Cultivo[0]);
        if (listaVagones.eliminar(aEliminar)) {
            consola.imprimir("Vagón eliminado.");
        } else {
            consola.imprimir("No se encontró el vagón.");
        }
    }

    private void mostrarCultivosDeVagon() {
        consola.imprimir("Ingrese nombre del vagón: ");
        String nombre = scanner.nextLine();

        Nodo<Vagon> nodo = listaVagones.buscar(new Vagon(nombre, new Cultivo[0]));

        if (nodo != null) {
            consola.imprimir("\nCULTIVOS EN " + nombre.toUpperCase());
            for (Cultivo cultivo : nodo.getDato().getCultivos()) {
                consola.imprimir("- " + cultivo);
            }
        } else {
            consola.imprimir("Vagón no encontrado.");
        }
    }

    private void menuOperacionesAvanzadas() {
        consola.imprimir("\n--- OPERACIONES AVANZADAS ---");
        consola.imprimir("1. Agregar vagon antes de otro");
        consola.imprimir("2. Agregar vagon después de otro");
        consola.imprimir("3. Volver al menú principal");
        consola.imprimir("Seleccione una opción:");

        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        if (opcion == 1 || opcion == 2) {
            consola.imprimir("Ingrese el nombre del vagon de referencia:");
            String nombreRef = scanner.nextLine();
            Nodo<Vagon> nodoRef = listaVagones.buscar(new Vagon(nombreRef, new Cultivo[0]));

            if (nodoRef != null) {
                consola.imprimir("Ingrese el nombre del nuevo vagon:");
                String nombreNuevo = scanner.nextLine();
                Vagon nuevoVagon = new Vagon(nombreNuevo, new Cultivo[]{
                        new Hortaliza("Primavera", "Verano", "sol", "HTL-777", "Pulgón", "pepino")
                });

                if (opcion == 1) {
                    listaVagones.agregarAntesDe(nodoRef.getDato(), nuevoVagon);
                } else {
                    listaVagones.agregarDespuesDe(nodoRef.getDato(), nuevoVagon);
                }
                consola.imprimir("Operación realizada con éxito.");
            } else {
                consola.imprimir("Vagon de referencia no encontrado.");
            }
        }
    }

}

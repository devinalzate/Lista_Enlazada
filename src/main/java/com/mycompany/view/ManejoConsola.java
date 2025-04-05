package com.mycompany.view;

import java.util.Scanner;

public class ManejoConsola {

    public int opcionesAgregar(){
        System.out.println("╔══════════════════════════════════╗");
        System.out.println("║   MENÚ DE INSERCIÓN EN LISTA     ║");
        System.out.println("╠══════════════════════════════════╣");
        System.out.println("║ 1. Agregar ANTES de un nodo      ║");
        System.out.println("║ 2. Agregar DESPUÉS de un nodo    ║");
        System.out.println("║ 3. Salir                         ║");
        System.out.println("╚══════════════════════════════════╝");
        System.out.print("Seleccione una opción (1-3): ");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        return opcion;
    }
}

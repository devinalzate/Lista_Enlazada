/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

/**
 *
 * @author devapps
 */
public class ListaEnlazadaSimple<T> {
    private Nodo<T> cabeza;
    private int tamanno;

    public ListaEnlazadaSimple() {
        cabeza = null;
        tamanno = 0;
    }

    // ---------------------- Operaciones Básicas ----------------------
    public void agregarAlFinal(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo<T> actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
        tamanno++;
    }
    
    public void agregarAlInicio(T dato){
        Nodo<T> nuevoNodo = new Nodo<>(dato);
    
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(cabeza); // El nuevo nodo apunta a la antigua cabeza
            cabeza = nuevoNodo;             // El nuevo nodo se convierte en la nueva cabeza
        }
        tamanno++;
    }
    

    public boolean eliminar(T dato) {
        if (cabeza == null) return false;

        // Caso especial: eliminar la cabeza
        if (cabeza.getDato().equals(dato)) {
            cabeza = cabeza.getSiguiente();
            tamanno--;
            return true;
        }

        // Buscar en el resto de la lista
        Nodo<T> actual = cabeza;
        while (actual.getSiguiente() != null && !actual.getSiguiente().getDato().equals(dato)) {
            actual = actual.getSiguiente();
        }

        if (actual.getSiguiente() != null) {
            actual.setSiguiente(actual.getSiguiente().getSiguiente());
            tamanno--;
            return true;
        }
        return false;
    }

    public void agregarDespuesDe(T datoExistente, T nuevoDato) {
        Nodo<T> nodoExistente = buscar(datoExistente);

        if (nodoExistente == null) {
            throw new IllegalArgumentException("Dato no encontrado en la lista");
        }

        Nodo<T> nuevoNodo = new Nodo<>(nuevoDato);
        nuevoNodo.setSiguiente(nodoExistente.getSiguiente());
        nodoExistente.setSiguiente(nuevoNodo);
        tamanno++;
    }
    
    public void agregarAntesDe(T datoExistente, T nuevoDato) {
        if (cabeza == null) {
            throw new IllegalStateException("La lista está vacía");
        }

        // Caso especial: si el nodo a encontrar es la cabeza
        if (cabeza.getDato().equals(datoExistente)) {
            agregarAlInicio(nuevoDato);
            return;
        }

        Nodo<T> actual = cabeza;
        while (actual.getSiguiente() != null) {
            if (actual.getSiguiente().getDato().toString().equals(datoExistente.toString())) {
                Nodo<T> nuevoNodo = new Nodo<>(nuevoDato);
                nuevoNodo.setSiguiente(actual.getSiguiente());
                actual.setSiguiente(nuevoNodo);
                tamanno++;
                return;
            }
            actual = actual.getSiguiente();
        }
        throw new IllegalArgumentException("Dato no encontrado en la lista");
    }

    // ---------------------- Búsqueda ----------------------
    public Nodo<T> buscar(T dato) {
        Nodo<T> actual = cabeza;
        while (actual != null) {
            if (actual.getDato().toString().equals(dato.toString())) {
                return actual; // Retorna el nodo si lo encuentra
            }
            actual = actual.getSiguiente();
        }
        return null; // Retorna null si no lo encuentra
    }

    public boolean contiene(T dato) {
        Nodo<T> actual = cabeza;
        while (actual != null) {
            if (actual.getDato().equals(dato)) {
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false;
    }

    // ---------------------- Utilidades ----------------------
    public boolean estaVacia() {
        return cabeza == null;
    }

    public int getTamanno() {
        return tamanno;
    }

    public void imprimir() {
        Nodo<T> actual = cabeza;
        while (actual != null) {
            System.out.print(actual + (actual.getSiguiente() != null ? " -> " : ""));
            actual = actual.getSiguiente();
        }
        System.out.println();
    }

    // ---------------------- Iterador Básico ----------------------
    public Iterador<T> iterador() {
        return new Iterador<>(cabeza);
    }

    public static class Iterador<T> {
        private Nodo<T> actual;

        public Iterador(Nodo<T> cabeza) {
            this.actual = cabeza;
        }

        public boolean tieneSiguiente() {
            return actual != null;
        }

        public T siguiente() {
            if (!tieneSiguiente()) {
                throw new IllegalStateException("No hay más elementos");
            }
            T dato = actual.getDato();
            actual = actual.getSiguiente();
            return dato;
        }
    }
}
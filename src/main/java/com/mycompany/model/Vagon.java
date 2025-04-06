package com.mycompany.model;

import java.util.Arrays;

public class Vagon {
    private String nombre_vagon;
    private Cultivo[] cultivos;
    private int valor;

    public Vagon(String nombre_vagon, Cultivo[] cultivos){
        this.cultivos = cultivos;
        this.nombre_vagon = nombre_vagon;
        this.valor = getValor();
    }

    public Cultivo[] getCultivos() {
        return cultivos;
    }

    public void setCultivos(Cultivo[] cultivos) {
        this.cultivos = cultivos;
    }

    public int getValor() {
        int valor = 0;
        for (Cultivo cultivo : cultivos){
            valor += cultivo.getPrecio();
        }
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "\nVagon{" +
                "nombre_vagon='" + nombre_vagon + '\'' +
                ",\n cultivos=" + Arrays.toString(cultivos) +
                ",\n valor=" + valor +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Vagon vagon = (Vagon) obj;
        return this.nombre_vagon.equalsIgnoreCase(vagon.nombre_vagon); // Comparación por nombre
    }

    @Override
    public int hashCode() {
        return nombre_vagon.toLowerCase().hashCode(); // Consistencia con equals
    }
}

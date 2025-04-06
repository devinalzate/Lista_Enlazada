package com.mycompany.model;

import java.util.Arrays;

public class Vagon {
    private String nombre_vagon;
    private Cultivo[] cultivos;
    private int valor;

    public Vagon(String nombre_vagon, Cultivo[] cultivos){
        this.cultivos = cultivos;
        this.nombre_vagon = nombre_vagon;
    }

    public Cultivo[] getCultivos() {
        return cultivos;
    }

    public void setCultivos(Cultivo[] cultivos) {
        this.cultivos = cultivos;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Vagon{" +
                "nombre_vagon='" + nombre_vagon + '\'' +
                ", cultivos=" + Arrays.toString(cultivos) +
                ", valor=" + valor +
                '}';
    }
}

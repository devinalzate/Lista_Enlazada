package com.mycompany.model;

public class Vagon {
    private Cultivo[] cultivos;
    private int valor;

    public Vagon(){

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
}

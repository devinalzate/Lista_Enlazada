/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

/**
 *
 * @author devapps
 */
public class Cultivo {
    protected String epocaDeSiembra;
    protected String cosechaAdecuada;
    protected String exposicionAlSol; // valores posibles: "sol", "sol/sombra", "sombra"
    protected String loteDeCultivo;
    public int precio;

    public Cultivo(String epocaDeSiembra, String cosechaAdecuada, String exposicionAlSol, String loteDeCultivo, int precio) {
        this.epocaDeSiembra = epocaDeSiembra;
        this.cosechaAdecuada = cosechaAdecuada;
        this.exposicionAlSol = exposicionAlSol;
        this.loteDeCultivo = loteDeCultivo;
        this.precio = precio;
    }


    public String getLoteDeCultivo() {
        return loteDeCultivo;
    }

    public void setLoteDeCultivo(String loteDeCultivo) {
        this.loteDeCultivo = loteDeCultivo;
    }

    public String getExposicionAlSol() {
        return exposicionAlSol;
    }

    public void setExposicionAlSol(String exposicionAlSol) {
        this.exposicionAlSol = exposicionAlSol;
    }

    public String getCosechaAdecuada() {
        return cosechaAdecuada;
    }

    public void setCosechaAdecuada(String cosechaAdecuada) {
        this.cosechaAdecuada = cosechaAdecuada;
    }

    public String getEpocaDeSiembra() {
        return epocaDeSiembra;
    }

    public void setEpocaDeSiembra(String epocaDeSiembra) {
        this.epocaDeSiembra = epocaDeSiembra;
    }

    public int getPrecio() {return precio;}

    public void setPrecio(int precio) {this.precio = precio;}

    @Override
    public String toString() {
        return "Cultivo{" +
                "epocaDeSiembra='" + epocaDeSiembra + '\'' +
                ", cosechaAdecuada='" + cosechaAdecuada + '\'' +
                ", exposicionAlSol='" + exposicionAlSol + '\'' +
                ", loteDeCultivo='" + loteDeCultivo + '\'' +
                ", precio=" + precio +
                '}';
    }
}

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
    protected String plaga; // según el tipo de cultivo, puede ser null
    public int precio;

    public Cultivo(String epocaDeSiembra, String cosechaAdecuada, String exposicionAlSol, String loteDeCultivo, String plaga, int precio) {
        this.epocaDeSiembra = epocaDeSiembra;
        this.cosechaAdecuada = cosechaAdecuada;
        this.exposicionAlSol = exposicionAlSol;
        this.loteDeCultivo = loteDeCultivo;
        this.plaga = plaga;
        this.precio = precio;
    }

    public String getPlaga() {
        return plaga;
    }

    public void setPlaga(String plaga) {
        this.plaga = plaga;
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

    @Override
    public String toString() {
        return "Cultivo{" +
                "epocaDeSiembra='" + epocaDeSiembra + '\'' +
                ", cosechaAdecuada='" + cosechaAdecuada + '\'' +
                ", exposicionAlSol='" + exposicionAlSol + '\'' +
                ", loteDeCultivo='" + loteDeCultivo + '\'' +
                ", plaga='" + plaga + '\'' +
                ", precio=" + precio +
                '}';
    }
}

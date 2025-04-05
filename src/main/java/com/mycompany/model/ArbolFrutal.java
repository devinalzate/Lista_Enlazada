package com.mycompany.model;

// Subclases concretas de Regadio
public class ArbolFrutal extends Regadio {
    public ArbolFrutal(String epocaDeSiembra, String cosechaAdecuada, String exposicionAlSol, String loteDeCultivo, String plaga,
                       int frecuenciaDeRiego, double necesidadDeAgua, String nombreCultivo) {
        super(epocaDeSiembra, cosechaAdecuada, exposicionAlSol, loteDeCultivo, plaga, nombreCultivo);
    }
}

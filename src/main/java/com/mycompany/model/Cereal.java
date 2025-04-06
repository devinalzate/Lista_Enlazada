package com.mycompany.model;

// Subclases concretas de Secano
public class Cereal extends Secano {
    public static final int precio = 10;

    public Cereal(String epocaDeSiembra, String cosechaAdecuada, String exposicionAlSol, String loteDeCultivo, String materialIndustrial) {
        super(epocaDeSiembra, cosechaAdecuada, exposicionAlSol, loteDeCultivo, materialIndustrial);
    }
}


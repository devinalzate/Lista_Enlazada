package com.mycompany.model;

// Subclases concretas de Secano
public class Cereal extends Secano {

    public Cereal(String epocaDeSiembra, String cosechaAdecuada, String exposicionAlSol, String loteDeCultivo, String nombreCultivo) {
        super(epocaDeSiembra, cosechaAdecuada, exposicionAlSol, loteDeCultivo, nombreCultivo);
        calcularMaterialIndustrial();
    }

    @Override
    public void calcularMaterialIndustrial() {
        switch (nombreCultivo.toLowerCase()) {
            case "trigo":
            case "maiz":
            case "centeno":
                materialIndustrial = "Cosechadora";
                break;
            case "avena":
                materialIndustrial = "Empaquetadora";
                break;
            default:
                materialIndustrial = "Empaquetadora y Cosechadora";
        }
    }
}


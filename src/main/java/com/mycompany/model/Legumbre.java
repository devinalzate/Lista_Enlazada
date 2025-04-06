package com.mycompany.model;

public class Legumbre extends Secano {

    public Legumbre(String epocaDeSiembra, String cosechaAdecuada, String exposicionAlSol, String loteDeCultivo, String nombreCultivo) {
        super(epocaDeSiembra, cosechaAdecuada, exposicionAlSol, loteDeCultivo, nombreCultivo);
        calcularMaterialIndustrial();
    }

    @Override
    public void calcularMaterialIndustrial() {
        switch (nombreCultivo.toLowerCase()) {
            case "garbanzo":
                materialIndustrial = "Cosechadora y Empaquetadora";
                break;
            case "lenteja":
            case "alubia":
                materialIndustrial = "Cosechadora";
                break;
            default:
                materialIndustrial = "Empaquetadora y Cosechadora";
        }
    }


}


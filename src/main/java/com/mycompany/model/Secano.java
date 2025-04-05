package com.mycompany.model;



public abstract class Secano extends Cultivo {
    protected String materialIndustrial;

    public Secano(String epocaDeSiembra, String cosechaAdecuada, String exposicionAlSol,
                  String loteDeCultivo, String nombreCultivo) {
        super(epocaDeSiembra, cosechaAdecuada, exposicionAlSol, loteDeCultivo, null);
        this.materialIndustrial = calcularMaterialIndustrial(nombreCultivo);
    }

    private String calcularMaterialIndustrial(String nombreCultivo) {
        switch (nombreCultivo.toLowerCase()) {
            case "trigo":
            case "maíz":
            case "avena":
            case "centeno":
                return "Cosechadora";
            case "garbanzo":
            case "lenteja":
            case "alubia":
                return "Empaquetadora";
            default:
                return "Equipo estándar";
        }
    }
}


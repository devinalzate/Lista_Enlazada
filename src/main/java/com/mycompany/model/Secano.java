package com.mycompany.model;



public abstract class Secano extends Cultivo {
    protected String materialIndustrial;
    protected String nombreCultivo;
    public static final int precio = 15;

    public Secano(String epocaDeSiembra, String cosechaAdecuada, String exposicionAlSol,
                  String loteDeCultivo, String nombreCultivo) {
        super(epocaDeSiembra, cosechaAdecuada, exposicionAlSol, loteDeCultivo, precio);
        this.nombreCultivo = nombreCultivo;
    }

    public abstract void calcularMaterialIndustrial();

    @Override
    public String toString() {
        return "Secano{" +
                "epocaDeSiembra='" + epocaDeSiembra + '\'' +
                ", cosechaAdecuada='" + cosechaAdecuada + '\'' +
                ", exposicionAlSol='" + exposicionAlSol + '\'' +
                ", loteDeCultivo='" + loteDeCultivo + '\'' +
                ", precio=" + precio +
                ", materialIndustrial='" + materialIndustrial + '\'' +
                '}';
    }
}


package com.mycompany.model;

public abstract class Regadio extends Cultivo {
    protected int frecuenciaDeRiego; // veces por semana
    protected double necesidadDeAgua; // litros/m²

    public Regadio(String epocaDeSiembra, String cosechaAdecuada, String exposicionAlSol,
                   String loteDeCultivo, String plaga, String nombreCultivo, int frecuenciaDeRiego, double necesidadDeAgua) {
        super(epocaDeSiembra, cosechaAdecuada, exposicionAlSol, loteDeCultivo, plaga);
        this.frecuenciaDeRiego = frecuenciaDeRiego;
        this.necesidadDeAgua = necesidadDeAgua;
        calcularParametrosDeRiego(nombreCultivo);
    }

    public abstract void calcularParametrosDeRiego(String nombreCultivo);
}


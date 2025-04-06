package com.mycompany.model;

public abstract class Regadio extends Cultivo {
    protected int frecuenciaDeRiego; // veces por semana
    protected double necesidadDeAgua; // litros/m²
    protected String plaga;
    protected String nombreCultivo;
    public static final int precio = 10;

    public Regadio(String epocaDeSiembra, String cosechaAdecuada, String exposicionAlSol,
                   String loteDeCultivo, String plaga, String nombreCultivo) {
        super(epocaDeSiembra, cosechaAdecuada, exposicionAlSol, loteDeCultivo, precio);
        this.plaga = plaga;
        this.nombreCultivo = nombreCultivo;
    }

    public abstract void calcularParametrosDeRiego();

    @Override
    public String toString() {
        return "Regadio{" +
                "epocaDeSiembra='" + epocaDeSiembra + '\'' +
                ", cosechaAdecuada='" + cosechaAdecuada + '\'' +
                ", exposicionAlSol='" + exposicionAlSol + '\'' +
                ", loteDeCultivo='" + loteDeCultivo + '\'' +
                ", precio=" + precio +
                ", plaga='" + plaga + '\'' +
                ", frecuenciaDeRiego=" + frecuenciaDeRiego +
                ", necesidadDeAgua=" + necesidadDeAgua +
                '}';
    }
}


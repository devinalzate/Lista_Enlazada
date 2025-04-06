package com.mycompany.model;

// Subclases concretas de Regadio
public class ArbolFrutal extends Regadio {
    public static final int precio = 15;

    public ArbolFrutal(String epocaDeSiembra, String cosechaAdecuada, String exposicionAlSol, String loteDeCultivo, String plaga,
                       int frecuenciaDeRiego, double necesidadDeAgua, String nombreCultivo) {
        super(epocaDeSiembra, cosechaAdecuada, exposicionAlSol, loteDeCultivo, plaga, nombreCultivo, frecuenciaDeRiego, necesidadDeAgua);
    }

    @Override
    public void calcularParametrosDeRiego(String nombreCultivo) {
        switch (nombreCultivo.toLowerCase()) {
            //Arbol frutal
            case "manzano":
            case "cerezo":
            case "ciruelo":
                this.frecuenciaDeRiego = 1;
                this.necesidadDeAgua = 8.0;
                break;
            default:
                this.frecuenciaDeRiego = 2;
                this.necesidadDeAgua = 5.0;
        }
    }
}

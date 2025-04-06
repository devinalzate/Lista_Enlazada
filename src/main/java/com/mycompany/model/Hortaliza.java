package com.mycompany.model;

public class Hortaliza extends Regadio {
    public static final int precio = 5;

    public Hortaliza(String epocaDeSiembra, String cosechaAdecuada, String exposicionAlSol, String loteDeCultivo, String plaga,
                     int frecuenciaDeRiego, double necesidadDeAgua, String nombreDeCultivo) {
        super(epocaDeSiembra, cosechaAdecuada, exposicionAlSol, loteDeCultivo, plaga, nombreDeCultivo, frecuenciaDeRiego, necesidadDeAgua);
    }

    @Override
    public void calcularParametrosDeRiego(String nombreCultivo) {
        switch (nombreCultivo.toLowerCase()) {
            //Hortaliza
            case "tomate":
            case "pimiento":
            case "acelga":
                this.frecuenciaDeRiego = 3;
                this.necesidadDeAgua = 6.0;
                break;
            case "lechuga":
            case "vaina":
                this.frecuenciaDeRiego = 2;
                this.necesidadDeAgua = 4.5;
                break;
            default:
                this.frecuenciaDeRiego = 2;
                this.necesidadDeAgua = 5.0;
        }
    }
}

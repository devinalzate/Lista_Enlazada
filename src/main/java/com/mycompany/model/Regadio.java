package com.mycompany.model;

public abstract class Regadio extends Cultivo {
    protected int frecuenciaDeRiego; // veces por semana
    protected double necesidadDeAgua; // litros/m²

    public Regadio(String epocaDeSiembra, String cosechaAdecuada, String exposicionAlSol,
                   String loteDeCultivo, String plaga, String nombreCultivo) {
        super(epocaDeSiembra, cosechaAdecuada, exposicionAlSol, loteDeCultivo, plaga);
        calcularParametrosDeRiego(nombreCultivo);
    }

    private void calcularParametrosDeRiego(String nombreCultivo) {
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


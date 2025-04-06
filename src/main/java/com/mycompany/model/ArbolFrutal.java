package com.mycompany.model;

// Subclases concretas de Regadio
public class ArbolFrutal extends Regadio {

    public ArbolFrutal(String epocaDeSiembra, String cosechaAdecuada, String exposicionAlSol, String loteDeCultivo, String plaga,
                       String nombreCultivo) {
        super(epocaDeSiembra, cosechaAdecuada, exposicionAlSol, loteDeCultivo, plaga, nombreCultivo);
        calcularParametrosDeRiego();
    }

    @Override
    public void calcularParametrosDeRiego() {
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

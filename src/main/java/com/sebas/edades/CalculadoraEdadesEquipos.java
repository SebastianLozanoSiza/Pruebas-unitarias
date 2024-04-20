package com.sebas.edades;

public class CalculadoraEdadesEquipos {

    public double calcularPromedioEdadesEquipo(int[] edadesEquipo) {
        int sumaEdades = 0;
        for (int edad : edadesEquipo) {
            sumaEdades += edad;
        }
        return (double) sumaEdades / edadesEquipo.length;
    }
}

package com.upc.superarte;

public class Psicologo extends Empleado{
    private boolean tiemploCompleto;

    public Psicologo(String dni, String nombre, int edad, String codigoTrabajador, double sueldo, boolean tiemploCompleto) {
        super(dni, nombre, edad, codigoTrabajador, sueldo);
        this.tiemploCompleto = tiemploCompleto;
    }

    @Override
    public double calcularSueldo() {
        return 0;
    }

    public boolean isTiemploCompleto() {
        return tiemploCompleto;
    }

    public void setTiemploCompleto(boolean tiemploCompleto) {
        this.tiemploCompleto = tiemploCompleto;
    }
}

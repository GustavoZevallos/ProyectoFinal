package com.upc.superarte;

public abstract class Empleado {
    private String dni;
    private String nombre;
    private int edad;
    private String codigoTrabajador;


    public Empleado(String dni, String nombre, int edad, String codigoTrabajador ) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.codigoTrabajador = codigoTrabajador;

    }

    public abstract double calcularSueldo();

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCodigoTrabajador() {
        return codigoTrabajador;
    }

    public void setCodigoTrabajador(String codigoTrabajador) {
        this.codigoTrabajador = codigoTrabajador;
    }

}

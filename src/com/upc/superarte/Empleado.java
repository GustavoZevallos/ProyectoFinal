package com.upc.superarte;

public abstract class Empleado {
    private String dni;
    private String nombre;
    private int edad;
    private String codigoTrabajador;
    private double sueldo;

    public Empleado(String dni, String nombre, int edad, String codigoTrabajador, double sueldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.codigoTrabajador = codigoTrabajador;
        this.sueldo = sueldo;
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

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}

package com.upc.superarte;

public class Paciente {
    private String dni;
    private String nombre;
    private int edad;
    private int telefono;
    private Historial historial;
    private String nombreApoderado;

    public Paciente(String dni, String nombre, int edad, int telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }

    public Paciente(String dni, String nombre, int edad, int telefono,  String nombreApoderado) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.nombreApoderado = nombreApoderado;
    }

    public void asignarHistorial(String codigo){
        this.historial = new Historial(codigo);
    }

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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Historial getHistorial() {
        return historial;
    }

    public void setHistorial(Historial historial) {
        this.historial = historial;
    }

    public String getNombreApoderado() {
        return nombreApoderado;
    }

    public void setNombreApoderado(String nombreApoderado) {
        this.nombreApoderado = nombreApoderado;
    }
}

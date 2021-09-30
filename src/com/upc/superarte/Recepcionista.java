package com.upc.superarte;

public class Recepcionista extends Empleado{
    public Recepcionista(String dni, String nombre, int edad, String codigoTrabajador, double sueldo) {
        super(dni, nombre, edad, codigoTrabajador, sueldo);
    }

    @Override
    public double calcularSueldo() {
        return 0;
    }

    public Sesion asignarSesion(){
        return null;
    }

    public Paciente buscarPaciente(){
        return null;
    }
}

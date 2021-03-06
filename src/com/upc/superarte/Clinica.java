package com.upc.superarte;

import java.util.ArrayList;
import java.util.List;

public class Clinica {
    private List<Paciente> pacientes;
    private List<Empleado> empleados;
    private static Clinica clinica = new Clinica();

    private Clinica() {
        this.pacientes = new ArrayList<>();
        this.empleados = new ArrayList<>();
    }

    public void registrarEmpleado(Empleado empleado){
        this.empleados.add(empleado);
    }
    public void asignarSesion(Paciente paciente, Psicologo psicologo, String codigoSesion, String tipoSesion, String horaInicio, String horaFin, String fecha){
        paciente.getHistorial().registrarSesion(codigoSesion,tipoSesion,psicologo,horaInicio,horaFin,fecha);
    }
    public void registrarPacientes(Paciente paciente){
        this.pacientes.add(paciente);
    }

    public static Clinica getInstance(){
        return clinica;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
}

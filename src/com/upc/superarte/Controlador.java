package com.upc.superarte;

public class Controlador {
    private Clinica clinica;
    private Vista vista;

    public Controlador() {
        clinica =  Clinica.getInstance();
        vista = new Vista();
    }

    public Paciente obtenerPaciente (String... arg) {
        Paciente paciente = Factoria.dameObjetoP(arg);
        clinica.registrarPacientes(paciente);
        return paciente;
    }
    public Empleado obtenerEmpleado(String... arg) {
        Empleado empleado = Factoria.dameObjetoE(arg);
        clinica.registrarEmpleado(empleado);
        return empleado;
    }

    public void asignarSesion(Paciente paciente, Psicologo psicologo, String... arg){
        clinica.asignarSesion(paciente,psicologo,arg[2],arg[3],arg[4],arg[5],arg[6]);
    }

    public Clinica getClinica() {
        return clinica;
    }

    public void setClinica(Clinica clinica) {
        this.clinica = clinica;
    }

    public Vista getVista() {
        return vista;
    }

    public void setVista(Vista vista) {
        this.vista = vista;
    }
}


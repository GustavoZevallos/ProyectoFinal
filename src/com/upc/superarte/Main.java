package com.upc.superarte;

public class Main {
    public static void main(String[] args) {

        Clinica superArte = Clinica.getInstance();
        Controlador controlador = new Controlador();

        Empleado psicologo = controlador.obtenerEmpleado("PS","45678912","Maria Cruzate","30","001","Tiempo Completo");
        Empleado psicologo1 = controlador.obtenerEmpleado("PS","47895033","Maricielo Valenzuela","25","002","Tiempo Parcial");
        Empleado administrador = controlador.obtenerEmpleado("ADM","56453242","Pedro Perez","32","004");
        Paciente paciente = controlador.obtenerPaciente("MA","72372827","Sandro Salas","19","910293843");
        Paciente paciente1 = controlador.obtenerPaciente("ME","76354232","Vanessa Rojas", "12", "998276532","Viviana Hernandez");


        // Asignacion de Sesiones
        controlador.asignarSesion(paciente1, (Psicologo)psicologo1, "1234","Sesión adolecentes","12:00","13:00","01/10/2021");
        controlador.asignarSesion(paciente,(Psicologo)psicologo,"1111","Sesión niños","15:00","16:00","02/10/2021");
        controlador.asignarSesion(paciente,(Psicologo)psicologo,"2222","Sesión niños","15:00","16:00","02/10/2021");

        // Impresion de empleados
        for(Empleado p: superArte.getEmpleados()){
            System.out.println(p.toString());
        }


        System.out.println(psicologo1.getNombre() + " sueldo= " + psicologo1.calcularSueldo());
        System.out.println(psicologo.getNombre() + " sueldo= " + psicologo.calcularSueldo());


    }
}

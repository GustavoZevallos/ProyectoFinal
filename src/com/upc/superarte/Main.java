package com.upc.superarte;

public class Main {
    public static void main(String[] args) {

        Clinica superArte = Clinica.getInstance();

        Empleado psicologo = new Psicologo("45678912","Maria Cruzate",30,"001","Tiempo Completo");
        //Empleado empleado1 = new Psicologo("47895033")
        Empleado recepcionista = new Recepcionista("72349834","Lucrecia Vizarreta",50,"003");
        Empleado administrador = new Administrador("56453242","Pedro Perez",32,"004");
        Paciente paciente = new Paciente("72372827","Sandro Salas",19,"910293843");


        superArte.registrarEmpleado(psicologo);
        superArte.registrarEmpleado(administrador);
        superArte.registrarEmpleado(recepcionista);

        ((Recepcionista)recepcionista).registrarPaciente(paciente);

        for(Empleado p: superArte.getEmpleados()){
            System.out.println(p.toString());
        }
    }
}

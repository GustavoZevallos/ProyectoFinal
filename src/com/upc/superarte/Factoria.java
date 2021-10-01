package com.upc.superarte;

public class Factoria {

    public static Empleado dameObjetoE(String... arg) {
        Empleado empleado = null;
        switch (arg[0]) {
            case "PS":
                empleado = new Psicologo(arg[1], arg[2], Integer.parseInt(arg[3]), arg[4], arg[5]);
                break;
            case "ADM":
                empleado = new Administrador(arg[1], arg[2], Integer.parseInt(arg[3]), arg[4]);
                break;
        }
        return empleado;
    }

    public static Paciente dameObjetoP(String... arg) {
        Paciente paciente = null;
        switch (arg[0]) {
            case "MA":
                paciente = new Paciente(arg[1], arg[2], Integer.parseInt(arg[3]), arg[4]);
                break;
            case "ME":
                paciente = new Paciente(arg[1], arg[2], Integer.parseInt(arg[3]), arg[4], arg[5]);
                break;
        }
        return paciente;
    }
}

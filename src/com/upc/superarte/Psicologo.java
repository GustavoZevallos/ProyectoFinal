package com.upc.superarte;

public class Psicologo extends Empleado{
    private String tipoPsicologo;


    public Psicologo(String dni, String nombre, int edad, String codigoTrabajador, String tipoPsicologo) {
        super(dni, nombre, edad, codigoTrabajador);
        this.tipoPsicologo = tipoPsicologo;
    }

    @Override
    public double calcularSueldo() {
        double sueldo=0;
        if (tipoPsicologo.equals("Tiempo Parcial")){
            for (Paciente p: Clinica.getInstance().getPacientes()){
                for (Sesion s: p.getHistorial().getSesiones()){
                    if (s.getPsicologo().equals(this)){
                        sueldo = sueldo + (s.obtenerCostoTipoSesion()*0.20);
                    }
                }
            }
        } else if (tipoPsicologo.equals("Tiempo Completo")){
            sueldo = Utilitario.SUELDO_FIJO_PSICOLOGO_TC;
        }
        return sueldo;
    }

    public String getTipoPsicologo() {
        return tipoPsicologo;
    }

    public void setTipoPsicologo(String tipoPsicologo) {
        this.tipoPsicologo = tipoPsicologo;
    }
}

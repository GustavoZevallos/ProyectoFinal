package com.upc.superarte;

public class Sesion {
    private String codigoSesion;
    private String tipoSesion;
    private Psicologo psicologo;
    private String horario;

    public Sesion(String codigoSesion, String tipoSesion, Psicologo psicologo, String horario) {
        this.codigoSesion = codigoSesion;
        this.tipoSesion = tipoSesion;
        this.psicologo = psicologo;
        this.horario = horario;
    }

    public void cambiarHorario(){
    }

    public double obtenerCostoTipoSesion(){
        double costo =1;
        switch (this.tipoSesion){
            case "Sesión niños":
                costo =50;
                break;
            case "Sesión adolecentes":
                costo =50;
                break;
            case "Sesión adulto mayor":
                costo=60;
                break;
            case "Sesión pareja":
                costo=70;
                break;
        }
        return costo;
    }

    public String getTipoSesion() {
        return tipoSesion;
    }

    public void setTipoSesion(String tipoSesion) {
        this.tipoSesion = tipoSesion;
    }

    public String getCodigoSesion() {
        return codigoSesion;
    }

    public void setCodigoSesion(String codigoSesion) {
        this.codigoSesion = codigoSesion;
    }


    public Psicologo getPsicologo() {
        return psicologo;
    }

    public void setPsicologo(Psicologo psicologo) {
        this.psicologo = psicologo;
    }


    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}

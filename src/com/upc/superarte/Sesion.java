package com.upc.superarte;

public class Sesion {
    private String codigoSesion;
    private String tipoSesion;
    private Psicologo psicologo;
    private String horaInicio;
    private String horaFin;
    private String fecha;

    public Sesion(String codigoSesion, String tipoSesion, Psicologo psicologo, String horaInicio, String horaFin, String fecha) {
        this.codigoSesion = codigoSesion;
        this.tipoSesion = tipoSesion;
        this.psicologo = psicologo;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.fecha = fecha;
    }

    public void cambiarHorario() {
    }

    public double obtenerCostoTipoSesion() {
        double costo = 1;
        switch (this.tipoSesion) {
            case "Sesión niños":
                costo = 50;
                break;
            case "Sesión adolecentes":
                costo = 50;
                break;
            case "Sesión adulto mayor":
                costo = 60;
                break;
            case "Sesión pareja":
                costo = 70;
                break;
        }
        return costo;
    }

    public String getCodigoSesion() {
        return codigoSesion;
    }

    public void setCodigoSesion(String codigoSesion) {
        this.codigoSesion = codigoSesion;
    }

    public String getTipoSesion() {
        return tipoSesion;
    }

    public void setTipoSesion(String tipoSesion) {
        this.tipoSesion = tipoSesion;
    }

    public Psicologo getPsicologo() {
        return psicologo;
    }

    public void setPsicologo(Psicologo psicologo) {
        this.psicologo = psicologo;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}

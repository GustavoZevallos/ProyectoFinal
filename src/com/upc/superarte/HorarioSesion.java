package com.upc.superarte;

public class HorarioSesion {
    private String horaInicio;
    private String horaFin;
    private String fecha;

    public HorarioSesion(String horaInicio, String horaFin, String fecha) {
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.fecha = fecha;
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

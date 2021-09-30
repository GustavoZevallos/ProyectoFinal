package com.upc.superarte;

public class Sesion {
    private String codigoSesion;
    private TipoSesion tipoSesion;
    private Psicologo psicologo;
    private boolean costo;
    private String horario;

    public Sesion(String codigoSesion, TipoSesion tipoSesion, Psicologo psicologo, boolean costo, String horario) {
        this.codigoSesion = codigoSesion;
        this.tipoSesion = tipoSesion;
        this.psicologo = psicologo;
        this.costo = costo;
        this.horario = horario;
    }

    public void cambiarHorario(){

    }

    public double calcularCosto(){
        return 0;
    }

    public String getCodigoSesion() {
        return codigoSesion;
    }

    public void setCodigoSesion(String codigoSesion) {
        this.codigoSesion = codigoSesion;
    }

    public TipoSesion getTipoSesion() {
        return tipoSesion;
    }

    public void setTipoSesion(TipoSesion tipoSesion) {
        this.tipoSesion = tipoSesion;
    }

    public Psicologo getPsicologo() {
        return psicologo;
    }

    public void setPsicologo(Psicologo psicologo) {
        this.psicologo = psicologo;
    }

    public boolean isCosto() {
        return costo;
    }

    public void setCosto(boolean costo) {
        this.costo = costo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}

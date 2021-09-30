package com.upc.superarte;

public class TipoSesion {
    private String tipoSesion;
    private String codSesion;
    private double pareja;

    public TipoSesion(String tipoSesion, String codSesion, double pareja) {
        this.tipoSesion = tipoSesion;
        this.codSesion = codSesion;
        this.pareja = pareja;
    }

    public String getTipoSesion() {
        return tipoSesion;
    }

    public void setTipoSesion(String tipoSesion) {
        this.tipoSesion = tipoSesion;
    }

    public String getCodSesion() {
        return codSesion;
    }

    public void setCodSesion(String codSesion) {
        this.codSesion = codSesion;
    }

    public double getPareja() {
        return pareja;
    }

    public void setPareja(double pareja) {
        this.pareja = pareja;
    }
}

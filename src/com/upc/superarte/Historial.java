package com.upc.superarte;

import java.util.List;

public class Historial {
    private String codigo;
    private List<Sesion> sesiones;

    public Historial(String codigo, List<Sesion> sesiones) {
        this.codigo = codigo;
        this.sesiones = sesiones;
    }

    public void registrarSesion(){

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Sesion> getSesiones() {
        return sesiones;
    }

    public void setSesiones(List<Sesion> sesiones) {
        this.sesiones = sesiones;
    }
}

package com.upc.superarte;

import java.util.ArrayList;
import java.util.List;

public class Historial {
    private String codigo;
    private List<Sesion> sesiones;

    public Historial(String codigo) {
        this.codigo = codigo;
        this.sesiones = new ArrayList<>();
    }

    public void registrarSesion(String codigoSesion,String tipoSesion, Psicologo psicologo, String horario){
        Sesion sesion = new Sesion(codigoSesion,tipoSesion,psicologo,horario);
        this.sesiones.add(sesion);
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

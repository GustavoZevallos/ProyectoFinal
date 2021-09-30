package com.upc.superarte;

import java.util.List;

public class Administrador extends Empleado{
    private List<Pago> pagos;

    public Administrador(String dni, String nombre, int edad, String codigoTrabajador, double sueldo, List<Pago> pagos) {
        super(dni, nombre, edad, codigoTrabajador, sueldo);
        this.pagos = pagos;
    }

    @Override
    public double calcularSueldo() {
        return 0;
    }

    public String asignarCargo(){
        return null;
    }
    public String buscarEmpleado(){
        return null;
    }

    public List<Pago> getPagos() {
        return pagos;
    }

    public void setPagos(List<Pago> pagos) {
        this.pagos = pagos;
    }
}

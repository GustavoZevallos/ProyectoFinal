package com.upc.superarte;

import java.util.ArrayList;
import java.util.List;

public class Administrador extends Empleado{
    private List<Pago> pagos;

    public Administrador(String dni, String nombre, int edad, String codigoTrabajador, double sueldo, List<Pago> pagos) {
        super(dni, nombre, edad, codigoTrabajador, sueldo);
        this.pagos = new ArrayList<>();
    }

    @Override
    public double calcularSueldo() {
        return Utilitario.SUELDO_FIJO_ADMINISTRADOR;
    }

    public void registrarPago (String razon, double monto, String fechapago){
        Pago pago = new Pago(razon,monto,fechapago);
        this.pagos.add(pago);
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

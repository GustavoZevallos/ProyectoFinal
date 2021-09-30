package com.upc.superarte;

public class Pago {
    private String razon;
    private double monto;
    public String fechapago;

    public Pago(String razon, double monto, String fechapago) {
        this.razon = razon;
        this.monto = monto;
        this.fechapago = fechapago;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getFechapago() {
        return fechapago;
    }

    public void setFechapago(String fechapago) {
        this.fechapago = fechapago;
    }
}

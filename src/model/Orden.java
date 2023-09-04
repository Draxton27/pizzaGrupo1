package model;

import java.util.Date;

public class Orden {
    private Integer id;
    private Cliente cliente;
    private Sucursal sucursal;
    private Date fecha;
    private double subTotal;
    private double montoTotal;
    private DetalleOrden detalle;

    public Orden() {};

    public Orden(Integer id, Cliente cliente, Sucursal sucursal, Date fecha, double subTotal, double montoTotal, String detalle) {
        this.id = id;
        this.cliente = cliente;
        this.sucursal = sucursal;
        this.fecha = fecha;
        this.subTotal = subTotal;
        this.montoTotal = montoTotal;
        this.detalle = detalle;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
}

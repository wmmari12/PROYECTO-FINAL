/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.time.LocalDate;


public class Venta {
    
    private int idVenta;
    private LocalDate fecha;
    private Cliente cliente;
    private boolean estado;

    public Venta() {
    }

    public Venta(int idVenta, LocalDate fecha, Cliente cliente, boolean estado) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.cliente = cliente;
        this.estado = estado;
    }

    public Venta(LocalDate fecha, Cliente cliente, boolean estado) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.estado = estado;
    }

    public Venta(LocalDate fecha, Cliente cliente) {
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public Venta(int idVenta, LocalDate fecha, Cliente cliente) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.cliente = cliente;
    }
    
    

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    

    @Override
    public String toString() {
        return "Venta Nº " + idVenta ;
    }
    
    
    
}

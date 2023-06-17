/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.time.LocalDate;
import java.util.logging.Logger;


public class Venta {
    
    private int idVenta;
    private LocalDate fecha;
    private int idCliente;
    private boolean estado;

    public Venta() {
    }

    public Venta(int idVenta, LocalDate fecha, int idCliente, boolean estado) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.idCliente = idCliente;
        this.estado = estado;
    }

    public Venta(LocalDate fecha, int idCliente, boolean estado) {
        this.fecha = fecha;
        this.idCliente = idCliente;
        this.estado = estado;
    }

    public Venta(LocalDate fecha, int idCliente) {
        this.fecha = fecha;
        this.idCliente = idCliente;    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
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

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "Venta{" + "idVenta=" + idVenta + ", fecha=" + fecha + ", idCliente=" + idCliente + ", estado=" + estado + '}';
    }
    
    
    
}

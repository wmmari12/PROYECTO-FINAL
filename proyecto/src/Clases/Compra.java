/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.time.LocalDate;


public class Compra {
    
    private int idCompra;
    private LocalDate fecha;
    private Proveedor proveedor;//idproveedor como en la BD;
    private boolean estado;

    public Compra() {
    }

    public Compra(int idCompra, LocalDate fecha, Proveedor proveedor, boolean estado) {
        this.idCompra = idCompra;
        this.fecha = fecha;
        this.proveedor = proveedor;
        this.estado = estado;
    }

    public Compra(LocalDate fecha, Proveedor proveedor, boolean estado) {
        this.fecha = fecha;
        this.proveedor = proveedor;
        this.estado = estado;
    }

    public Compra(LocalDate fecha, Proveedor proveedor) {
        this.fecha = fecha;
        this.proveedor = proveedor;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
    @Override
    public String toString() {
        String estadoStr = estado ? "" : " (anulada)";
        return "Compra Nro. "+ idCompra+estadoStr;
    }

    
}

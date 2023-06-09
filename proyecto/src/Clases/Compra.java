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
    private int idProveedor;//idproveedor como en la BD;
    private boolean estado;

    public Compra() {
    }

    public Compra(int idCompra, LocalDate fecha, int idProveedor, boolean estado) {
        this.idCompra = idCompra;
        this.fecha = fecha;
        this.idProveedor = idProveedor;
        this.estado = estado;
    }

    public Compra(LocalDate fecha, int idProveedor, boolean estado) {
        this.fecha = fecha;
        this.idProveedor = idProveedor;
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
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

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    @Override
    public String toString() {
        return "Compra" + " "+ idCompra + " "+ fecha + " " + idProveedor + " "+ estado;
    }

    
}

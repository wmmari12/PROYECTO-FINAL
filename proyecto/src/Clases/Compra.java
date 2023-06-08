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
    private int iDventa;

    public Compra() {
    }

    public Compra(int idCompra, LocalDate fecha, int iDventa) {
        this.idCompra = idCompra;
        this.fecha = fecha;
        this.iDventa = iDventa;
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

    public int getiDventa() {
        return iDventa;
    }

    public void setiDventa(int iDventa) {
        this.iDventa = iDventa;
    }

    
}

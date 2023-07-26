/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sise.entity;

/**
 *
 * @author fclou
 */
public class Alquiler {
    
    private int codigo;
    private String dniConductor;
    private String auto;
    private String fecha;
    private int diasAlquiler;
    private double precioDia;

    public Alquiler() {
    }

    public Alquiler(int codigo, String dniConductor, String auto, String fecha, int diasAlquiler, double precioDia) {
        this.codigo = codigo;
        this.dniConductor = dniConductor;
        this.auto = auto;
        this.fecha = fecha;
        this.diasAlquiler = diasAlquiler;
        this.precioDia = precioDia;
    }

    public double getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(double precioDia) {
        this.precioDia = precioDia;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDniConductor() {
        return dniConductor;
    }

    public void setDniConductor(String dniConductor) {
        this.dniConductor = dniConductor;
    }

    public String getAuto() {
        return auto;
    }

    public void setAuto(String auto) {
        this.auto = auto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getDiasAlquiler() {
        return diasAlquiler;
    }

    public void setDiasAlquiler(int diasAlquiler) {
        this.diasAlquiler = diasAlquiler;
    }
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Presentacion.Modelo.Tabs;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author almoreno
 */
@Entity
@Table(name = "Proceso")
public class Proceso implements Serializable {

    @Id()
    @Column(name = "idPro")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdPro;
    @Column(name = "nombrePro")
    private String NombresPro;
    @Column(name = "descripcionPro")
    private String DescripcionPro;
    @Column(name = "estadoPro")
    private boolean EstadoPro;
    @Column(name = "colorPro")
    private String ColorPro;
    @Column(name = "cumplimientoPro")
    private double CumplimientoPro;

    @OneToMany(mappedBy = "proceso")
    private Set<SubProceso> SubProcesos;

    public Proceso() {
    }

    public Proceso(String NombresPro, String DescripcionPro, boolean EstadoPro, String ColorPro, double CumplimientoPro) {
        this.NombresPro = NombresPro;
        this.DescripcionPro = DescripcionPro;
        this.EstadoPro = EstadoPro;
        this.ColorPro = ColorPro;
        this.CumplimientoPro = CumplimientoPro;
    }

    public Proceso(Long IdPro, String NombresPro, String DescripcionPro, boolean EstadoPro, String ColorPro, double CumplimientoPro) {
        this.IdPro = IdPro;
        this.NombresPro = NombresPro;
        this.DescripcionPro = DescripcionPro;
        this.EstadoPro = EstadoPro;
        this.ColorPro = ColorPro;
        this.CumplimientoPro = CumplimientoPro;
    }

    public Long getIdPro() {
        return IdPro;
    }

    public void setIdPro(Long IdPro) {
        this.IdPro = IdPro;
    }

    public String getNombresPro() {
        return NombresPro;
    }

    public void setNombresPro(String NombresPro) {
        this.NombresPro = NombresPro;
    }

    public String getDescripcionPro() {
        return DescripcionPro;
    }

    public void setDescripcionPro(String DescripcionPro) {
        this.DescripcionPro = DescripcionPro;
    }

    public boolean isEstadoPro() {
        return EstadoPro;
    }

    public void setEstadoPro(boolean EstadoPro) {
        this.EstadoPro = EstadoPro;
    }

    public String getColorPro() {
        return ColorPro;
    }

    public void setColorPro(String ColorPro) {
        this.ColorPro = ColorPro;
    }

    public double getCumplimientoPro() {
        return CumplimientoPro;
    }

    public void setCumplimientoPro(double CumplimientoPro) {
        this.CumplimientoPro = CumplimientoPro;
    }

    public Set<SubProceso> getSubProcesos() {
        return SubProcesos;
    }

    public void setSubProcesos(Set<SubProceso> SubProcesos) {
        this.SubProcesos = SubProcesos;
    }

    @Override
    public String toString() {
        return "Proceso{" + "IdPro=" + IdPro + ", NombresPro=" + NombresPro + ", DescripcionPro=" + DescripcionPro + ", EstadoPro=" + EstadoPro + ", ColorPro=" + ColorPro + ", CumplimientoPro=" + CumplimientoPro + '}';
    }

}

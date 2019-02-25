/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotusQuality.Modelo.Tabs;

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

    @OneToMany(mappedBy = "Proceso")
    Set<SubProceso> SubProcesos;

    public Proceso() {
    }

    public Proceso(String NombresPro, String DescripcionPro, boolean EstadoPro) {
        this.NombresPro = NombresPro;
        this.DescripcionPro = DescripcionPro;
        this.EstadoPro = EstadoPro;
    }

    public Proceso(Long IdPro, String NombresPro, String DescripcionPro, boolean EstadoPro) {
        this.IdPro = IdPro;
        this.NombresPro = NombresPro;
        this.DescripcionPro = DescripcionPro;
        this.EstadoPro = EstadoPro;
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

    @Override
    public String toString() {
        return "Proceso{" + "IdPro=" + IdPro + ", NombresPro=" + NombresPro + ", DescripcionPro=" + DescripcionPro + ", EstadoPro=" + EstadoPro + '}';
    }

}

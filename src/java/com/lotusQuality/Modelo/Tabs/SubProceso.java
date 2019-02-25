/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotusQuality.Modelo.Tabs;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author almoreno
 */
public class SubProceso implements Serializable {

    @Id()
    @Column(name = "idsPro")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdsPro;
    @Column(name = "nombresPro")
    private String NombresPro;
    @Column(name = "descripcionsPro")
    private String DescripcionsPro;
    @Column(name = "estadosPro")
    private boolean EstadosPro;

    @ManyToOne(optional = false)
    @JoinColumn(name = "idPro")
    private Proceso Proceso;

    @OneToMany(mappedBy = "SubProceso")
    Set<Actividad> Actividades;

    public SubProceso() {
    }

    public SubProceso(String nombresPro, String descripcionsPro, boolean estadosPro) {
        this.NombresPro = nombresPro;
        this.DescripcionsPro = descripcionsPro;
        this.EstadosPro = estadosPro;
    }

    public SubProceso(Long idsPro, String nombresPro, String descripcionsPro, boolean estadosPro) {
        this.IdsPro = idsPro;
        this.NombresPro = nombresPro;
        this.DescripcionsPro = descripcionsPro;
        this.EstadosPro = estadosPro;
    }

    public Long getIdsPro() {
        return IdsPro;
    }

    public void setIdRol(Long IdsPro) {
        this.IdsPro = IdsPro;
    }

    public String getNombresPro() {
        return NombresPro;
    }

    public void setNombresPro(String nombresPro) {
        this.NombresPro = nombresPro;
    }

    public String getDescripcionsPro() {
        return DescripcionsPro;
    }

    public void setDescripcionsPro(String descripcionsPro) {
        this.DescripcionsPro = descripcionsPro;
    }

    public boolean isEstadosPro() {
        return EstadosPro;
    }

    public void setEstadosPro(boolean estadosPro) {
        this.EstadosPro = estadosPro;
    }

    @Override
    public String toString() {
        return "SubProceso{" + "IdsPro=" + IdsPro + ", NombresPro=" + NombresPro + ", DescripcionsPro=" + DescripcionsPro + ", EstadosPro=" + EstadosPro + '}';
    }

}

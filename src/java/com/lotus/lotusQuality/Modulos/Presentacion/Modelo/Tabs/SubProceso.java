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
@Table(name = "SubProceso")
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

    @ManyToOne(optional = true)
    @JoinColumn(name = "idPro")
    private Proceso proceso;

    @OneToMany(mappedBy = "subProceso")
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

    public SubProceso(Long IdsPro, String NombresPro, String DescripcionsPro, boolean EstadosPro, Proceso proceso, Set<Actividad> Actividades) {
        this.IdsPro = IdsPro;
        this.NombresPro = NombresPro;
        this.DescripcionsPro = DescripcionsPro;
        this.EstadosPro = EstadosPro;
        this.proceso = proceso;
        this.Actividades = Actividades;
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

    public Proceso getProceso() {
        return proceso;
    }

    public void setProceso(Proceso proceso) {
        this.proceso = proceso;
    }

    public Set<Actividad> getActividades() {
        return Actividades;
    }

    public void setActividades(Set<Actividad> Actividades) {
        this.Actividades = Actividades;
    }

    @Override
    public String toString() {
        return "SubProceso{" + "IdsPro=" + IdsPro + ", NombresPro=" + NombresPro + ", DescripcionsPro=" + DescripcionsPro + ", EstadosPro=" + EstadosPro + ", proceso=" + proceso + ", Actividades=" + Actividades + '}';
    }



}

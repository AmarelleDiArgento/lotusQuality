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
@Table(name = "Actividad")
public class Actividad implements Serializable {

    @Id()
    @Column(name = "idAct")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdAct;
    @Column(name = "nombreAct")
    private String NombreAct;
    @Column(name = "descripcionAct")
    private String DescripcionAct;
    @Column(name = "estadoAct")
    private boolean EstadoAct;

    @ManyToOne(optional = true)
    @JoinColumn(name = "idsPro")
    private SubProceso subProceso;

    @OneToMany(mappedBy = "actividad")
    private Set<Tarea> Tareas;

    public Actividad() {
    }

    public Actividad(String NombreAct, String DescripcionAct, boolean EstadoAct) {
        this.NombreAct = NombreAct;
        this.DescripcionAct = DescripcionAct;
        this.EstadoAct = EstadoAct;
    }

    public Actividad(Long IdAct, String NombreAct, String DescripcionAct, boolean EstadoAct) {
        this.IdAct = IdAct;
        this.NombreAct = NombreAct;
        this.DescripcionAct = DescripcionAct;
        this.EstadoAct = EstadoAct;
    }

    public Actividad(Long IdAct, String NombreAct, String DescripcionAct, boolean EstadoAct, SubProceso subProceso, Set<Tarea> Tareas) {
        this.IdAct = IdAct;
        this.NombreAct = NombreAct;
        this.DescripcionAct = DescripcionAct;
        this.EstadoAct = EstadoAct;
        this.subProceso = subProceso;
        this.Tareas = Tareas;
    }

    public Long getIdAct() {
        return IdAct;
    }

    public void setIdAct(Long IdAct) {
        this.IdAct = IdAct;
    }

    public String getNombreAct() {
        return NombreAct;
    }

    public void setNombreAct(String NombreAct) {
        this.NombreAct = NombreAct;
    }

    public String getDescripcionAct() {
        return DescripcionAct;
    }

    public void setDescripcionAct(String DescripcionAct) {
        this.DescripcionAct = DescripcionAct;
    }

    public boolean isEstadoAct() {
        return EstadoAct;
    }

    public void setEstadoAct(boolean EstadoAct) {
        this.EstadoAct = EstadoAct;
    }

    public SubProceso getSubProceso() {
        return subProceso;
    }

    public void setSubProceso(SubProceso subProceso) {
        this.subProceso = subProceso;
    }

    public Set<Tarea> getTareas() {
        return Tareas;
    }

    public void setTareas(Set<Tarea> Tareas) {
        this.Tareas = Tareas;
    }

    @Override
    public String toString() {
        return "Actividad{" + "IdAct=" + IdAct + ", NombreAct=" + NombreAct + ", DescripcionAct=" + DescripcionAct + ", EstadoAct=" + EstadoAct + ", subProceso=" + subProceso + ", Tareas=" + Tareas + '}';
    }

}

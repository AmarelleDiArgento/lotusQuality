/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Presentacion.Modelo.Tabs;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author almoreno
 */
@Entity
@Table(name = "Tarea")
public class Tarea implements Serializable {

    @Id()
    @Column(name = "idTar")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdTar;
    @Column(name = "nombreTar")
    private String NombreTar;
    @Column(name = "descripcionTar")
    private String DescripcionTar;
    @Column(name = "estadoTar")
    private boolean EstadoTar;

    @ManyToOne(optional = true)
    @JoinColumn(name = "idAct")
    private Actividad actividad;

    public Tarea() {
    }

    public Tarea(String NombreTar, String DescripcionTar, boolean EstadoTar) {
        this.NombreTar = NombreTar;
        this.DescripcionTar = DescripcionTar;
        this.EstadoTar = EstadoTar;
    }

    public Tarea(Long IdTar, String NombreTar, String DescripcionTar, boolean EstadoTar) {
        this.IdTar = IdTar;
        this.NombreTar = NombreTar;
        this.DescripcionTar = DescripcionTar;
        this.EstadoTar = EstadoTar;
    }

    public Tarea(Long IdTar, String NombreTar, String DescripcionTar, boolean EstadoTar, Actividad actividad) {
        this.IdTar = IdTar;
        this.NombreTar = NombreTar;
        this.DescripcionTar = DescripcionTar;
        this.EstadoTar = EstadoTar;
        this.actividad = actividad;
    }

    public Long getIdTar() {
        return IdTar;
    }

    public void setIdTar(Long IdTar) {
        this.IdTar = IdTar;
    }

    public String getNombreTar() {
        return NombreTar;
    }

    public void setNombreTar(String NombreTar) {
        this.NombreTar = NombreTar;
    }

    public String getDescripcionTar() {
        return DescripcionTar;
    }

    public void setDescripcionTar(String DescripcionTar) {
        this.DescripcionTar = DescripcionTar;
    }

    public boolean isEstadoTar() {
        return EstadoTar;
    }

    public void setEstadoTar(boolean EstadoTar) {
        this.EstadoTar = EstadoTar;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }

    @Override
    public String toString() {
        return "Tarea{" + "IdTar=" + IdTar + ", NombreTar=" + NombreTar + ", DescripcionTar=" + DescripcionTar + ", EstadoTar=" + EstadoTar + ", actividad=" + actividad + '}';
    }

}

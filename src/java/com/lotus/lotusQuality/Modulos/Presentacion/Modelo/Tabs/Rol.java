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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author almoreno
 */
@Entity
@Table(name = "Rol")
public class Rol implements Serializable {

    @Id()
    @Column(name = "idRol")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdRol;
    @Column(name = "nombreRol")
    private String NombreRol;
    @Column(name = "descripcionRol")
    private String DescripcionRol;
    @Column(name = "estadoRol")
    private boolean EstadoRol;

    @OneToMany(mappedBy = "Rol")
    Set<Usuario> usuarios;

    public Rol() {
    }

    public Rol(String NombreRol, String DescripcionRol, boolean EstadoRol) {
        this.NombreRol = NombreRol;
        this.DescripcionRol = DescripcionRol;
        this.EstadoRol = EstadoRol;
    }

    public Rol(Long IdRol, String NombreRol, String DescripcionRol, boolean EstadoRol) {
        this.IdRol = IdRol;
        this.NombreRol = NombreRol;
        this.DescripcionRol = DescripcionRol;
        this.EstadoRol = EstadoRol;
    }

    /**
     * @return the IdRol
     */
    public Long getIdRol() {
        return IdRol;
    }

    /**
     * @param IdRol the IdRol to set
     */
    public void setIdRol(Long IdRol) {
        this.IdRol = IdRol;
    }

    /**
     * @return the NombreRol
     */
    public String getNombreRol() {
        return NombreRol;
    }

    /**
     * @param NombreRol the NombreRol to set
     */
    public void setNombreRol(String NombreRol) {
        this.NombreRol = NombreRol;
    }

    /**
     * @return the DescripcionRol
     */
    public String getDescripcionRol() {
        return DescripcionRol;
    }

    /**
     * @param DescripcionRol the DescripcionRol to set
     */
    public void setDescripcionRol(String DescripcionRol) {
        this.DescripcionRol = DescripcionRol;
    }

    /**
     * @return the EstadoRol
     */
    public boolean isEstadoRol() {
        return EstadoRol;
    }

    /**
     * @param EstadoRol the EstadoRol to set
     */
    public void setEstadoRol(boolean EstadoRol) {
        this.EstadoRol = EstadoRol;
    }

    @Override
    public String toString() {
        return "Rol{" + "IdRol=" + IdRol + ", NombreRol=" + NombreRol + ", DescripcionRol=" + DescripcionRol + ", EstadoRol=" + EstadoRol + '}';
    }

}

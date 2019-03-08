/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Tabs;

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
@Table(name = "Monitor")
public class Monitor implements Serializable {

    @Id()
    @Column(name = "idMon")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMon;
    @Column(name = "codigoMon")
    private String codigoMon;
    @Column(name = "nombreMon")
    private String nombreMon;

    @OneToMany(mappedBy = "monitor")
    private Set<Encabezado> encabezados;

    @Override
    public String toString() {
        return "Monitor{" + "idMon=" + idMon + ", codigoMon=" + codigoMon + ", nombreMon=" + nombreMon + ", encabezados=" + encabezados + '}';
    }

    public Monitor() {
    }

    public Monitor(String codigoMon, String nombreMon, Set<Encabezado> encabezados) {
        this.codigoMon = codigoMon;
        this.nombreMon = nombreMon;
        this.encabezados = encabezados;
    }

    public Monitor(long idMon, String codigoMon, String nombreMon, Set<Encabezado> encabezados) {
        this.idMon = idMon;
        this.codigoMon = codigoMon;
        this.nombreMon = nombreMon;
        this.encabezados = encabezados;
    }

    public long getIdMon() {
        return idMon;
    }

    public void setIdMon(long idMon) {
        this.idMon = idMon;
    }

    public String getCodigoMon() {
        return codigoMon;
    }

    public void setCodigoMon(String codigoMon) {
        this.codigoMon = codigoMon;
    }

    public String getNombreMon() {
        return nombreMon;
    }

    public void setNombreMon(String nombreMon) {
        this.nombreMon = nombreMon;
    }

    public Set<Encabezado> getEncabezados() {
        return encabezados;
    }

    public void setEncabezados(Set<Encabezado> encabezados) {
        this.encabezados = encabezados;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Tabs;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author almoreno
 */
@Entity
@Table(name = "Causa")
public class Causa implements Serializable {

    @Id()
    @Column(name = "idCau")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCau;
    @Column(name = "codigoCau")
    private String codigoCau;
    @Column(name = "nombreCau")
    private String nombreCau;

    @ManyToMany(mappedBy = "causas")
    private Set<Detalle> detalles = new HashSet<>();

    @Override
    public String toString() {
        return "Causa{" + "idCau=" + idCau + ", codigoCau=" + codigoCau + ", nombreCau=" + nombreCau + ", detalles=" + detalles + '}';
    }

    public Causa() {
    }

    public Causa(String codigoCau, String nombreCau) {
        this.codigoCau = codigoCau;
        this.nombreCau = nombreCau;
    }

    public Causa(long idCau, String codigoCau, String nombreCau) {
        this.idCau = idCau;
        this.codigoCau = codigoCau;
        this.nombreCau = nombreCau;
    }

    public long getIdCau() {
        return idCau;
    }

    public void setIdCau(long idCau) {
        this.idCau = idCau;
    }

    public String getCodigoCau() {
        return codigoCau;
    }

    public void setCodigoCau(String codigoCau) {
        this.codigoCau = codigoCau;
    }

    public String getNombreCau() {
        return nombreCau;
    }

    public void setNombreCau(String nombreCau) {
        this.nombreCau = nombreCau;
    }

    public Set<Detalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(Set<Detalle> detalles) {
        this.detalles = detalles;
    }

}

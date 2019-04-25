/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Tabs;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author almoreno
 */
@Entity
@Table(name = "Tipo")
public class Tipo implements Serializable {

    @Id()
    @Column(name = "idTip")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTip;
    @Column(name = "codigoTip")
    private String codigoTip;
    @Column(name = "nombreTip")
    private String nombreTip;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "ParametrosTipo",
            joinColumns = {
                @JoinColumn(name = "idTip")},
            inverseJoinColumns = {
                @JoinColumn(name = "idPar")}
    )
    private Set<Parametro> parametros;

    @Override
    public String toString() {
        return "Tipo{" + "idTip=" + idTip + ", codigoTip=" + codigoTip + ", nombreTip=" + nombreTip + ", parametros=" + parametros + '}';
    }

    public Tipo() {
    }

    public Tipo(String codigoTip, String nombreTip) {
        this.codigoTip = codigoTip;
        this.nombreTip = nombreTip;
    }

    public Tipo(long idTip, String codigoTip, String nombreTip) {
        this.idTip = idTip;
        this.codigoTip = codigoTip;
        this.nombreTip = nombreTip;
    }

    public Set<Parametro> getProjects() {
        return parametros;
    }

    public void setProjects(Set<Parametro> parametros) {
        this.parametros = parametros;
    }

    public long getIdTip() {
        return idTip;
    }

    public void setIdTip(long idTip) {
        this.idTip = idTip;
    }

    public String getCodigoTip() {
        return codigoTip;
    }

    public void setCodigoTip(String codigoTip) {
        this.codigoTip = codigoTip;
    }

    public String getNombreTip() {
        return nombreTip;
    }

    public void setNombreTip(String nombreTip) {
        this.nombreTip = nombreTip;
    }

}

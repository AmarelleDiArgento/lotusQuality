/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Tabs;

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
@Table(name = "Novedad")
public class Novedad implements Serializable {

    @Id()
    @Column(name = "idNov")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idNov;
    @Column(name = "tituloNov")
    private String tituloNov;
    @Column(name = "descripcionNov")
    private String descripcionNov;

    @ManyToOne(optional = true)
    @JoinColumn(name = "id_programa")
    private Programa programa;

    @Override
    public String toString() {
        return "Novedad{" + "idNov=" + idNov + ", tituloNov=" + tituloNov + ", descripcionNov=" + descripcionNov + ", programa=" + programa + '}';
    }

    public Novedad() {
    }

    public Novedad(String tituloNov, String descripcionNov, Programa programa) {
        this.tituloNov = tituloNov;
        this.descripcionNov = descripcionNov;
        this.programa = programa;
    }

    public Novedad(long idNov, String tituloNov, String descripcionNov, Programa programa) {
        this.idNov = idNov;
        this.tituloNov = tituloNov;
        this.descripcionNov = descripcionNov;
        this.programa = programa;
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    public long getIdNov() {
        return idNov;
    }

    public void setIdNov(long idNov) {
        this.idNov = idNov;
    }

    public String getTituloNov() {
        return tituloNov;
    }

    public void setTituloNov(String tituloNov) {
        this.tituloNov = tituloNov;
    }

    public String getDescripcionNov() {
        return descripcionNov;
    }

    public void setDescripcionNov(String descripcionNov) {
        this.descripcionNov = descripcionNov;
    }

}

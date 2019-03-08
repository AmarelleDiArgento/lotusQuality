/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Presentacion.Modelo.Tabs;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author almoreno
 */
@Entity
@Table(name = "Evento")
public class Evento implements Serializable {

    @Id()
    @Column(name = "idEve")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IdEve;
    @Column(name = "tituloEve")
    private String TituloEve;
    @Column(name = "inicioEve")
    private Date InicioEve;
    @Column(name = "finEve")
    private Date FinEve;
    @Column(name = "colorEve")
    private String ColorEve;

    public Evento() {
    }

    public Evento(String TituloEve, Date InicioEve, Date FinEve, String ColorEve) {
        this.TituloEve = TituloEve;
        this.InicioEve = InicioEve;
        this.FinEve = FinEve;
        this.ColorEve = ColorEve;
    }

    /**
     * @return the IdEve
     */
    public long getIdEve() {
        return IdEve;
    }

    /**
     * @param IdEve the IdEve to set
     */
    public void setIdEve(long IdEve) {
        this.IdEve = IdEve;
    }

    /**
     * @return the TituloEve
     */
    public String getTituloEve() {
        return TituloEve;
    }

    /**
     * @param TituloEve the TituloEve to set
     */
    public void setTituloEve(String TituloEve) {
        this.TituloEve = TituloEve;
    }

    /**
     * @return the InicioEve
     */
    public Date getInicioEve() {
        return InicioEve;
    }

    /**
     * @param InicioEve the InicioEve to set
     */
    public void setInicioEve(Date InicioEve) {
        this.InicioEve = InicioEve;
    }

    /**
     * @return the FinEve
     */
    public Date getFinEve() {
        return FinEve;
    }

    /**
     * @param FinEve the FinEve to set
     */
    public void setFinEve(Date FinEve) {
        this.FinEve = FinEve;
    }

    /**
     * @return the ColorEve
     */
    public String getColorEve() {
        return ColorEve;
    }

    /**
     * @param ColorEve the ColorEve to set
     */
    public void setColorEve(String ColorEve) {
        this.ColorEve = ColorEve;
    }

    @Override
    public String toString() {
        return "Evento{" + "IdEve=" + IdEve + ", TituloEve=" + TituloEve + ", InicioEve=" + InicioEve + ", FinEve=" + FinEve + ", ColorEve=" + ColorEve + '}';
    }

}

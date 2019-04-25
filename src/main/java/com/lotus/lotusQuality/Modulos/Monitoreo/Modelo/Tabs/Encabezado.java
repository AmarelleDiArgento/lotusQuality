/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Tabs;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
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
import javax.persistence.Temporal;

/**
 *
 * @author almoreno
 */
@Entity
@Table(name = "Encabezado")
public class Encabezado implements Serializable {

    @Id()
    @Column(name = "idEnc")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEnc;
    private String terminalEnc;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaEnc;

    @ManyToOne(optional = true)
    @JoinColumn(name = "id_monitor")
    private Monitor monitor;

    @ManyToOne(optional = true)
    @JoinColumn(name = "id_programa")
    private Programa programa;

    private String CamaEnc;
    private String LineaEnc;
    private int CantidadEnc;

    @ManyToOne(optional = true)
    @JoinColumn(name = "id_ptoCorte")
    private PtoCorte ptoCorte;

    @OneToMany(mappedBy = "encabezado")
    private Set<Detalle> detalles;

    @Override
    public String toString() {
        return "Encabezado{" + "idEnc=" + idEnc + ", terminalEnc=" + terminalEnc + ", fechaEnc=" + fechaEnc + ", monitor=" + monitor + ", programa=" + programa + ", CamaEnc=" + CamaEnc + ", LineaEnc=" + LineaEnc + ", CantidadEnc=" + CantidadEnc + ", ptoCorte=" + ptoCorte + ", detalles=" + detalles + '}';
    }

    public Encabezado() {
    }

    public Encabezado(String terminalEnc, Date fechaEnc, Monitor monitor, Programa programa, String CamaEnc, String LineaEnc, int CantidadEnc, PtoCorte ptoCorte, Set<Detalle> detalles) {
        this.terminalEnc = terminalEnc;
        this.fechaEnc = fechaEnc;
        this.monitor = monitor;
        this.programa = programa;
        this.CamaEnc = CamaEnc;
        this.LineaEnc = LineaEnc;
        this.CantidadEnc = CantidadEnc;
        this.ptoCorte = ptoCorte;
        this.detalles = detalles;
    }

    public Encabezado(long idEnc, String terminalEnc, Date fechaEnc, Monitor monitor, Programa programa, String CamaEnc, String LineaEnc, int CantidadEnc, PtoCorte ptoCorte, Set<Detalle> detalles) {
        this.idEnc = idEnc;
        this.terminalEnc = terminalEnc;
        this.fechaEnc = fechaEnc;
        this.monitor = monitor;
        this.programa = programa;
        this.CamaEnc = CamaEnc;
        this.LineaEnc = LineaEnc;
        this.CantidadEnc = CantidadEnc;
        this.ptoCorte = ptoCorte;
        this.detalles = detalles;
    }

    public String getTerminalEnc() {
        return terminalEnc;
    }

    public void setTerminalEnc(String terminalEnc) {
        this.terminalEnc = terminalEnc;
    }

    public Date getFechaEnc() {
        return fechaEnc;
    }

    public void setFechaEnc(Date fechaEnc) {
        this.fechaEnc = fechaEnc;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    public String getCamaEnc() {
        return CamaEnc;
    }

    public void setCamaEnc(String CamaEnc) {
        this.CamaEnc = CamaEnc;
    }

    public String getLineaEnc() {
        return LineaEnc;
    }

    public void setLineaEnc(String LineaEnc) {
        this.LineaEnc = LineaEnc;
    }

    public int getCantidadEnc() {
        return CantidadEnc;
    }

    public void setCantidadEnc(int CantidadEnc) {
        this.CantidadEnc = CantidadEnc;
    }

    public PtoCorte getPtoCorte() {
        return ptoCorte;
    }

    public void setPtoCorte(PtoCorte ptoCorte) {
        this.ptoCorte = ptoCorte;
    }

    public long getIdEnc() {
        return idEnc;
    }

    public void setIdEnc(long idEnc) {
        this.idEnc = idEnc;
    }

    public Set<Detalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(Set<Detalle> detalles) {
        this.detalles = detalles;
    }

}

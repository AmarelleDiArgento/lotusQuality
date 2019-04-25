/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Tabs;

import com.lotus.lotusQuality.Modulos.Auditoria.Modelo.Tabs.Auditoria;
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
@Table(name = "Finca")
public class Finca implements Serializable {

    @Id()
    @Column(name = "idFin")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFin;
    @Column(name = "codigoFin")
    private String codigoFin;
    @Column(name = "nombreFin")
    private String nombreFin;

    @ManyToOne(optional = true)
    @JoinColumn(name = "id_Postcosecha")
    private Postcosecha postcosecha;

    @OneToMany(mappedBy = "finca")
    private Set<Programa> programadas;

    @OneToMany(mappedBy = "finca")
    private Set<Auditoria> auditorias;

    @Override
    public String toString() {
        return "Finca{" + "idFin=" + idFin + ", codigoFin=" + codigoFin + ", nombreFin=" + nombreFin + ", postcosecha=" + postcosecha + ", programadas=" + programadas + '}';
    }

    public Finca() {
    }

    public Finca(long idFin, String codigoFin, String nombreFin, Postcosecha postcosecha, Set<Programa> programadas) {
        this.idFin = idFin;
        this.codigoFin = codigoFin;
        this.nombreFin = nombreFin;
        this.postcosecha = postcosecha;
        this.programadas = programadas;
    }

    public Finca(String codigoFin, String nombreFin, Postcosecha postcosecha, Set<Programa> programadas) {
        this.codigoFin = codigoFin;
        this.nombreFin = nombreFin;
        this.postcosecha = postcosecha;
        this.programadas = programadas;
    }

    public long getIdFin() {
        return idFin;
    }

    public void setIdFin(long idFin) {
        this.idFin = idFin;
    }

    public String getCodigoFin() {
        return codigoFin;
    }

    public void setCodigoFin(String codigoFin) {
        this.codigoFin = codigoFin;
    }

    public String getNombreFin() {
        return nombreFin;
    }

    public void setNombreFin(String nombreFin) {
        this.nombreFin = nombreFin;
    }

    public Postcosecha getPostcosecha() {
        return postcosecha;
    }

    public void setPostcosecha(Postcosecha postcosecha) {
        this.postcosecha = postcosecha;
    }

    public Set<Programa> getProgramadas() {
        return programadas;
    }

    public void setProgramadas(Set<Programa> programadas) {
        this.programadas = programadas;
    }

}

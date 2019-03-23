/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Tabs;

import com.lotus.lotusQuality.Modulos.Auditoria.Modelo.Tabs.Clasificacion;
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
@Table(name = "Variedad")
public class Variedad implements Serializable {

    @Id()
    @Column(name = "idVar")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idVar;
    @Column(name = "codigoVar")
    private String codigoVar;
    @Column(name = "nombreVar")
    private String nombreVar;

    @ManyToOne(optional = true)
    @JoinColumn(name = "id_Producto")
    private Producto producto;

    @OneToMany(mappedBy = "variedad")
    private Set<Programa> programas;

    @OneToMany(mappedBy = "variedad")
    private Set<Clasificacion> clasificaciones;

    @Override
    public String toString() {
        return "Variedad{" + "idVar=" + idVar + ", codigoVar=" + codigoVar + ", nombreVar=" + nombreVar + ", producto=" + producto + '}';
    }

    public Variedad() {
    }

    public Variedad(String codigoVar, String nombreVar, Producto producto) {
        this.codigoVar = codigoVar;
        this.nombreVar = nombreVar;
        this.producto = producto;
    }

    public Variedad(long idVar, String codigoVar, String nombreVar, Producto producto) {
        this.idVar = idVar;
        this.codigoVar = codigoVar;
        this.nombreVar = nombreVar;
        this.producto = producto;
    }

    public long getIdVar() {
        return idVar;
    }

    public void setIdVar(long idVar) {
        this.idVar = idVar;
    }

    public String getCodigoVar() {
        return codigoVar;
    }

    public void setCodigoVar(String codigoVar) {
        this.codigoVar = codigoVar;
    }

    public String getNombreVar() {
        return nombreVar;
    }

    public void setNombreVar(String nombreVar) {
        this.nombreVar = nombreVar;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

}

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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author almoreno
 */
@Entity
@Table(name = "Producto")
public class Producto implements Serializable {

    @Id()
    @Column(name = "idPro")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPro;
    @Column(name = "codigoPro")
    private String codigoPro;
    @Column(name = "nombrePro")
    private String nombrePro;

    @OneToMany(mappedBy = "producto")
    private Set<Variedad> variedades;

    @OneToMany(mappedBy = "producto")
    private Set<Auditoria> auditorias;

    @Override
    public String toString() {
        return "Producto{" + "idPro=" + idPro + ", codigoPro=" + codigoPro + ", nombrePro=" + nombrePro + ", variedades=" + variedades + '}';
    }

    public Producto() {
    }

    public Producto(long idPro, String codigoPro, String nombrePro, Set<Variedad> variedades) {
        this.idPro = idPro;
        this.codigoPro = codigoPro;
        this.nombrePro = nombrePro;
        this.variedades = variedades;
    }

    public Producto(String codigoPro, String nombrePro, Set<Variedad> variedades) {
        this.codigoPro = codigoPro;
        this.nombrePro = nombrePro;
        this.variedades = variedades;
    }

    public Set<Variedad> getVariedades() {
        return variedades;
    }

    public void setVariedades(Set<Variedad> variedades) {
        this.variedades = variedades;
    }

    public long getIdPro() {
        return idPro;
    }

    public void setIdPro(long idPro) {
        this.idPro = idPro;
    }

    public String getCodigoPro() {
        return codigoPro;
    }

    public void setCodigoPro(String codigoPro) {
        this.codigoPro = codigoPro;
    }

    public String getNombrePro() {
        return nombrePro;
    }

    public void setNombrePro(String nombrePro) {
        this.nombrePro = nombrePro;
    }

}

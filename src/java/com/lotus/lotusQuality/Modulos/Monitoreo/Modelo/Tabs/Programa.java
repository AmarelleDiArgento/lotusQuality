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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author almoreno
 */
@Entity
@Table(name = "Programa")
public class Programa implements Serializable {

    @Id()
    @Column(name = "idProg")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProg;
    @Column(name = "anoProg")
    int anoProg;
    @Column(name = "SemanaProg")
    int SemanaProg;

    @ManyToOne(optional = true)
    @JoinColumn(name = "id_finca")
    Finca finca;

    @ManyToOne(optional = true)
    @JoinColumn(name = "id_variedad")
    Variedad variedad;

    @Column(name = "BloqueProg")
    String BloqueProg;
    @Column(name = "ProyeccionProg")
    int ProyeccionProg;
    @Column(name = "CantidadProg")
    int CantidadProg;
    @Column(name = "ProduccionProg")
    int ProduccionProg;
    @Column(name = "ProductividadProg")
    int ProductividadProg;

    @OneToMany(mappedBy = "programa")
    private Set<Novedad> novedades;

    @OneToMany(mappedBy = "programa")
    private Set<Encabezado> encabezados;
}

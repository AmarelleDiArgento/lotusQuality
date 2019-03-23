/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Auditoria.Modelo.Tabs;

import java.io.Serializable;
import java.util.List;
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
@Table(name = "Soporte")
public class Soporte implements Serializable {

    @Id()
    @Column(name = "idSop")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idSop;

    @OneToMany(mappedBy = "soporte")
    private Set<Item> items;

    private boolean Cumple;
    @OneToMany(mappedBy = "soporte")
    private Set<Hallazgo> hallazgos;

    @ManyToOne(optional = true)
    @JoinColumn(name = "auditoria")
    private Auditoria auditoria;

    @OneToMany(mappedBy = "soporte")
    private Set<Clasificacion> clasificaciones;

}

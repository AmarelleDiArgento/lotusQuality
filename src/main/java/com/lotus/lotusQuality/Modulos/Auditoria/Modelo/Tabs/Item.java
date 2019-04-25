/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Auditoria.Modelo.Tabs;

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
@Table(name = "Item")
public class Item implements Serializable {

    @Id()
    @Column(name = "idIte")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idIte;
    @Column(name = "tituloIte")
    private String TituloIte;
    @Column(name = "descripcionIte")
    private String DescripcionIte;
    @Column(name = "clasificaIte")
    private boolean clasificaIte;
    @Column(name = "estadoIte")
    private boolean estadoIte;

    @ManyToOne(optional = true)
    @JoinColumn(name = "capitulo")
    private Capitulo capitulo;

    @ManyToOne(optional = true)
    @JoinColumn(name = "soporte")
    private Soporte soporte;

}

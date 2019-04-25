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
@Table(name = "Capitulo")
public class Capitulo implements Serializable {

    @Id()
    @Column(name = "idCap")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCap;
    @Column(name = "tituloCap")
    private String TituloCap;
    @Column(name = "descripcionCap")
    private String DescripcionCap;
    @Column(name = "estadoCap")
    private boolean estadoCap;

    @ManyToOne(optional = true)
    @JoinColumn(name = "capitulos")
    private ListaChequeo listaChequeo;

    @OneToMany(mappedBy = "capitulo")
    private Set<Item> items;

}

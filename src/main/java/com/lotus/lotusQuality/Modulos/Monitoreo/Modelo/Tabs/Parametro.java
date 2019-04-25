/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Tabs;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author almoreno
 */
@Entity
@Table(name = "Parametro")
public class Parametro implements Serializable {

    @Id()
    @Column(name = "idPar")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPar;
    @Column(name = "codigoPar")
    private String codigoPar;
    @Column(name = "nombrePar")
    private String nombrePar;
    @Column(name = "tipoDatoPar")
    private String tipoDatoPar;
    @ManyToMany(mappedBy = "parametros")
    private Set<Tipo> tipos;

}

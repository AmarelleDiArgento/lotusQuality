/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Auditoria.Modelo.Tabs;

import java.io.Serializable;
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
@Table(name = "Hallazgo")
public class Hallazgo implements Serializable {

    @Id()
    @Column(name = "idHal")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idHal;
    @Column(name = "tituloHal")
    private String TituloHal;
    @Column(name = "descripcionHal")
    private String DescripcionHal;
    @Column(name = "estadoHal")
    private boolean estadoHal;

}

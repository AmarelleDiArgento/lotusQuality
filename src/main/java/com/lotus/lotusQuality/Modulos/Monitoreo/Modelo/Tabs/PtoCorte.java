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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author almoreno
 */
@Entity
@Table(name = "PtoCorte")
public class PtoCorte implements Serializable {

    @Id()
    @Column(name = "idpCor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idpCor;
    @Column(name = "codigopCor")
    private String codigopCor;
    @Column(name = "nombrepCor")
    private String nombrepCor;

    @OneToMany(mappedBy = "ptoCorte")
    private Set<Encabezado> encabezados;

}

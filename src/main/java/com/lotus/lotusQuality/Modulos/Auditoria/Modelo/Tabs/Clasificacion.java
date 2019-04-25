/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Auditoria.Modelo.Tabs;

import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Tabs.Variedad;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author almoreno
 */
@Entity
@Table(name = "Clasificacion")
public class Clasificacion implements Serializable {

    @Id()
    @Column(name = "idCla")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCla;

    @ManyToOne(optional = true)
    @JoinColumn(name = "soporte")
    private Soporte soporte;

    @Column(name = "tipoCla")
    private boolean tipoCla;

    @ManyToOne(optional = true)
    @JoinColumn(name = "variedad")
    private Variedad variedad;

    @Column(name = "tallosCla")
    private int tallosCla;

    @Column(name = "tllsConformesCla")
    private int tllsConformesCla;

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Auditoria.Modelo.Tabs;

import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Tabs.Finca;
import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Tabs.Producto;
import com.lotus.lotusQuality.Modulos.Presentacion.Modelo.Tabs.Usuario;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author almoreno
 */
@Entity
@Table(name = "Auditoria")
public class Auditoria implements Serializable {

    @Id()
    @Column(name = "idAud")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAud;
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "fVisita")
    private Date fVisitaAud;
    @Column(name = "fRegistro")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fRegistroAud;
    @Column(name = "noVisita")
    private int noVisitaAud;

    @ManyToOne(optional = true)
    @JoinColumn(name = "finca")
    private Finca finca;

    @Column(name = "director")
    private String directorAud;
    @Column(name = "jefe")
    private String jefeAud;
    @Column(name = "supervisor")
    private String supervisorAud;

    @ManyToOne(optional = true)
    @JoinColumn(name = "producto")
    private Producto producto;

    @ManyToOne(optional = true)
    @JoinColumn(name = "auditor")
    private Usuario auditor;

    @OneToMany(mappedBy = "auditoria")
    private Set<Soporte> soportes;

}

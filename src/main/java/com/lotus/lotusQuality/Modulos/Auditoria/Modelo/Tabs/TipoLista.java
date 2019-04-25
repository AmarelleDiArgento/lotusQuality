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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author almoreno
 */
@Entity
@Table(name = "TipoLista")
public class TipoLista implements Serializable {

    @Id()
    @Column(name = "idTiLis")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTiLis;
    @Column(name = "tituloTiLis")
    private String TituloTiLis;
    @Column(name = "descripcionTiLis")
    private String DescripcionTiLis;
    @Column(name = "estadoTiLis")
    private boolean estadoTiLis;

    @OneToMany(mappedBy = "tipoLista")
    private Set<ListaChequeo> listas;

}

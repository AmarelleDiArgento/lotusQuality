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
@Table(name = "TipoAudioria")
public class TipoAuditoria implements Serializable {

    @Id()
    @Column(name = "idTiAud")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTiAud;
    @Column(name = "tituloTiAud")
    private String TituloTiAud;
    @Column(name = "descripcionTiAud")
    private String DescripcionTiAud;
    @Column(name = "estadoTiAud")
    private boolean estadoTiAud;

}

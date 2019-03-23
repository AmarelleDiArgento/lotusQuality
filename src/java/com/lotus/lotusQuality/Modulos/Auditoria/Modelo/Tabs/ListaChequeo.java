/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Auditoria.Modelo.Tabs;

import com.lotus.lotusQuality.Modulos.Auditoria.Modelo.Interfaces.Capitulos;
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
@Table(name = "ListaChequeo")
public class ListaChequeo implements Serializable {

    @Id()
    @Column(name = "idLiChe")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idLiChe;
    @Column(name = "tituloLiChe")
    private String TituloLiChe;
    @Column(name = "descripcionLiChe")
    private String DescripcionLiChe;
    @Column(name = "estadoLiChe")
    private boolean estadoLiChe;

    @ManyToOne(optional = true)
    @JoinColumn(name = "listas")
    private TipoLista tipoLista;

    @OneToMany(mappedBy = "listaChequeo")
    private Set<Capitulo> capitulos;

}

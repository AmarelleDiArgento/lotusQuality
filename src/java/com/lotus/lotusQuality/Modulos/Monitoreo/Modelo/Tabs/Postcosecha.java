/*
 * To change this license header, choose License Headers in Postject Postperties.
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
@Table(name = "Postcosecha")
public class Postcosecha implements Serializable {

    @Id()
    @Column(name = "idPost")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPost;
    @Column(name = "codigoPost")
    private String codigoPost;
    @Column(name = "nombrePost")
    private String nombrePost;

    @OneToMany(mappedBy = "postcosecha")
    private Set<Finca> fincas;

    @Override
    public String toString() {
        return "Postcosecha{" + "idPost=" + idPost + ", codigoPost=" + codigoPost + ", nombrePost=" + nombrePost + ", fincas=" + fincas + '}';
    }

    public Postcosecha() {
    }

    public Postcosecha(String codigoPost, String nombrePost, Set<Finca> fincas) {
        this.codigoPost = codigoPost;
        this.nombrePost = nombrePost;
        this.fincas = fincas;
    }

    public Postcosecha(long idPost, String codigoPost, String nombrePost, Set<Finca> fincas) {
        this.idPost = idPost;
        this.codigoPost = codigoPost;
        this.nombrePost = nombrePost;
        this.fincas = fincas;
    }

    public long getIdPost() {
        return idPost;
    }

    public void setIdPost(long idPost) {
        this.idPost = idPost;
    }

    public String getCodigoPost() {
        return codigoPost;
    }

    public void setCodigoPost(String codigoPost) {
        this.codigoPost = codigoPost;
    }

    public String getNombrePost() {
        return nombrePost;
    }

    public void setNombrePost(String nombrePost) {
        this.nombrePost = nombrePost;
    }

    public Set<Finca> getFincas() {
        return fincas;
    }

    public void setFincas(Set<Finca> fincas) {
        this.fincas = fincas;
    }

}

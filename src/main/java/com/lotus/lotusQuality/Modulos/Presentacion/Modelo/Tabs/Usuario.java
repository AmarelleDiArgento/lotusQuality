/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Presentacion.Modelo.Tabs;

import com.lotus.lotusQuality.Modulos.Auditoria.Modelo.Tabs.Auditoria;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "Usuario")
public class Usuario implements Serializable {

    @Id
    @Column(name = "cedulaUsu")
    private String CedulaUsu;
    @Column(name = "codigoUsu")
    private String CodigoUsu;
    @Column(name = "nombreUsu")
    private String NombreUsu;
    @Column(name = "apellidoUsu")
    private String ApellidoUsu;
    @Column(name = "userUsu")
    private String UserUsu;
    @Column(name = "passUsu")
    private String PassUsu;
    @Column(name = "f_NaciUsu")
    private Date f_NaciUsu;
    @Column(name = "estadoUsu")
    private boolean EstadoUsu;

    @ManyToOne(optional = true)
    @JoinColumn(name = "idRol")
    private Rol Rol;

    @OneToMany(mappedBy = "auditor")
    private Set<Auditoria> auditorias;

    public Usuario() {
    }

    public Usuario(String CedulaUsu, String CodigoUsu, String NombreUsu, String ApellidoUsu, String UserUsu, String PassUsu, Date f_NaciUsu, boolean EstadoUsu, Rol Rol) {
        this.CedulaUsu = CedulaUsu;
        this.CodigoUsu = CodigoUsu;
        this.NombreUsu = NombreUsu;
        this.ApellidoUsu = ApellidoUsu;
        this.UserUsu = UserUsu;
        //String MD5 = DigestUtils.md5Hex(PassUsu);
        this.PassUsu = PassUsu; //MD5
        this.f_NaciUsu = f_NaciUsu;
        this.EstadoUsu = EstadoUsu;
        this.Rol = Rol;
    }

    public Rol getRol() {
        return Rol;
    }

    public void setRol(Rol Rol) {
        this.Rol = Rol;
    }

    public String getCedulaUsu() {
        return CedulaUsu;
    }

    public void setCedulaUsu(String CedulaUsu) {
        this.CedulaUsu = CedulaUsu;
    }

    public String getCodigoUsu() {
        return CodigoUsu;
    }

    public void setCodigoUsu(String CodigoUsu) {
        this.CodigoUsu = CodigoUsu;
    }

    public String getNombreUsu() {
        return NombreUsu;
    }

    public void setNombreUsu(String NombreUsu) {
        this.NombreUsu = NombreUsu;
    }

    public String getApellidoUsu() {
        return ApellidoUsu;
    }

    public void setApellidoUsu(String ApellidoUsu) {
        this.ApellidoUsu = ApellidoUsu;
    }

    public String getUserUsu() {
        return UserUsu;
    }

    public void setUserUsu(String UserUsu) {
        this.UserUsu = UserUsu;
    }

    public String getPassUsu() {
        return PassUsu;
    }

    public void setPassUsu(String PassUsu) {
        //String MD5 = DigestUtils.md5Hex(PassUsu);
        this.PassUsu = PassUsu;//MD5;
    }

    public Date getF_NaciUsu() {
        return f_NaciUsu;
    }

    public void setF_NaciUsu(Date f_NaciUsu) {
        this.f_NaciUsu = f_NaciUsu;
    }

    public boolean isEstadoUsu() {
        return EstadoUsu;
    }

    public void setEstadoUsu(boolean EstadoUsu) {
        this.EstadoUsu = EstadoUsu;
    }

    @Override
    public String toString() {
        return "Usuario{" + "CedulaUsu=" + CedulaUsu + ", CodigoUsu=" + CodigoUsu + ", NombreUsu=" + NombreUsu + ", ApellidoUsu=" + ApellidoUsu + ", UserUsu=" + UserUsu + ", PassUsu=" + PassUsu + ", f_NaciUsu=" + f_NaciUsu + ", EstadoUsu=" + EstadoUsu + ", Rol=" + Rol + '}';
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Tabs;

import java.io.Serializable;
import java.util.HashSet;
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
import javax.persistence.Table;

/**
 *
 * @author almoreno
 */
@Entity
@Table(name = "Detalles")
public class Detalle implements Serializable {

    @Id()
    @Column(name = "idDet")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDet;
    @ManyToOne(optional = true)
    @JoinColumn(name = "id_Encabezado")
    private Encabezado encabezado;

    @Column(name = "valDet1")
    private double valDet1;
    @Column(name = "valDet2")
    private double valDet2;
    @Column(name = "valDet3")
    private double valDet3;
    @Column(name = "valDet4")
    private double valDet4;
    @Column(name = "valDet5")
    private double valDet5;
    @Column(name = "valDet6")
    private double valDet6;
    @Column(name = "valDet7")
    private double valDet7;
    @Column(name = "valDet8")
    private double valDet8;
    @Column(name = "valDet9")
    private double valDet9;
    @Column(name = "valDet10")
    private double valDet10;
    @Column(name = "valDet11")
    private double valDet11;
    @Column(name = "valDet12")
    private double valDet12;
    @Column(name = "valDet13")
    private double valDet13;
    @Column(name = "valDet14")
    private double valDet14;
    @Column(name = "valDet15")
    private double valDet15;
    @Column(name = "CantidadDet")
    private int CantidadDet;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "CausaEncabezado",
            joinColumns = {
                @JoinColumn(name = "idDet")},
            inverseJoinColumns = {
                @JoinColumn(name = "idCau")}
    )
    private Set<Causa> causas = new HashSet<>();

    @Override
    public String toString() {
        return "Detalle{" + "idDet=" + idDet + ", encabezado=" + encabezado + ", valDet1=" + valDet1 + ", valDet2=" + valDet2 + ", valDet3=" + valDet3 + ", valDet4=" + valDet4 + ", valDet5=" + valDet5 + ", valDet6=" + valDet6 + ", valDet7=" + valDet7 + ", valDet8=" + valDet8 + ", valDet9=" + valDet9 + ", valDet10=" + valDet10 + ", valDet11=" + valDet11 + ", valDet12=" + valDet12 + ", valDet13=" + valDet13 + ", valDet14=" + valDet14 + ", valDet15=" + valDet15 + ", CantidadDet=" + CantidadDet + ", causas=" + causas + '}';
    }

    public Detalle() {
    }

    public Detalle(Encabezado encabezado, double valDet1, double valDet2, double valDet3, double valDet4, double valDet5, double valDet6, double valDet7, double valDet8, double valDet9, double valDet10, double valDet11, double valDet12, double valDet13, double valDet14, double valDet15, int CantidadDet) {
        this.encabezado = encabezado;
        this.valDet1 = valDet1;
        this.valDet2 = valDet2;
        this.valDet3 = valDet3;
        this.valDet4 = valDet4;
        this.valDet5 = valDet5;
        this.valDet6 = valDet6;
        this.valDet7 = valDet7;
        this.valDet8 = valDet8;
        this.valDet9 = valDet9;
        this.valDet10 = valDet10;
        this.valDet11 = valDet11;
        this.valDet12 = valDet12;
        this.valDet13 = valDet13;
        this.valDet14 = valDet14;
        this.valDet15 = valDet15;
        this.CantidadDet = CantidadDet;
    }

    public Detalle(long idDet, Encabezado encabezado, double valDet1, double valDet2, double valDet3, double valDet4, double valDet5, double valDet6, double valDet7, double valDet8, double valDet9, double valDet10, double valDet11, double valDet12, double valDet13, double valDet14, double valDet15, int CantidadDet) {
        this.idDet = idDet;
        this.encabezado = encabezado;
        this.valDet1 = valDet1;
        this.valDet2 = valDet2;
        this.valDet3 = valDet3;
        this.valDet4 = valDet4;
        this.valDet5 = valDet5;
        this.valDet6 = valDet6;
        this.valDet7 = valDet7;
        this.valDet8 = valDet8;
        this.valDet9 = valDet9;
        this.valDet10 = valDet10;
        this.valDet11 = valDet11;
        this.valDet12 = valDet12;
        this.valDet13 = valDet13;
        this.valDet14 = valDet14;
        this.valDet15 = valDet15;
        this.CantidadDet = CantidadDet;
    }

    public int getCantidadDet() {
        return CantidadDet;
    }

    public void setCantidadDet(int CantidadDet) {
        this.CantidadDet = CantidadDet;
    }

    public double getValDet1() {
        return valDet1;
    }

    public void setValDet1(double valDet1) {
        this.valDet1 = valDet1;
    }

    public double getValDet2() {
        return valDet2;
    }

    public void setValDet2(double valDet2) {
        this.valDet2 = valDet2;
    }

    public double getValDet3() {
        return valDet3;
    }

    public void setValDet3(double valDet3) {
        this.valDet3 = valDet3;
    }

    public double getValDet4() {
        return valDet4;
    }

    public void setValDet4(double valDet4) {
        this.valDet4 = valDet4;
    }

    public double getValDet5() {
        return valDet5;
    }

    public void setValDet5(double valDet5) {
        this.valDet5 = valDet5;
    }

    public double getValDet6() {
        return valDet6;
    }

    public void setValDet6(double valDet6) {
        this.valDet6 = valDet6;
    }

    public double getValDet7() {
        return valDet7;
    }

    public void setValDet7(double valDet7) {
        this.valDet7 = valDet7;
    }

    public double getValDet8() {
        return valDet8;
    }

    public void setValDet8(double valDet8) {
        this.valDet8 = valDet8;
    }

    public double getValDet9() {
        return valDet9;
    }

    public void setValDet9(double valDet9) {
        this.valDet9 = valDet9;
    }

    public double getValDet10() {
        return valDet10;
    }

    public void setValDet10(double valDet10) {
        this.valDet10 = valDet10;
    }

    public double getValDet11() {
        return valDet11;
    }

    public void setValDet11(double valDet11) {
        this.valDet11 = valDet11;
    }

    public double getValDet12() {
        return valDet12;
    }

    public void setValDet12(double valDet12) {
        this.valDet12 = valDet12;
    }

    public double getValDet13() {
        return valDet13;
    }

    public void setValDet13(double valDet13) {
        this.valDet13 = valDet13;
    }

    public double getValDet14() {
        return valDet14;
    }

    public void setValDet14(double valDet14) {
        this.valDet14 = valDet14;
    }

    public double getValDet15() {
        return valDet15;
    }

    public void setValDet15(double valDet15) {
        this.valDet15 = valDet15;
    }

    public long getIdDet() {
        return idDet;
    }

    public void setIdDet(long idDet) {
        this.idDet = idDet;
    }

    public Encabezado getEncabezado() {
        return encabezado;
    }

    public void setEncabezado(Encabezado encabezado) {
        this.encabezado = encabezado;
    }

    public Set<Causa> getCausas() {
        return causas;
    }

    public void setCausas(Set<Causa> causas) {
        this.causas = causas;
    }

}

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

    @Column(name = "valDet01")
    private double valDet01;
    @Column(name = "valDet02")
    private double valDet02;
    @Column(name = "valDet03")
    private double valDet03;
    @Column(name = "valDet04")
    private double valDet04;
    @Column(name = "valDet05")
    private double valDet05;
    @Column(name = "valDet06")
    private double valDet06;
    @Column(name = "valDet07")
    private double valDet07;
    @Column(name = "valDet08")
    private double valDet08;
    @Column(name = "valDet09")
    private double valDet09;
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
    private Set<Causa> causas;

    public Detalle() {
    }

    public Detalle(Encabezado encabezado, double valDet01, double valDet02, double valDet03, double valDet04, double valDet05, double valDet06, double valDet07, double valDet08, double valDet09, double valDet10, double valDet11, double valDet12, double valDet13, double valDet14, double valDet15, int CantidadDet, Set<Causa> causas) {
        this.encabezado = encabezado;
        this.valDet01 = valDet01;
        this.valDet02 = valDet02;
        this.valDet03 = valDet03;
        this.valDet04 = valDet04;
        this.valDet05 = valDet05;
        this.valDet06 = valDet06;
        this.valDet07 = valDet07;
        this.valDet08 = valDet08;
        this.valDet09 = valDet09;
        this.valDet10 = valDet10;
        this.valDet11 = valDet11;
        this.valDet12 = valDet12;
        this.valDet13 = valDet13;
        this.valDet14 = valDet14;
        this.valDet15 = valDet15;
        this.CantidadDet = CantidadDet;
        this.causas = causas;
    }

    public Detalle(long idDet, Encabezado encabezado, double valDet01, double valDet02, double valDet03, double valDet04, double valDet05, double valDet06, double valDet07, double valDet08, double valDet09, double valDet10, double valDet11, double valDet12, double valDet13, double valDet14, double valDet15, int CantidadDet, Set<Causa> causas) {
        this.idDet = idDet;
        this.encabezado = encabezado;
        this.valDet01 = valDet01;
        this.valDet02 = valDet02;
        this.valDet03 = valDet03;
        this.valDet04 = valDet04;
        this.valDet05 = valDet05;
        this.valDet06 = valDet06;
        this.valDet07 = valDet07;
        this.valDet08 = valDet08;
        this.valDet09 = valDet09;
        this.valDet10 = valDet10;
        this.valDet11 = valDet11;
        this.valDet12 = valDet12;
        this.valDet13 = valDet13;
        this.valDet14 = valDet14;
        this.valDet15 = valDet15;
        this.CantidadDet = CantidadDet;
        this.causas = causas;
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

    public double getValDet01() {
        return valDet01;
    }

    public void setValDet01(double valDet01) {
        this.valDet01 = valDet01;
    }

    public double getValDet02() {
        return valDet02;
    }

    public void setValDet02(double valDet02) {
        this.valDet02 = valDet02;
    }

    public double getValDet03() {
        return valDet03;
    }

    public void setValDet03(double valDet03) {
        this.valDet03 = valDet03;
    }

    public double getValDet04() {
        return valDet04;
    }

    public void setValDet04(double valDet04) {
        this.valDet04 = valDet04;
    }

    public double getValDet05() {
        return valDet05;
    }

    public void setValDet05(double valDet05) {
        this.valDet05 = valDet05;
    }

    public double getValDet06() {
        return valDet06;
    }

    public void setValDet06(double valDet06) {
        this.valDet06 = valDet06;
    }

    public double getValDet07() {
        return valDet07;
    }

    public void setValDet07(double valDet07) {
        this.valDet07 = valDet07;
    }

    public double getValDet08() {
        return valDet08;
    }

    public void setValDet08(double valDet08) {
        this.valDet08 = valDet08;
    }

    public double getValDet09() {
        return valDet09;
    }

    public void setValDet09(double valDet09) {
        this.valDet09 = valDet09;
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

    public int getCantidadDet() {
        return CantidadDet;
    }

    public void setCantidadDet(int CantidadDet) {
        this.CantidadDet = CantidadDet;
    }

    public Set<Causa> getCausas() {
        return causas;
    }

    public void setCausas(Set<Causa> causas) {
        this.causas = causas;
    }

}

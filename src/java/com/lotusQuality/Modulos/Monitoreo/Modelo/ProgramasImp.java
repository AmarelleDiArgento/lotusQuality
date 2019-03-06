/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotusQuality.Modulos.Monitoreo.Modelo;

import com.google.gson.JsonObject;
import com.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.Programas;
import com.lotusQuality.Modulos.Monitoreo.Modelo.Tabs.Programa;
import java.util.List;
import org.hibernate.Session;

public class ProgramasImp implements Programas {

    private Session session;

    public ProgramasImp(Session session) {
        this.session = session;
    }

    @Override
    public void insert(Programa o) {
        session.persist(o);

    }

    @Override
    public void update(Programa o) {
        session.update(o);

    }

    @Override
    public void delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Programa oneId(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Programa oneName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Programa> all() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JsonObject jFile(List<Programa> lo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

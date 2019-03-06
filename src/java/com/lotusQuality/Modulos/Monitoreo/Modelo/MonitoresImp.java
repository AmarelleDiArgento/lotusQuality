/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotusQuality.Modulos.Monitoreo.Modelo;

import com.google.gson.JsonObject;
import com.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.Monitores;
import com.lotusQuality.Modulos.Monitoreo.Modelo.Tabs.Monitor;
import java.util.List;
import org.hibernate.Session;

public class MonitoresImp implements Monitores {

    private Session session;

    public MonitoresImp(Session session) {
        this.session = session;
    }

    @Override
    public void insert(Monitor o) {
        session.persist(o);

    }

    @Override
    public void update(Monitor o) {
        session.update(o);

    }

    @Override
    public void delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Monitor oneId(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Monitor oneName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Monitor> all() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JsonObject jFile(List<Monitor> lo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

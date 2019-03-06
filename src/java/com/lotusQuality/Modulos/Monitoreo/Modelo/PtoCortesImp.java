/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotusQuality.Modulos.Monitoreo.Modelo;

import com.google.gson.JsonObject;
import com.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.PtoCortes;
import com.lotusQuality.Modulos.Monitoreo.Modelo.Tabs.PtoCorte;
import java.util.List;
import org.hibernate.Session;

public class PtoCortesImp implements PtoCortes {

    private Session session;

    public PtoCortesImp(Session session) {
        this.session = session;
    }

    @Override
    public void insert(PtoCorte o) {
        session.persist(o);

    }

    @Override
    public void update(PtoCorte o) {
        session.update(o);

    }

    @Override
    public void delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PtoCorte oneId(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PtoCorte oneName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PtoCorte> all() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JsonObject jFile(List<PtoCorte> lo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotusQuality.Modulos.Monitoreo.Modelo;

import com.google.gson.JsonObject;
import com.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.Tipos;
import com.lotusQuality.Modulos.Monitoreo.Modelo.Tabs.Tipo;
import java.util.List;
import org.hibernate.Session;

public class TiposImp implements Tipos {

    private Session session;

    public TiposImp(Session session) {
        this.session = session;
    }

    @Override
    public void insert(Tipo o) {
        session.persist(o);

    }

    @Override
    public void update(Tipo o) {
        session.update(o);

    }

    @Override
    public void delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Tipo oneId(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Tipo oneName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Tipo> all() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JsonObject jFile(List<Tipo> lo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

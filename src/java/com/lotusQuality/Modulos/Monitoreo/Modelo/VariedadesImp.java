/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotusQuality.Modulos.Monitoreo.Modelo;

import com.google.gson.JsonObject;
import com.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.Variedades;
import com.lotusQuality.Modulos.Monitoreo.Modelo.Tabs.Variedad;
import java.util.List;
import org.hibernate.Session;

public class VariedadesImp implements Variedades {

    private Session session;

    public VariedadesImp(Session session) {
        this.session = session;
    }

    @Override
    public void insert(Variedad o) {
        session.persist(o);

    }

    @Override
    public void update(Variedad o) {
        session.update(o);

    }

    @Override
    public void delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Variedad oneId(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Variedad oneName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Variedad> all() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JsonObject jFile(List<Variedad> lo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

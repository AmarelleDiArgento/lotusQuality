/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Monitoreo.Modelo;

import com.google.gson.JsonObject;
import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.Monitores;
import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Tabs.Monitor;
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
        Monitor m = oneId(id);
        if (m != null) {
            session.delete(m);
        }
    }

    @Override
    public Monitor oneId(Long id) {
        return (Monitor) session.get(Monitor.class, id);
    }

    @Override
    public Monitor oneName(String name) {
        return (Monitor) session.createQuery(
                "from Monitor where  NombreAct = :name")
                .setParameter("name", name).uniqueResult();
    }

    @Override
    public List<Monitor> all() {
        return (List<Monitor>) session.createQuery("from Monitor").list();
    }

    @Override
    public JsonObject jFile(List<Monitor> lo) {
        return null;
    }

}

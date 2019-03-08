/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Monitoreo.Modelo;

import com.google.gson.JsonObject;
import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.Fincas;
import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Tabs.Finca;
import java.util.List;
import org.hibernate.Session;

public class FincasImp implements Fincas {

    private Session session;

    public FincasImp(Session session) {
        this.session = session;
    }

    @Override
    public void insert(Finca o) {
        session.persist(o);

    }

    @Override
    public void update(Finca o) {
        session.update(o);

    }

    @Override
    public void delete(Long id) {
        Finca f = oneId(id);
        if (f != null) {
            session.delete(f);
        }
    }

    @Override
    public Finca oneId(Long id) {
        return (Finca) session.get(Finca.class, id);
    }

    @Override
    public Finca oneName(String name) {
        return (Finca) session.createQuery(
                "from Finca where  NombreAct = :name")
                .setParameter("name", name).uniqueResult();
    }

    @Override
    public List<Finca> all() {
        return (List<Finca>) session.createQuery("from Finca").list();
    }

    @Override
    public JsonObject jFile(List<Finca> lo) {
        return null;
    }

}

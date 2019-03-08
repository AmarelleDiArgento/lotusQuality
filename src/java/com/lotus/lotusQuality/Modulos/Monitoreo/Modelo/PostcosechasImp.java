/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Monitoreo.Modelo;

import com.google.gson.JsonObject;
import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.Postcosechas;
import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Tabs.Postcosecha;
import java.util.List;
import org.hibernate.Session;

public class PostcosechasImp implements Postcosechas {

    private Session session;

    public PostcosechasImp(Session session) {
        this.session = session;
    }

    @Override
    public void insert(Postcosecha o) {
        session.persist(o);

    }

    @Override
    public void update(Postcosecha o) {
        session.update(o);

    }

    @Override
    public void delete(Long id) {
        Postcosecha a = oneId(id);
        if (a != null) {
            session.delete(a);
        }
    }

    @Override
    public Postcosecha oneId(Long id) {
        return (Postcosecha) session.get(Postcosecha.class, id);
    }

    @Override
    public Postcosecha oneName(String name) {
        return (Postcosecha) session.createQuery(
                "from Postcosecha where  NombreAct = :name")
                .setParameter("name", name).uniqueResult();
    }

    @Override
    public List<Postcosecha> all() {
        return (List<Postcosecha>) session.createQuery("from Postcosecha").list();
    }

    @Override
    public JsonObject jFile(List<Postcosecha> lo) {
        return null;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Monitoreo.Modelo;

import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.Tipos;
import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Tabs.Tipo;
import java.util.List;
import org.hibernate.Session;

public class iTipo implements Tipos {

    private Session session;

    public iTipo(Session session) {
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
        Tipo a = oneId(id);
        if (a != null) {
            session.delete(a);
        }
    }

    @Override
    public Tipo oneId(Long id) {
        return (Tipo) session.get(Tipo.class, id);
    }

    @Override
    public Tipo oneName(String name) {
        return (Tipo) session.createQuery(
                "from Tipo where  NombreAct = :name")
                .setParameter("name", name).uniqueResult();
    }

    @Override
    public List<Tipo> all() {
        return (List<Tipo>) session.createQuery("from Tipo").list();
    }

}

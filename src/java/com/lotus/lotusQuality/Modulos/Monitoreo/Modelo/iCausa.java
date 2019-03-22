/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Monitoreo.Modelo;

import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.Causas;
import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Tabs.Causa;
import java.util.List;
import org.hibernate.Session;

public class iCausa implements Causas {

    private Session session;

    public iCausa(Session session) {
        this.session = session;
    }

    @Override
    public void insert(Causa o) {
        session.persist(o);

    }

    @Override
    public void update(Causa o) {
        session.update(o);

    }

    @Override
    public void delete(Long id) {
        Causa c = oneId(id);
        if (c != null) {
            session.delete(c);
        }
    }

    @Override
    public Causa oneId(Long id) {
        return (Causa) session.get(Causa.class, id);
    }

    @Override
    public Causa oneName(String name) {
        return (Causa) session.createQuery(
                "from Causa where  NombreAct = :name")
                .setParameter("name", name).uniqueResult();
    }

    @Override
    public List<Causa> all() {
        return (List<Causa>) session.createQuery("from Causa").list();
    }

}

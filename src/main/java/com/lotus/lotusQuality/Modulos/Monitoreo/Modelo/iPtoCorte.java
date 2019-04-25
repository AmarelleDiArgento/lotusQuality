/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Monitoreo.Modelo;

import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.PtoCortes;
import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Tabs.PtoCorte;
import java.util.List;
import org.hibernate.Session;

public class iPtoCorte implements PtoCortes {

    private Session session;

    public iPtoCorte(Session session) {
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
        PtoCorte a = oneId(id);
        if (a != null) {
            session.delete(a);
        }
    }

    @Override
    public PtoCorte oneId(Long id) {
        return (PtoCorte) session.get(PtoCorte.class, id);
    }

    @Override
    public PtoCorte oneName(String name) {
        return (PtoCorte) session.createQuery(
                "from PtoCorte where  NombreAct = :name")
                .setParameter("name", name).uniqueResult();
    }

    @Override
    public List<PtoCorte> all() {
        return (List<PtoCorte>) session.createQuery("from PtoCorte").list();
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Monitoreo.Modelo;

import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.Detalles;
import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Tabs.Detalle;
import java.util.List;
import org.hibernate.Session;

public class iDetalle implements Detalles {

    private Session session;

    public iDetalle(Session session) {
        this.session = session;
    }

    @Override
    public void insert(Detalle o) {
        session.persist(o);

    }

    @Override
    public void update(Detalle o) {
        session.update(o);

    }

    @Override
    public void delete(Long id) {
        Detalle d = oneId(id);
        if (d != null) {
            session.delete(d);
        }
    }

    @Override
    public Detalle oneId(Long id) {
        return (Detalle) session.get(Detalle.class, id);
    }

    @Override
    public Detalle oneName(String name) {
        return (Detalle) session.createQuery(
                "from Detalle where  NombreAct = :name")
                .setParameter("name", name).uniqueResult();
    }

    @Override
    public List<Detalle> all() {
        return (List<Detalle>) session.createQuery("from Detalle").list();
    }

}

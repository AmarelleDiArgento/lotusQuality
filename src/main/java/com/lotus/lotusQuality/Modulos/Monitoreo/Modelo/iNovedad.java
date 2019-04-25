/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Monitoreo.Modelo;

import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.Novedades;
import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Tabs.Novedad;
import java.util.List;
import org.hibernate.Session;

public class iNovedad implements Novedades {

    private Session session;

    public iNovedad(Session session) {
        this.session = session;
    }

    @Override
    public void insert(Novedad o) {
        session.persist(o);

    }

    @Override
    public void update(Novedad o) {
        session.update(o);

    }

    @Override
    public void delete(Long id) {
        Novedad a = oneId(id);
        if (a != null) {
            session.delete(a);
        }
    }

    @Override
    public Novedad oneId(Long id) {
        return (Novedad) session.get(Novedad.class, id);
    }

    @Override
    public Novedad oneName(String name) {
        return (Novedad) session.createQuery(
                "from Novedad where  NombreAct = :name")
                .setParameter("name", name).uniqueResult();
    }

    @Override
    public List<Novedad> all() {
        return (List<Novedad>) session.createQuery("from Novedad").list();
    }
}

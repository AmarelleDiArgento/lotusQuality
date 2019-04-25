/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Monitoreo.Modelo;

import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.Variedades;
import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Tabs.Variedad;
import java.util.List;
import org.hibernate.Session;

public class iVariedad implements Variedades {

    private Session session;

    public iVariedad(Session session) {
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
        Variedad a = oneId(id);
        if (a != null) {
            session.delete(a);
        }
    }

    @Override
    public Variedad oneId(Long id) {
        return (Variedad) session.get(Variedad.class, id);
    }

    @Override
    public Variedad oneName(String name) {
        return (Variedad) session.createQuery(
                "from Variedad where  NombreAct = :name")
                .setParameter("name", name).uniqueResult();
    }

    @Override
    public List<Variedad> all() {
        return (List<Variedad>) session.createQuery("from Variedad").list();
    }

}

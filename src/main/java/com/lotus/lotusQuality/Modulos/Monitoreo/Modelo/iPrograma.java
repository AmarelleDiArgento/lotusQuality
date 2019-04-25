/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Monitoreo.Modelo;

import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.Programas;
import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Tabs.Programa;
import java.util.List;
import org.hibernate.Session;

public class iPrograma implements Programas {

    private Session session;

    public iPrograma(Session session) {
        this.session = session;
    }

    @Override
    public void insert(Programa o) {
        session.persist(o);

    }

    @Override
    public void update(Programa o) {
        session.update(o);

    }

    @Override
    public void delete(Long id) {
        Programa a = oneId(id);
        if (a != null) {
            session.delete(a);
        }
    }

    @Override
    public Programa oneId(Long id) {
        return (Programa) session.get(Programa.class, id);
    }

    @Override
    public Programa oneName(String name) {
        return (Programa) session.createQuery(
                "from Programa where  NombreAct = :name")
                .setParameter("name", name).uniqueResult();
    }

    @Override
    public List<Programa> all() {
        return (List<Programa>) session.createQuery("from Programa").list();
    }

}

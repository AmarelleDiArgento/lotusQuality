/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Monitoreo.Modelo;

import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.Parametros;
import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Tabs.Parametro;
import java.util.List;
import org.hibernate.Session;

public class iParametro implements Parametros {

    private Session session;

    public iParametro(Session session) {
        this.session = session;
    }

    @Override
    public void insert(Parametro o) {
        session.persist(o);

    }

    @Override
    public void update(Parametro o) {
        session.update(o);

    }

    @Override
    public void delete(Long id) {
        Parametro a = oneId(id);
        if (a != null) {
            session.delete(a);
        }
    }

    @Override
    public Parametro oneId(Long id) {
        return (Parametro) session.get(Parametro.class, id);
    }

    @Override
    public Parametro oneName(String name) {
        return (Parametro) session.createQuery(
                "from Parametro where  NombreAct = :name")
                .setParameter("name", name).uniqueResult();
    }

    @Override
    public List<Parametro> all() {
        return (List<Parametro>) session.createQuery("from Parametro").list();
    }

}

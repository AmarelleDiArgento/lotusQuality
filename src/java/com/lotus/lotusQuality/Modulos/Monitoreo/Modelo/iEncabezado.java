/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Monitoreo.Modelo;

import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.Encabezados;
import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Tabs.Encabezado;
import java.util.List;
import org.hibernate.Session;

public class iEncabezado implements Encabezados {

    private Session session;

    public iEncabezado(Session session) {
        this.session = session;
    }

    @Override
    public void insert(Encabezado o) {
        session.persist(o);

    }

    @Override
    public void update(Encabezado o) {
        session.update(o);

    }

    @Override
    public void delete(Long id) {
        Encabezado e = oneId(id);
        if (e != null) {
            session.delete(e);
        }
    }

    @Override
    public Encabezado oneId(Long id) {
        return (Encabezado) session.get(Encabezado.class, id);
    }

    @Override
    public Encabezado oneName(String name) {
        return (Encabezado) session.createQuery(
                "from Encabezado where  NombreAct = :name")
                .setParameter("name", name).uniqueResult();
    }

    @Override
    public List<Encabezado> all() {
        return (List<Encabezado>) session.createQuery("from Encabezado").list();
    }

}

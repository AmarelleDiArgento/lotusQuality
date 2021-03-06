/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Presentacion.Modelo;

import com.lotus.lotusQuality.Modulos.Presentacion.Modelo.Tabs.Actividad;
import java.util.List;
import org.hibernate.Session;
import com.lotus.lotusQuality.Modulos.Presentacion.Modelo.Interfaces.Actividades;

public class ActividadesImp implements Actividades {

    private Session session;

    public ActividadesImp(Session session) {
        this.session = session;
    }

    @Override
    public void insert(Actividad o) {

        session.persist(o);

    }

    @Override
    public void update(Actividad o) {
        session.update(o);

    }

    @Override
    public void delete(Long id) {
        Actividad a = oneId(id);
        if (a != null) {
            session.delete(a);
        }
    }

    @Override
    public Actividad oneId(Long id) {
        return (Actividad) session.get(Actividad.class, id);
    }

    @Override
    public Actividad oneName(String name) {
        return (Actividad) session.createQuery(
                "from Actividad where  NombreAct = :name")
                .setParameter("name", name).uniqueResult();
    }

    @Override
    public List<Actividad> all() {
        return (List<Actividad>) session.createQuery("from Actividad").list();
    }

}

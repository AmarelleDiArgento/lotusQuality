/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Presentacion.Modelo;

import com.lotus.lotusQuality.Modulos.Presentacion.Modelo.Interfaces.Tareas;
import com.lotus.lotusQuality.Modulos.Presentacion.Modelo.Tabs.Tarea;
import java.util.List;
import org.hibernate.Session;

public class TareasImp implements Tareas {

    private Session session;

    public TareasImp(Session session) {
        this.session = session;
    }

    @Override
    public void insert(Tarea o) {

        session.persist(o);

    }

    @Override
    public void update(Tarea o) {
        session.update(o);

    }

    @Override
    public void delete(Long id) {
        Tarea t = oneId(id);
        if (t != null) {
            session.delete(t);

        }

    }

    @Override
    public Tarea oneId(Long id) {
        return (Tarea) session.get(Tarea.class, id);
    }

    @Override
    public Tarea oneName(String name) {
        return (Tarea) session.createQuery(
                "from Tarea where  NombreTar = :name")
                .setParameter("name", name).uniqueResult();

    }

    @Override
    public List<Tarea> all() {
        return (List<Tarea>) session.createQuery("from Tarea").list();
    }

}

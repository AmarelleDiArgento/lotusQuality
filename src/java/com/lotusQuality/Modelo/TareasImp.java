/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotusQuality.Modelo;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.lotusQuality.Modelo.Interfaces.Tareas;
import com.lotusQuality.Modelo.Tabs.Tarea;
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
        session.getTransaction().commit();
    }

    @Override
    public void update(Tarea o) {
        session.update(o);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Long id) {
        Tarea t = oneId(id);
        if (t != null) {
            session.delete(t);
            session.getTransaction().commit();
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

    @Override
    public JsonObject jFile(List<Tarea> lt) {
        JsonObject cJ = new JsonObject();
        JsonArray caJ = new JsonArray();

        for (Tarea t : lt) {
            JsonObject item = new JsonObject();

            item.addProperty("id", t.getIdTar());
            item.addProperty("nombre", t.getNombreTar());
            item.addProperty("descripcion", t.getDescripcionTar());
            item.addProperty("estado", t.isEstadoTar());
            item.addProperty("Actividad", t.getActividad().getNombreAct());
            caJ.add(item);
        }
        cJ.add("tareas", caJ);
        return cJ;

    }

}

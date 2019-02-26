/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotusQuality.Modelo;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.lotusQuality.Modelo.Interfaces.Eventos;
import com.lotusQuality.Modelo.Tabs.Evento;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;

public class EventoImp implements Eventos {

    private Session session;

    public EventoImp(Session session) {
        this.session = session;
    }

    @Override
    public void insert(Evento o) {

        session.persist(o);

    }

    @Override
    public void update(Evento o) {
        session.update(o);

    }

    @Override
    public void delete(Long id) {
        Evento r = oneId(id);
        if (r != null) {
            session.delete(r);

        }
    }

    @Override
    public Evento oneId(Long id) {
        return (Evento) session.get(Evento.class, id);
    }

    @Override
    public Evento oneName(String titulo) {
        return (Evento) session.createQuery(
                "from Evento where  TituloEve = :titulo")
                .setParameter("titulo", titulo).uniqueResult();
    }

    @Override
    public List<Evento> all() {
        return (List<Evento>) session.createQuery("from Evento").list();
    }

    @Override
    public JsonObject jFile(List<Evento> lo) {
        String ini;
        String fin;
        JsonObject cJ = new JsonObject();
        JsonArray caJ = new JsonArray();
// el que formatea
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");

        for (Evento e : lo) {
            JsonObject item = new JsonObject();

            item.addProperty("id", e.getIdEve());
            item.addProperty("title", e.getTituloEve());
            ini = f.format(e.getInicioEve());
            item.addProperty("start", ini);
            fin = f.format(e.getFinEve());
            item.addProperty("end", fin);
            item.addProperty("color", e.getColorEve());
            caJ.add(item);
        }
        cJ.add("events", caJ);
        return cJ;
    }

}

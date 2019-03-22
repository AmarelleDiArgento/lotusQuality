/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Presentacion.Modelo;

import com.lotus.lotusQuality.Modulos.Presentacion.Modelo.Interfaces.Eventos;
import com.lotus.lotusQuality.Modulos.Presentacion.Modelo.Tabs.Evento;
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

}

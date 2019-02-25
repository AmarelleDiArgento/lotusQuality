/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotusQuality.Modelo;

import com.google.gson.JsonObject;
import com.lotusQuality.Modelo.Interfaces.Procesos;
import com.lotusQuality.Modelo.Tabs.Proceso;
import java.util.List;
import org.hibernate.Session;

public class ProcesosImp implements Procesos {

    private Session session;

    public ProcesosImp(Session session) {
        this.session = session;
    }

    @Override
    public void insert(Proceso o) {

        session.persist(o);
        session.getTransaction().commit();

    }

    @Override
    public void update(Proceso o) {
        session.update(o);
        session.getTransaction().commit();

    }

    @Override
    public void delete(Long id) {
        Proceso p = oneId(id);
        if (p != null) {
            session.delete(p);
            session.getTransaction().commit();
        }

    }

    @Override
    public Proceso oneId(Long id) {
        return (Proceso) session.get(Proceso.class, id);

    }

    @Override
    public Proceso oneName(String name) {
        return (Proceso) session.createQuery(
                "from Proceso where  NombrePro = :name")
                .setParameter("name", name).uniqueResult();

    }

    @Override
    public List<Proceso> all() {
        return (List<Proceso>) session.createQuery("from Proceso").list();
    }

    @Override
    public JsonObject jFile(List<Proceso> lo) {
        return null;

    }

}

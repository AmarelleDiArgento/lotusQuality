/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Presentacion.Modelo;

import com.lotus.lotusQuality.Modulos.Presentacion.Modelo.Interfaces.Procesos;
import com.lotus.lotusQuality.Modulos.Presentacion.Modelo.Tabs.Proceso;
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

    }

    @Override
    public void update(Proceso o) {
        session.update(o);

    }

    @Override
    public void delete(Long id) {
        Proceso p = oneId(id);
        if (p != null) {
            session.delete(p);

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

}

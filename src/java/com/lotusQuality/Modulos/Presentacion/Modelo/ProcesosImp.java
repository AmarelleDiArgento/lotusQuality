/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotusQuality.Modulos.Presentacion.Modelo;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.lotusQuality.Modulos.Presentacion.Modelo.Interfaces.Procesos;
import com.lotusQuality.Modulos.Presentacion.Modelo.Tabs.Proceso;
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

    @Override
    public JsonObject jFile(List<Proceso> lp) {
        JsonObject cJ = new JsonObject();
        JsonArray caJ = new JsonArray();

        for (Proceso p : lp) {
            JsonObject item = new JsonObject();

            item.addProperty("id", p.getIdPro());
            item.addProperty("nombre", p.getNombresPro());
            item.addProperty("descripcion", p.getDescripcionPro());
            item.addProperty("estado", p.isEstadoPro());
            item.addProperty("color", p.getColorPro());
            item.addProperty("cumplimiento", p.getCumplimientoPro());
            caJ.add(item);
        }
        cJ.add("procesos", caJ);
        return cJ;

    }

}

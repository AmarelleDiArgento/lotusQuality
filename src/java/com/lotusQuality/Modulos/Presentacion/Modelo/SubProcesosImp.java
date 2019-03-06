/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotusQuality.Modulos.Presentacion.Modelo;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.lotusQuality.Modulos.Presentacion.Modelo.Interfaces.SubProcesos;
import com.lotusQuality.Modulos.Presentacion.Modelo.Tabs.SubProceso;
import java.util.List;
import org.hibernate.Session;

public class SubProcesosImp implements SubProcesos {

    private Session session;

    public SubProcesosImp(Session session) {
        this.session = session;
    }

    @Override
    public void insert(SubProceso o) {

        session.persist(o);

    }

    @Override
    public void update(SubProceso o) {
        session.update(o);

    }

    @Override
    public void delete(Long id) {
        SubProceso sp = oneId(id);
        if (sp != null) {
            session.delete(sp);

        }

    }

    @Override
    public SubProceso oneId(Long id) {
        return (SubProceso) session.get(SubProceso.class, id);

    }

    @Override
    public SubProceso oneName(String name) {
        return (SubProceso) session.createQuery(
                "from SubProceso where  NombresPro = :name")
                .setParameter("name", name).uniqueResult();

    }

    @Override
    public List<SubProceso> all() {
        return (List<SubProceso>) session.createQuery("from SubProceso").list();
    }

    @Override
    public JsonObject jFile(List<SubProceso> lsp) {
        JsonObject cJ = new JsonObject();
        JsonArray caJ = new JsonArray();

        for (SubProceso sp : lsp) {
            JsonObject item = new JsonObject();

            item.addProperty("id", sp.getIdsPro());
            item.addProperty("nombre", sp.getNombresPro());
            item.addProperty("descripcion", sp.getDescripcionsPro());
            item.addProperty("estado", sp.isEstadosPro());
            item.addProperty("proceso", sp.getProceso().getNombresPro());
            caJ.add(item);
        }
        cJ.add("subProcesos", caJ);
        return cJ;
    }

}

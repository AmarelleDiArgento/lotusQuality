/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Presentacion.Modelo;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.lotus.lotusQuality.Modulos.Presentacion.Modelo.Interfaces.Roles;
import com.lotus.lotusQuality.Modulos.Presentacion.Modelo.Tabs.Rol;
import java.util.List;
import org.hibernate.Session;

public class RolImp implements Roles {

    public Session session;

    public RolImp(Session session) {
        this.session = session;
    }

    @Override
    public void insert(Rol o) {

        session.persist(o);

    }

    @Override
    public void update(Rol o) {
        session.update(o);
    }

    @Override
    public void delete(Long id) {
        Rol r = oneId(id);
        if (r != null) {
            session.delete(r);
        }
    }

    @Override
    public Rol oneId(Long id) {
        return (Rol) session.get(Rol.class, id);
    }

    @Override
    public Rol oneName(String name) {
        return (Rol) session.createQuery(
                "from Rol where  nombreRol = :name")
                .setParameter("name", name).uniqueResult();
    }

    @Override
    public List<Rol> all() {
        return (List<Rol>) session.createQuery("from Rol").list();
    }

    @Override
    public JsonObject jFile(List<Rol> lo) {
        JsonObject cJ = new JsonObject();
        JsonArray caJ = new JsonArray();

        for (Rol r : lo) {
            JsonObject item = new JsonObject();

            item.addProperty("id", r.getIdRol());
            item.addProperty("nombre", r.getNombreRol());
            item.addProperty("descripcion", r.getDescripcionRol());
            item.addProperty("estado", r.isEstadoRol());
            caJ.add(item);
        }
        cJ.add("roles", caJ);
        return cJ;
    }

}

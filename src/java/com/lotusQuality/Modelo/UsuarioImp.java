/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotusQuality.Modelo;

import com.google.gson.JsonObject;
import com.lotusQuality.Modelo.Interfaces.Usuarios;
import com.lotusQuality.Modelo.Tabs.Usuario;
import java.util.List;
import org.hibernate.Session;

public class UsuarioImp implements Usuarios {

    private Session session;

    public UsuarioImp(Session session) {
        this.session = session;
    }

    @Override
    public void insert(Usuario o) {
        session.save(o);
        session.getTransaction().commit();
    }

    @Override
    public void update(Usuario o) {
        session.update(o);
        session.getTransaction().commit();
    }

    @Override
    public void delete(String id) {
        Usuario u = oneId(id);
        if (u != null) {
            session.delete(u);
            session.getTransaction().commit();
        }
    }

    @Override
    public Usuario oneId(String id) {
        return (Usuario) session.get(Usuario.class, id);
    }

    @Override
    public Usuario oneName(String name) {
        return (Usuario) session.createQuery(
                "from Usuario where  nombreUsu = :name")
                .setParameter("name", name).uniqueResult();
    }

    @Override
    public List<Usuario> all() {
        return (List<Usuario>) session.createQuery("from Usuario").list();
    }

    @Override
    public JsonObject jFile(List<Usuario> lo) {
        return null;

    }

}

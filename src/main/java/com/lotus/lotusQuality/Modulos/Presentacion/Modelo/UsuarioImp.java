/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Presentacion.Modelo;

import com.lotus.lotusQuality.Modulos.Presentacion.Modelo.Interfaces.Usuarios;
import com.lotus.lotusQuality.Modulos.Presentacion.Modelo.Tabs.Usuario;
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

    }

    @Override
    public void update(Usuario o) {
        session.update(o);

    }

    @Override
    public void delete(String id) {
        Usuario u = oneId(id);
        if (u != null) {
            session.delete(u);

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

}

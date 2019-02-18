/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotusQuality.Modelo;

import com.lotusQuality.Modelo.Interfaces.Roles;
import com.lotusQuality.Modelo.Tabs.Rol;
import java.util.List;
import org.hibernate.Session;

public class RolImp implements Roles {

    private Session session;

    public RolImp(Session session) {
        this.session = session;
    }

    @Override
    public void insert(Rol o) {

        session.persist(o);
        session.getTransaction().commit();

    }

    @Override
    public void update(Rol o) {
        session.update(o);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Long id) {
        Rol r = oneId(id);
        if (r != null) {
            session.delete(r);
            session.getTransaction().commit();
        }
    }

    @Override
    public Rol oneId(Long id) {
        return (Rol) session.createQuery(
                "from Rol where  idRol = :id")
                .setParameter("id", id).uniqueResult();
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

}

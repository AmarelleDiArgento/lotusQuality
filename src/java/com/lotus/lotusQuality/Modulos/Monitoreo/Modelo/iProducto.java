/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Monitoreo.Modelo;

import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.Productos;
import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Tabs.Producto;
import java.util.List;
import org.hibernate.Session;

public class iProducto implements Productos {

    private Session session;

    public iProducto(Session session) {
        this.session = session;
    }

    @Override
    public void insert(Producto o) {
        session.persist(o);

    }

    @Override
    public void update(Producto o) {
        session.update(o);

    }

    @Override
    public void delete(Long id) {
        Producto a = oneId(id);
        if (a != null) {
            session.delete(a);
        }
    }

    @Override
    public Producto oneId(Long id) {
        return (Producto) session.get(Producto.class, id);
    }

    @Override
    public Producto oneName(String name) {
        return (Producto) session.createQuery(
                "from Producto where  NombreAct = :name")
                .setParameter("name", name).uniqueResult();
    }

    @Override
    public List<Producto> all() {
        return (List<Producto>) session.createQuery("from Producto").list();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Configuracion;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author freya
 */
public abstract class Configuracion {

    private Session session;

    public Configuracion() {

        Configuration conf = new Configuration();
        conf.configure();
        ServiceRegistry rs = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
        SessionFactory sf = conf.buildSessionFactory(rs);
        session = sf.openSession();
        session.beginTransaction();
        System.out.println("Transaccion iniciada");
    }

    public Session getSession() {
        return session;
    }

    public void closeSession() {
        /*System.out.println(lc.size());
        for (Causa c : lc) {
            System.out.println(c.toString());
        }*/

        System.out.println("Commit: " + session.getTransaction().wasCommitted());
        if (!session.getTransaction().wasCommitted()) {
            session.getTransaction().commit();
            System.out.println("Commit Ok!");
        }

        System.out.println("RollBack: " + session.getTransaction().wasRolledBack());
        if (session.getTransaction().wasRolledBack()) {
            session.getTransaction().rollback();
            //System.out.println("RollBack Ok!");

        }
        if (session.isConnected()) {
            session.close();
        }
    }

}

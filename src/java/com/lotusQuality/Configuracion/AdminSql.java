/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotusQuality.Configuracion;

import com.lotusQuality.Modelo.Interfaces.Roles;
import com.lotusQuality.Modelo.Interfaces.Usuarios;
import com.lotusQuality.Modelo.RolImp;
import com.lotusQuality.Modelo.UsuarioImp;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class AdminSql implements Administrador {

    Session session;

    Usuarios usu;
    Roles rol;

    public AdminSql() {
        Configuration conf = new Configuration();
        conf.configure();
        ServiceRegistry rs = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
        SessionFactory sf = conf.buildSessionFactory(rs);
        session = sf.openSession();
        session.beginTransaction();
    }

    @Override
    public Usuarios getUsuario() {

        if (usu == null) {
            usu = new UsuarioImp(session);
        }
        return usu;
    }

    @Override
    public Roles getRol() {
        if (rol == null) {
            rol = new RolImp(session);
        }
        return rol;
    }
}

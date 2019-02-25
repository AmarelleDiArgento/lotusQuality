/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotusQuality.Configuracion;

import com.lotusQuality.Modelo.ActividadesImp;
import com.lotusQuality.Modelo.EventoImp;
import com.lotusQuality.Modelo.Interfaces.Actividades;
import com.lotusQuality.Modelo.Interfaces.Eventos;
import com.lotusQuality.Modelo.Interfaces.Procesos;
import com.lotusQuality.Modelo.Interfaces.Roles;
import com.lotusQuality.Modelo.Interfaces.SubProcesos;
import com.lotusQuality.Modelo.Interfaces.Tareas;
import com.lotusQuality.Modelo.Interfaces.Usuarios;
import com.lotusQuality.Modelo.ProcesosImp;
import com.lotusQuality.Modelo.RolImp;
import com.lotusQuality.Modelo.SubProcesosImp;
import com.lotusQuality.Modelo.TareasImp;
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
    Eventos eve;
    Procesos pro;
    SubProcesos sub;
    Actividades act;
    Tareas tar;

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

    @Override
    public Eventos getEvento() {
        if (eve == null) {
            eve = new EventoImp(session);
        }
        return eve;
    }

    @Override
    public Procesos getProceso() {

        if (pro == null) {
            pro = new ProcesosImp(session);
        }
        return pro;
    }

    @Override
    public SubProcesos getSubProceso() {

        if (sub == null) {
            sub = new SubProcesosImp(session);
        }
        return sub;
    }

    @Override
    public Actividades getActividades() {

        if (act == null) {
            act = new ActividadesImp(session);
        }
        return act;
    }

    @Override
    public Tareas getTareas() {

        if (tar == null) {
            tar = new TareasImp(session);
        }
        return tar;
    }
}

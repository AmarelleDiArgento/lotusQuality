/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotusQuality.Configuracion;

import com.lotusQuality.Modulos.Monitoreo.Modelo.CausasImp;
import com.lotusQuality.Modulos.Monitoreo.Modelo.DetallesImp;
import com.lotusQuality.Modulos.Monitoreo.Modelo.EncabezadosImp;
import com.lotusQuality.Modulos.Monitoreo.Modelo.FincasImp;
import com.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.Causas;
import com.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.Detalles;
import com.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.Encabezados;
import com.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.Fincas;
import com.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.Monitores;
import com.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.Novedades;
import com.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.Parametros;
import com.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.Postcosechas;
import com.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.Productos;
import com.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.Programas;
import com.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.PtoCortes;
import com.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.Tipos;
import com.lotusQuality.Modulos.Monitoreo.Modelo.Interfaces.Variedades;
import com.lotusQuality.Modulos.Monitoreo.Modelo.MonitoresImp;
import com.lotusQuality.Modulos.Monitoreo.Modelo.NovedadesImp;
import com.lotusQuality.Modulos.Monitoreo.Modelo.ParametrosImp;
import com.lotusQuality.Modulos.Monitoreo.Modelo.PostcosechasImp;
import com.lotusQuality.Modulos.Monitoreo.Modelo.ProductosImp;
import com.lotusQuality.Modulos.Monitoreo.Modelo.ProgramasImp;
import com.lotusQuality.Modulos.Monitoreo.Modelo.PtoCortesImp;
import com.lotusQuality.Modulos.Monitoreo.Modelo.TiposImp;
import com.lotusQuality.Modulos.Monitoreo.Modelo.VariedadesImp;
import com.lotusQuality.Modulos.Presentacion.Modelo.ActividadesImp;
import com.lotusQuality.Modulos.Presentacion.Modelo.EventoImp;
import com.lotusQuality.Modulos.Presentacion.Modelo.Interfaces.Actividades;
import com.lotusQuality.Modulos.Presentacion.Modelo.Interfaces.Eventos;
import com.lotusQuality.Modulos.Presentacion.Modelo.Interfaces.Procesos;
import com.lotusQuality.Modulos.Presentacion.Modelo.Interfaces.Roles;
import com.lotusQuality.Modulos.Presentacion.Modelo.Interfaces.SubProcesos;
import com.lotusQuality.Modulos.Presentacion.Modelo.Interfaces.Tareas;
import com.lotusQuality.Modulos.Presentacion.Modelo.Interfaces.Usuarios;
import com.lotusQuality.Modulos.Presentacion.Modelo.ProcesosImp;
import com.lotusQuality.Modulos.Presentacion.Modelo.RolImp;
import com.lotusQuality.Modulos.Presentacion.Modelo.SubProcesosImp;
import com.lotusQuality.Modulos.Presentacion.Modelo.TareasImp;
import com.lotusQuality.Modulos.Presentacion.Modelo.UsuarioImp;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class AdminSql implements Administrador {

    Session session;
// Presentacion y seguridad
    Usuarios usu = null;
    Roles rol = null;
    Eventos eve = null;
    Procesos pro = null;
    SubProcesos sub = null;
    Actividades act = null;
    Tareas tar = null;
// Monitoreo
    Causas cau = null;
    Detalles det = null;
    Encabezados enc = null;
    Fincas fin = null;
    Monitores mon = null;
    Novedades nov = null;
    Parametros par = null;
    Postcosechas post = null;
    Productos prod = null;
    Programas prog = null;
    PtoCortes pco = null;
    Tipos tip = null;
    Variedades var = null;

    public AdminSql() {
        Configuration conf = new Configuration();
        conf.configure();
        ServiceRegistry rs = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
        SessionFactory sf = conf.buildSessionFactory(rs);
        session = sf.openSession();
        session.beginTransaction();
    }

    @Override
    public void closeSession() {
        String status;
        try {
            if (!session.getTransaction().wasCommitted()) {
                session.getTransaction().commit();
                System.out.println("Comit Ok!");
            }
        } finally {

            //session.getTransaction().rollback();
            if (session.isConnected()) {
                status = "Activa";
            } else {
                status = "Inactiva";
            }
        }

        System.out.println("Status: " + status);
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

    @Override
    public Causas getCausas() {
        if (cau == null) {
            cau = new CausasImp(session);
        }
        return cau;
    }

    @Override
    public Detalles geDetalles() {
        if (det == null) {
            det = new DetallesImp(session);
        }
        return det;
    }

    @Override
    public Encabezados getEncabezado() {
        if (enc == null) {
            enc = new EncabezadosImp(session);
        }
        return enc;
    }

    @Override
    public Fincas getFinca() {
        if (fin == null) {
            fin = new FincasImp(session);
        }
        return fin;
    }

    @Override
    public Monitores getMonitor() {
        if (mon == null) {
            mon = new MonitoresImp(session);
        }
        return mon;
    }

    @Override
    public Novedades getNovedad() {
        if (nov == null) {
            nov = new NovedadesImp(session);
        }
        return nov;
    }

    @Override
    public Parametros getParametro() {
        if (par == null) {
            par = new ParametrosImp(session);
        }
        return par;
    }

    @Override
    public Postcosechas getPostcosecha() {
        if (post == null) {
            post = new PostcosechasImp(session);
        }
        return post;
    }

    @Override
    public Productos getProductos() {
        if (prod == null) {
            prod = new ProductosImp(session);
        }
        return prod;
    }

    @Override
    public Programas getPrograma() {
        if (prog == null) {
            prog = new ProgramasImp(session);
        }
        return prog;
    }

    @Override
    public PtoCortes getPtoCorte() {
        if (pco == null) {
            pco = new PtoCortesImp(session);
        }
        return pco;
    }

    @Override
    public Tipos getTipo() {
        if (tip == null) {
            tip = new TiposImp(session);
        }
        return tip;
    }

    @Override
    public Variedades getVariedad() {
        if (var == null) {
            var = new VariedadesImp(session);
        }
        return var;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality;

import com.lotus.lotusQuality.Configuracion.AdminSql;
import com.lotus.lotusQuality.Modulos.Presentacion.Modelo.Tabs.Evento;
import com.lotus.lotusQuality.Modulos.Presentacion.Modelo.Tabs.Rol;
import com.lotus.lotusQuality.Modulos.Presentacion.Modelo.Tabs.Usuario;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author almoreno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Main m = new Main();
        m.prueba();
//        m.imprimir();

    }

    void prueba() {

//        imprimir();
        AdminSql aSql = new AdminSql();

//        aSql.closeSession();
//        Long ID = Long.valueOf(1);
//        SubProceso sp = aSql.getSubProceso().oneId(ID);
//
//        System.out.println(sp.toString());
//        Proceso p = aSql.getProceso().oneId(ID);
//        SubProceso sp = new SubProceso("Requerimientos de calidad", "Documentacion de los requerimientos", true));
//        aSql.getSubProceso().insert(sp);
//TODOS LOS EVENTOS :D
//        List<Evento> le = new ArrayList<>();
//        le.add(new Evento("Evento 1", new Date(2019 - 1900, 1, 15, 10, 30), new Date(2019 - 1900, 1, 15, 11, 30), "#00bcd4"));
//        le.add(new Evento("Evento 2", new Date(2019 - 1900, 1, 14), new Date(2019 - 1900, 2, 14), "#009688"));
//        le.add(new Evento("Evento 3", new Date(2019 - 1900, 1, 23), new Date(2019 - 1900, 1, 23), "#8bc34a"));
//        le.add(new Evento("Evento 4", new Date(2019 - 1900, 1, 28), new Date(2019 - 1900, 2, 3), "#ffeb3b"));
//        le.add(new Evento("Evento 5", new Date(2019 - 1900, 2, 1), new Date(2019 - 1900, 2, 1), "#ffc107"));
//        le.add(new Evento("Evento 6", new Date(2019 - 1900, 2, 3), new Date(2019 - 1900, 2, 9), "#ff5722"));
//        le.add(new Evento("Evento 7", new Date(2019 - 1900, 2, 11), new Date(2019 - 1900, 2, 12), "#9c27b0"));
//        le.add(new Evento("Evento 8", new Date(2019 - 1900, 1, 16, 10, 30), new Date(2019 - 1900, 1, 16, 12, 30), "#f44336"));
//        for (Evento e : le) {
//            aSql.getEvento().insert(e);
//        }
//
//// TODOS LOS ROLES :D
//        List<Rol> lr = new ArrayList<>();
//        lr.add(new Rol("Administrador@", "Administración general del sistema", true));
//        lr.add(new Rol("Director@", "Administración general del sistema", true));
//        lr.add(new Rol("Jef@ de calidad", "Administración general del sistema", true));
//        lr.add(new Rol("Coordinador@ de calidad", "Seguimiento de tareas administrativas del equipo", true));
//        lr.add(new Rol("Asistent@ de calidad", "Seguimiento de tareas administrativas propias", true));
//        lr.add(new Rol("Inspector@", "Seguimiento de tareas de inspeccion de producto tercero", true));
//        lr.add(new Rol("Monitor@", "Seguimiento de tareas de monitoreo de producto propio", true));
//        lr.add(new Rol("Evaluador@", "Seguimiento de tareas de evaluacion de producto propio", true));
//        for (Rol r : lr) {
//            aSql.getRol().insert(r);
//        }
//
//        aSql.getRol().closeSession();
//
////TODOS LOS PROCESOS :D
//        List<Proceso> lp = new ArrayList<>();
//        lp.add(new Proceso("Requerimientos de calidad", "Documentacion de requerimientos", true, "#009688", 90));
//        lp.add(new Proceso("Monitoreo de calidad", "Monitoreo de productos propios y terceros", true, "#4caf50", 30));
//        lp.add(new Proceso("Evaluacion vida en florero", "Evaluacion de productos y su duracion den floreros", true, "#4caf50", 39));
//        lp.add(new Proceso("Auditoria de calidad", "Auditoria de calidad", true, "#cddc39", 70));
//        lp.add(new Proceso("Prueba1", "Auditoria de calidad", true, "#ff9800", 14));
//        lp.add(new Proceso("Prueba2", "Auditoria de calidad", true, "#673ab7", 60));
//        lp.add(new Proceso("Prueba3", "Auditoria de calidad", true, "#ff4400", 0));
//        for (Proceso p : lp) {
//            aSql.getProceso().insert(p);
//        }
////        aSql.getProceso().closeSession();
////
//
////USUARIOS
//        Rol r = (Rol) aSql.getRol().oneId(Long.valueOf(1));
//        Date f = new Date(1988 - 1900, 2, 9);
//
//        Usuario u = new Usuario("1070949", "11182", "Alexander", "Moreno Rodriguez", "ALMORENO", "123abc", f, true, r);
//        aSql.getUsuario().insert(u);
        aSql.closeSession();
    }
}
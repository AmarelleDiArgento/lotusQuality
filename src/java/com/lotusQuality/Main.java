/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotusQuality;

import com.lotusQuality.Configuracion.AdminSql;
import com.lotusQuality.Modelo.Tabs.Actividad;
import com.lotusQuality.Modelo.Tabs.Evento;
import com.lotusQuality.Modelo.Tabs.Proceso;
import com.lotusQuality.Modelo.Tabs.Rol;
import com.lotusQuality.Modelo.Tabs.SubProceso;
import com.lotusQuality.Modelo.Tabs.Usuario;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import org.hibernate.Session;

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
        Date i = new Date(2019 - 1900, 2, 12);
        Date f = new Date(2019 - 1900, 2, 14);

        Evento e = new Evento("Evento 3", i, f, "#ff9800");
        aSql.getEvento().insert(e);
//        List<Evento> a = aSql.getEvento().all();
//        for (Evento e : a) {
//            e.toString();
//        }
//TODOS LOS ROLES :D
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
//        for (Proceso p : lp) {
//            aSql.getProceso().insert(p);
//        }
//        aSql.getProceso().closeSession();
//
//        Rol r = (Rol) aSql.getRol().oneId(Long.valueOf(1));
//        Date f = new Date(1988 - 1900, 2, 9);
//
//        Usuario u = new Usuario("1070949", "11182", "Alexander", "Moreno Rodriguez", "ALMORENO", "123abc", f, true, r);
//        aSql.getUsuario().insert(u);
        aSql.closeSession();
    }

}

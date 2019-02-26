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
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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
//        Long ID = Long.valueOf(1);
//        SubProceso sp = aSql.getSubProceso().oneId(ID);
//
//        System.out.println(sp.toString());

//        Proceso p = aSql.getProceso().oneId(ID);
//        SubProceso sp = new SubProceso("Requerimientos de calidad", "Documentacion de los requerimientos", true);
//        aSql.getSubProceso().insert(sp);
//        Date i = new Date(2019 - 1900, 2, 2);
//        Date f = new Date(2019 - 1900, 2, 3);
//
//        Evento e = new Evento("Evento 6", i, f, "#673AB7");
//        aSql.getEvento().insert(e);
//        Rol r = new Rol("Inspector", "gestion de tareas locales", true);
//        aSql.getRol().insert(r);
        Rol r = (Rol) aSql.getRol().oneId(Long.valueOf(1));
        Date f = new Date(1988 - 1900, 2, 9);

        Usuario u = new Usuario("1070949", "11182", "Alexander", "Moreno Rodriguez", "ALMORENO", "123abc", f, true, r);
        aSql.getUsuario().insert(u);
    }

}

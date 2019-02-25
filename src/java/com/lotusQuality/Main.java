/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotusQuality;

import com.lotusQuality.Configuracion.AdminSql;
import com.lotusQuality.Modelo.Tabs.Evento;
import com.lotusQuality.Modelo.Tabs.Rol;
import com.lotusQuality.Modelo.Tabs.Usuario;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

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
        Date i = new Date(2019 - 1900, 2, 3);
        Date f = new Date(2019 - 1900, 2, 9);

        Evento e = new Evento("Evento 4", i, f, "#673AB7");
        aSql.getEvento().insert(e);
        //        Rol r = new Rol("Inspector", "gestion de tareas locales", true);
        //        aSql.getRol().insert(r);
        //        Rol r = null;
        //        r = (Rol) aSql.getRol().oneId(Long.valueOf(3));
        //        Date f = new Date(1988, 3, 9);
        //        Date fn = Date.Usuario u = new Usuario('1070949', '11182', 'Alexander'
        //        ,        'Moreno Rodriguez', 'ALMORENO', '123abc',f , true,    r    );
        //;
        //        aSql.getRol().insert(u);
    }

}

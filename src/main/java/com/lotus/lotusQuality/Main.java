/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality;

import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Tabs.Causa;
import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.iCausa;
import java.util.ArrayList;
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

        iCausa iC = new iCausa();
        long id = Long.valueOf("12");
        Causa c = iC.oneId(id);

        System.out.println(c.toString());

        /*
        List<Causa> lc = new ArrayList();
        lc.add(new Causa("1", "Cladosporium/Heterosporium"));
        lc.add(new Causa("2", "Botrytis"));
        lc.add(new Causa("3", "Fusarium"));
        lc.add(new Causa("4", "Mildeo Velloso"));
        lc.add(new Causa("5", "Presencia Thrips"));
        lc.add(new Causa("6", "Presencia Afidios"));
        lc.add(new Causa("7", "Presencia Ácaros"));
        lc.add(new Causa("8", "Presencia Lepidópteros"));
        lc.add(new Causa("9", "Roya Café"));
        lc.add(new Causa("10", "Presencia Babosa"));
        lc.add(new Causa("11", "Tallo Corto"));
        lc.add(new Causa("12", "Tallo Torcido"));
        lc.add(new Causa("13", "Tallo Curvo"));
        lc.add(new Causa("14", "Tallo Débil"));
        lc.add(new Causa("15", "Tallo Partido"));
        lc.add(new Causa("16", "Tallo Pelado"));
        lc.add(new Causa("17", "Tallo Rajado"));
        lc.add(new Causa("18", "Flor Abierta"));
        lc.add(new Causa("19", "Flor Cerrada"));
        lc.add(new Causa("20", "Flor Deforme"));
        lc.add(new Causa("21", "Flor Descabezada"));
        lc.add(new Causa("22", "Flor Deshidratada"));
        lc.add(new Causa("23", "Cabeza Torcida"));
        lc.add(new Causa("24", "Caliz Rajado"));
        lc.add(new Causa("25", "Clorosis"));
        lc.add(new Causa("26", "Follaje Quemado"));
        lc.add(new Causa("27", "Clorosis Causada Por Ácaros"));
        lc.add(new Causa("28", "Brote Axilar"));
        lc.add(new Causa("29", "Fitotoxicidad"));
        lc.add(new Causa("30", "Maltrato En Flor"));
        lc.add(new Causa("31", "Daño Por Thrips"));
        lc.add(new Causa("32", "Flor Sucia"));
        lc.add(new Causa("33", "Follaje Sucio"));
        lc.add(new Causa("34", "Dos Puntos Varietal"));
        lc.add(new Causa("35", "Dos Puntos Corte Incorrecto"));
        lc.add(new Causa("36", "Decoloracion En Flor"));
        lc.add(new Causa("37", "Daño Mecánico"));
        lc.add(new Causa("38", ""));
        lc.add(new Causa("39", "Trozador"));
        lc.add(new Causa("40", "Daño Por Trozador"));
        lc.add(new Causa("41", "Daño Por Babosa"));
        lc.add(new Causa("42", "Presencia De Cogollero"));
        lc.add(new Causa("43", "Daño Por Cogollero"));
        lc.add(new Causa("44", "Tallo Rajado Oxidado"));
        lc.add(new Causa("45", "Acaros"));
        lc.add(new Causa("46", "Agrobacterium"));
        lc.add(new Causa("47", "Aphidos"));
        lc.add(new Causa("48", "Brotes Axilares"));
        lc.add(new Causa("49", "Cabeza Menor A 4 Cm"));
        lc.add(new Causa("50", "Cabeza Menor A 4,5 Cm"));
        lc.add(new Causa("51", "Cabeza Partida"));
        lc.add(new Causa("52", "Clorosis Por Deficiencia Nutricional"));
        lc.add(new Causa("53", "Cuello De Ganso"));
        lc.add(new Causa("54", "Decoloración En Flor"));
        lc.add(new Causa("55", "Desbotone Incorrecto"));
        lc.add(new Causa("56", "Deshidratación En Flor"));
        lc.add(new Causa("57", "Dos Puntos"));
        lc.add(new Causa("58", "Flor Despetalada"));
        lc.add(new Causa("59", "Flor Quemada"));
        lc.add(new Causa("60", "Fumagina"));
        lc.add(new Causa("61", "Maltrato En Follaje"));
        lc.add(new Causa("62", "Mancha En Follaje-Causa No Identificada"));
        lc.add(new Causa("63", "Mildeo Polvoso"));
        lc.add(new Causa("64", "Mosca Blanca"));
        lc.add(new Causa("65", "Pétalos Faltantes"));
        lc.add(new Causa("66", "Rajado Por Mildeo Velloso"));
        lc.add(new Causa("67", "Roya Blanca"));
        lc.add(new Causa("68", "Roya Parda"));
        lc.add(new Causa("69", "Sin Follaje"));
        lc.add(new Causa("70", "Tallo Débil"));
        lc.add(new Causa("71", "Tallo Delgado"));
        lc.add(new Causa("72", "Fumagina"));
        lc.add(new Causa("73", "Grosor De Tallo Menor A La Longitud"));
        lc.add(new Causa("74", "Cáliz Rallado"));
        for (Causa causa : lc) {
            iC.insert(causa);
        }
         */
        iC.closeSession();
//        imprimir();
        //       AdminSql aSql = new AdminSql();
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
        //   aSql.closeSession();
    }
}

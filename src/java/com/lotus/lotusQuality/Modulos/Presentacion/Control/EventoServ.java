/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Presentacion.Control;

import com.lotus.lotusQuality.Configuracion.AdminSql;
import com.lotus.lotusQuality.Modulos.Presentacion.Modelo.Tabs.Evento;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author almoreno
 */
public class EventoServ extends HttpServlet {

    AdminSql aSql = new AdminSql();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws SecurityException, IOException {
//        resp.setContentType("application/json");
//        PrintWriter out = resp.getWriter();
//        JsonObject cJ = lista();
//        out.print(cJ.toString());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

//    public JsonObject lista() {
//
//        List<Evento> lc = aSql.getEvento().all();
//        JsonObject cJ = aSql.getEvento().jFile(lc);
//        return cJ;
//    }
}

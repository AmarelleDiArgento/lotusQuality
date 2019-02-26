/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotusQuality.Control;

import com.google.gson.JsonObject;
import com.lotusQuality.Configuracion.AdminSql;
import com.lotusQuality.Configuracion.DAO;
import com.lotusQuality.Modelo.Tabs.Proceso;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author almoreno
 */
@WebServlet(name = "ProcesoServ", urlPatterns = {"/procesos.json"})
public class ProcesoServ extends HttpServlet implements DAO<Long, Proceso, String> {

    AdminSql aSql = new AdminSql();

    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws SecurityException, IOException {
        resp.setContentType("application/json");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws SecurityException, IOException {
        resp.setContentType("application/json");
        PrintWriter out = resp.getWriter();
        JsonObject cJ = lista();
        out.print(cJ.toString());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws SecurityException, IOException {
        resp.setContentType("application/json");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    @Override
    public void insert(Proceso o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Proceso o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Proceso oneId(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Proceso oneName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Proceso> all() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JsonObject jFile(List<Proceso> lo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public JsonObject lista() {

        List<Proceso> lp = aSql.getProceso().all();
        JsonObject cJ = aSql.getProceso().jFile(lp);
        return cJ;
    }

}

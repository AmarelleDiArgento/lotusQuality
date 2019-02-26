/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotusQuality.Control;

import com.google.gson.JsonObject;
import com.lotusQuality.Configuracion.AdminSql;
import com.lotusQuality.Configuracion.DAO;
import com.lotusQuality.Modelo.Tabs.Usuario;
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
@WebServlet(name = "UsuarioServ", urlPatterns = {"/usuarios.json"})
public class UsuarioServ extends HttpServlet implements DAO<String, Usuario, String> {

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
    public void insert(Usuario o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Usuario o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario oneId(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario oneName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> all() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JsonObject jFile(List<Usuario> lo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public JsonObject lista() {

        List<Usuario> lp = aSql.getUsuario().all();
        JsonObject cJ = aSql.getUsuario().jFile(lp);
        return cJ;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotusQuality.Control;

import com.lotusQuality.Configuracion.AdminSql;
import com.lotusQuality.Modelo.Tabs.Rol;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.lotusQuality.Configuracion.DAO;
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
@WebServlet(name = "RolServ", urlPatterns = {"/roles.json"})
public class RolServ extends HttpServlet implements DAO<Long, Rol, String> {

    AdminSql aSql = new AdminSql();
    Rol r = null;
    int Id;
    String Nombre;
    String Descripcion;
    Boolean Estado;

    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws SecurityException, IOException, ServletException {
        resp.setContentType("application/json");

        String Accion = req.getParameter("accion");
        if (Accion != null) {
            switch (Accion) {
                case "Registrar":
                    Nombre = req.getParameter("nombre");
                    Descripcion = req.getParameter("descripcion");
                    Estado = req.getParameter("estado") != null;
                    r = new Rol(Nombre, Descripcion, Estado);
                    insert(r);
                case "Actualizar":
                case "Eliminar":
                case "Obtener":
                default:
            }
        } else {
        }

        req.getRequestDispatcher("rol.jsp").forward(req, resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws SecurityException, IOException {
        resp.setContentType("application/json");
        PrintWriter out = resp.getWriter();
        JsonObject cJ = lista();
        out.print(cJ.toString());

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

    public JsonObject lista() {

        List<Rol> lc = aSql.getRol().all();
        JsonObject cJ = aSql.getRol().jFile(lc);
        return cJ;
    }

    @Override
    public void insert(Rol o) {
        aSql.getRol().insert(o);

    }

    @Override
    public void update(Rol o) {
        aSql.getRol().update(o);
    }

    @Override
    public void delete(Long id) {
        aSql.getRol().delete(id);
    }

    @Override
    public Rol oneId(Long id) {
        return aSql.getRol().oneId(id);
    }

    @Override
    public Rol oneName(String name) {
        return aSql.getRol().oneName(name);
    }

    @Override
    public List<Rol> all() {
        return aSql.getRol().all();
    }

    @Override
    public JsonObject jFile(List<Rol> lo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

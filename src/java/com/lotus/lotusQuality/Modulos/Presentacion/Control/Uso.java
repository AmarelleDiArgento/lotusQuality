/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Modulos.Presentacion.Control;

import com.lotus.lotusQuality.Configuracion.AdminSql;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author almoreno
 */
@Path("roles")
public class Uso {

    AdminSql aSql = new AdminSql();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getProductos() {
        return Response.ok(aSql.getRol().all()).build();

    }
}

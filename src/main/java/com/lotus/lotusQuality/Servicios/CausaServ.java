/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lotus.lotusQuality.Servicios;

import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.iCausa;
import com.lotus.lotusQuality.Modulos.Monitoreo.Modelo.Tabs.Causa;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author freya
 */
@Path("causas")
public class CausaServ {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response CausasAll() {
        iCausa iC = new iCausa();

        List<Causa> lc = iC.all();
        return Response.ok(lc).build();

    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response CausaId(@PathParam("id") long id) {
        //  long ID = id;
        iCausa iC = new iCausa();
        Causa causa = iC.oneId(id);
        if (causa != null) {
            return Response.ok(causa).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }

    }

}

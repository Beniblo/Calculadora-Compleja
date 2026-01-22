package org.utl.calculadoracompleja.rest;

import jakarta.ws.rs.DefaultValue;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.utl.calculadoracompleja.controller.CalculadoraCompleja;
import org.utl.calculadoracompleja.model.NumeroComplejo;

/**
 *
 * @author beniblo
 */

@Path("restoperacionescomplejas")
public class Restoperacionescomplejas {
    
    @GET
    @Path("adicionar")
    @Produces(MediaType.APPLICATION_JSON)
    public Response adicionar(@QueryParam("realuno") @DefaultValue("0") double r1, 
                              @QueryParam("imauno") @DefaultValue("0") double i1, 
                              @QueryParam("realdos") @DefaultValue("0") double r2, 
                              @QueryParam("imados") @DefaultValue("0") double i2)
    {
        NumeroComplejo nc1 = new NumeroComplejo(r1, i1);
        NumeroComplejo nc2 = new NumeroComplejo(r2, i2);
        CalculadoraCompleja cnc = new CalculadoraCompleja();
        NumeroComplejo nc3 = cnc.adicionar(nc1, nc2);
        String out = "{\"resultado\": \"%s\"}";
        out = String.format(out, nc3.toString());
        return Response.status(Response.Status.OK).entity(out).build();
    }

    @GET
    @Path("restar")
    @Produces(MediaType.APPLICATION_JSON)
    public Response restar(@QueryParam("realuno") @DefaultValue("1") double r1, 
                              @QueryParam("imauno") @DefaultValue("1") double i1, 
                              @QueryParam("realdos") @DefaultValue("1") double r2, 
                              @QueryParam("imados") @DefaultValue("1") double i2)
    {
        NumeroComplejo nc1 = new NumeroComplejo(r1, i1);
        NumeroComplejo nc2 = new NumeroComplejo(r2, i2);
        CalculadoraCompleja cnc = new CalculadoraCompleja();
        NumeroComplejo nc3 = cnc.restar(nc1, nc2);
        String out = "{\"resultado\": \"%s\"}";
        out = String.format(out, nc3.toString());
        return Response.status(Response.Status.OK).entity(out).build();
    }
    
    @GET
    @Path("dividir")
    @Produces(MediaType.APPLICATION_JSON)
    public Response dividir(@QueryParam("realuno") @DefaultValue("1") double r1, 
                              @QueryParam("imauno") @DefaultValue("1") double i1, 
                              @QueryParam("realdos") @DefaultValue("1") double r2, 
                              @QueryParam("imados") @DefaultValue("1") double i2)
    {
        NumeroComplejo nc1 = new NumeroComplejo(r1, i1);
        NumeroComplejo nc2 = new NumeroComplejo(r2, i2);
        CalculadoraCompleja cnc = new CalculadoraCompleja();
        NumeroComplejo nc3 = cnc.dividir(nc1, nc2);
        String out = "{\"resultado\": \"%s\"}";
        out = String.format(out, nc3.toString());
        return Response.status(Response.Status.OK).entity(out).build();
    }

    @GET
    @Path("multiplicar")
    @Produces(MediaType.APPLICATION_JSON)
    public Response multiplicar(@QueryParam("realuno") @DefaultValue("1") double r1, 
                              @QueryParam("imauno") @DefaultValue("1") double i1, 
                              @QueryParam("realdos") @DefaultValue("1") double r2, 
                              @QueryParam("imados") @DefaultValue("1") double i2)
    {
        NumeroComplejo nc1 = new NumeroComplejo(r1, i1);
        NumeroComplejo nc2 = new NumeroComplejo(r2, i2);
        CalculadoraCompleja cnc = new CalculadoraCompleja();
        NumeroComplejo nc3 = cnc.multiplicar(nc1, nc2);
        String out = "{\"resultado\": \"%s\"}";
        out = String.format(out, nc3.toString());
        return Response.status(Response.Status.OK).entity(out).build();
    }
}

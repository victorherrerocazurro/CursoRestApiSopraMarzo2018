package com.ejemplo.jersey.services.rest.v1;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//Tambien se le podria llamar HolaMundoResource
@Path("/saludos")
public class HolaMundoRestService {

	private static final String URL_SALUDOS = "http://localhost:8080/HolaMundoJersey/api/v1/saludos/";

	//Describa las operaciones que se pueden realizar sobre el recurso

	//En este servicio los saludos y prefijos son String
	
	@GET
	@Produces(MediaType.APPLICATION_XML)//Cabecera Accept
	public Response consultarTodos(){
		return Response.ok().build();
	}
	
	@GET
	@Path("{id}")
	public Response consultarPorId(@PathParam("id") long id){
		return null;
	}
	
	@GET
	@Path("{id}/prefijo")
	public Response consultarPrefijoDeUnSaludoPorId(
										@PathParam("id") long id){
		return null;
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	public Response insertar(String saludo) throws URISyntaxException {
		long idGenerado = 1;
		return Response
				.created(new URI(URL_SALUDOS + idGenerado))//Status code a 201 y la header Location
				.build();
	}
	
}











package com.jersey.simpsons.services.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.jersey.simpsons.core.services.Servicio;
import com.jersey.simpsons.entities.Personaje;

@Path("personajes")
public class PersonajesRestService {

	//@Autowired
	@Inject
	private Servicio servicio;
	
	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	@GET
	public List<Personaje> consultarTodos(@QueryParam("apellido") String apellido) {
		return null;
	}

	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Personaje consultarPorIdentificador(@PathParam("id") String id) {

		// Si queremos dar soporte a los alias, debemos procesar el id

		String[] split = id.split(":");

		if (split.length > 1) {
			if (split[0].equals("nickname")) {
				// Estamos ante un alias
				String alias = split[1];
			}
		} else {
			// Buscamos por identificador
		}

		return new Personaje("homer", "Homer Jay Simpson", 38);
	}

	@GET
	@Path("{id}/hermanos")
	public List<Personaje> consultarHermanosPorIdentificador(@PathParam("id") String id) {
		return null;
	}

	@GET
	@Path("{id}/hermanos/{idHermano}")
	public Personaje consultarHermanoPorIdentificador(@PathParam("id") String id,
			@PathParam("idHermano") String idHermano) {
		return null;
	}

	// Alta
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertar(Personaje personaje) {
		servicio.funcionalidadDeLaCapaDeNegocio();
		return Response.ok().build();
	}

	// Modificacion del registro completo
	@PUT
	@Path("{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response modificar(@PathParam("id") String id, Personaje personaje) {
		// Se obvia el ID del objeto personaje
		return Response.ok().build();
	}

	// Modificacion parcial de solo aquellas caracateristicas que se reciban 
	@PATCH
	@Path("{id}")
	public Response modificarParcialmente(@PathParam("id") String id, Personaje personaje) {
		// Se obvia el ID del objeto personaje
		return Response.ok().build();
	}
	
	@DELETE
	@Path("{id}")
	public Response borrar(@PathParam("id") String id) {
		// Se obvia el ID del objeto personaje
		return Response.ok().build();
	}

}

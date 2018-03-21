package com.jersey.hateoas;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;

@Path("Personas")
public class PersonaRestService {
	
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Persona consulta(@PathParam("id") String id) {
		return new Persona("Victor", "Victor Herrero", 22);
	}
	
	@PUT
	@Path("{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void modificacion(@PathParam("id") String id, @Valid Persona persona) {
		System.out.println("Modificando la persona: " + persona);
	}
	
	@DELETE
	@Path("{id}")
	public void borrado(@PathParam("id") String id) {
		System.out.println("Borrando: " + id);
	}
	
	@GET
	@Path("{id}/hermanos")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Persona> consultaHermanos(@PathParam("id") String id) {
		return Arrays.asList(new Persona[] {new Persona("Juan", "Juan Herrero", 34),new Persona("Maria", "Maria Herrero", 30)});
	}
	
	
}

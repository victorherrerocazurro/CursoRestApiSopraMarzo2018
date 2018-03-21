package com.jersey.hateoas.cliente;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;

public class AplicacionCliente {

	public static void main(String[] args) {
		//GET
		Client client = ClientBuilder.newClient();
		
		Persona persona = client
			.target("http://localhost:8080/JerseyHateoas/api/v1/")
			.path("Personas/" + "Victor")
			.request(MediaType.APPLICATION_JSON)
			.get(Persona.class);
		
		System.out.println(persona);
		
		client
			.target("http://localhost:8080/JerseyHateoas/api/v1/")
			.path("Personas/" + "Victor")
			.request(MediaType.APPLICATION_JSON)
			.put(Entity.entity(
					new Persona("Victor", "Victor Herreroq", 22), 
					MediaType.APPLICATION_JSON));
		
		client
			.target("http://localhost:8080/JerseyHateoas/api/v1/")
			.path("Personas/" + "Victor")
			.request(MediaType.APPLICATION_JSON)
			.delete();
	}

}

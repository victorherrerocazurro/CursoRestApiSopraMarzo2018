package com.jersey.spring.service.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;

import com.jersey.spring.core.service.Servicio;

@Path("saludos")
public class HolaMundoRestService {

	//@Inject
	@Autowired
	Servicio servicio;
	
	@GET
	public String get() {
		servicio.funcionalidadDeLaCapaDeNegocio();
		return "Dentro del Servicio REST";
	}
	
}

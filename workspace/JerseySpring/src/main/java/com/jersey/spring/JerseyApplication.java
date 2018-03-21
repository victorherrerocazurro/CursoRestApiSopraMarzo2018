package com.jersey.spring;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/api/v1")
public class JerseyApplication extends ResourceConfig{

	public JerseyApplication() {
		super();
		//Definicon del pqeute a escaneear en busca de clases anotadas con @Path
		packages(true, this.getClass().getPackage().getName() + ".service.rest");
	}

	
	
}

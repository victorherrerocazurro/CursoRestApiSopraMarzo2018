package com.jersey.hateoas;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

@ApplicationPath("/api/v1")
public class JerseyApplication extends ResourceConfig{

	public JerseyApplication() {
		super();
		//Definicon del pqeute a escaneear en busca de clases anotadas con @Path
		packages(true, this.getClass().getPackage().getName());
		property("jersey.config.server.provider.classnames", "org.glassfish.jersey.linking.DeclarativeLinkingFeature");
		property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);
	}

	
	
}

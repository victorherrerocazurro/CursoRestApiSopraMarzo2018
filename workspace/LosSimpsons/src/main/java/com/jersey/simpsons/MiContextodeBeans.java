package com.jersey.simpsons;

import org.glassfish.jersey.internal.inject.AbstractBinder;

import com.jersey.simpsons.core.services.Servicio;
import com.jersey.simpsons.core.services.ServicioImpl;

public class MiContextodeBeans extends AbstractBinder {

	@Override
	protected void configure() {
		bind(ServicioImpl.class).to(Servicio.class);
	}

}

package com.jersey.simpsons.core.services;

import javax.annotation.Resource;

@Resource
public class ServicioImpl implements Servicio {

	@Override
	public void funcionalidadDeLaCapaDeNegocio() {
		// TODO Auto-generated method stub
		System.out.println("En el negocio");
	}

}

package com.jersey.spring.core.service;

import javax.annotation.Resource;
import javax.inject.Named;

import org.springframework.stereotype.Component;

//@Resource
//@Named
@Component
public class ServicioImpl implements Servicio {

	@Override
	public void funcionalidadDeLaCapaDeNegocio() {
		// TODO Auto-generated method stub
		System.out.println("En el negocio");
	}

}

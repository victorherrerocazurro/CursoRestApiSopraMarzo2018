package com.jersey.hateoas.cliente;

import java.util.List;

import javax.ws.rs.core.Link;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.glassfish.jersey.linking.Binding;
import org.glassfish.jersey.linking.InjectLink;
import org.glassfish.jersey.linking.InjectLink.Extension;
import org.glassfish.jersey.linking.InjectLink.Style;
import org.glassfish.jersey.linking.InjectLinks;

import com.jersey.hateoas.PersonaRestService;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Persona {

	private String id;
	private String nombre;
	private int edad;

	@InjectLinks({
			@InjectLink(
					resource = PersonaRestService.class, 
					style = Style.ABSOLUTE, 
					rel = "modificacion", 
					bindings = @Binding(name = "id", value = "${instance.id}"), 
					method = "modificacion",
					extensions = {
							@Extension(name = "method", value = "PUT")}),
			@InjectLink(
					resource = PersonaRestService.class, 
					style = Style.ABSOLUTE, 
					rel = "borrado", 
					bindings = @Binding(name = "id", value = "${instance.id}"), 
					method = "borrado", 
					extensions = {
							@Extension(name = "method", value = "DELETE") }) })
	@XmlJavaTypeAdapter(Link.JaxbAdapter.class)
	@XmlElement(name = "self")
	private List<Link> self;

	@InjectLink(
			resource = PersonaRestService.class, 
			style = Style.ABSOLUTE, 
			rel = "hermanos", 
			bindings = @Binding(name = "id", value = "${instance.id}"), 
			method = "consultaHermanos",
			extensions = {
					@Extension(name = "method", value = "GET") 
			})
	@XmlJavaTypeAdapter(Link.JaxbAdapter.class)
	@XmlElement(name = "hermanos")
	private Link hermanos;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public List<Link> getSelf() {
		return self;
	}

	public void setSelf(List<Link> self) {
		this.self = self;
	}

	public Link getHermanos() {
		return hermanos;
	}

	public void setHermanos(Link hermanos) {
		this.hermanos = hermanos;
	}

	public Persona(String id, String nombre, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}

	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
}

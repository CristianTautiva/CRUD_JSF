package com.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="mensaje")
public class Mensaje implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public Mensaje() {}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="email")
	private String email;
	
	@Column(name="website")
	private String website;

	@Column(name="mensaje")
	private String mensaje;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	@Override
	public String toString() {
		return "Mensaje " + id + "/n nombre = " + nombre + "/n email = " + email + "/n website = " + website + " /nmensaje = "
				+ mensaje ;
	}
	
     
}

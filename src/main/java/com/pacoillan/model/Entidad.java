package com.pacoillan.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the entidades database table.
 * 
 */
@Entity
@Table(name="entidades")
@NamedQuery(name="Entidad.findAll", query="SELECT e FROM Entidad e")
public class Entidad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idEntidad;

	private String apellidos;

	private String nombre;

	private String telefono;

	public Entidad() {
	}

	public int getIdEntidad() {
		return this.idEntidad;
	}

	public void setIdEntidad(int idEntidad) {
		this.idEntidad = idEntidad;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
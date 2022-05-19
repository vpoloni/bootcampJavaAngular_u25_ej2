package com.tienda.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.tienda.dto.Departamento;

@Entity
@Table(name="empleados")//en caso que la tabla sea diferente
public class Empleado {
	
	//Atributos de entidad cliente
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	@Column(name = "apellidos")//no hace falta si se llama igual
	private String apellidos;
	
	@ManyToOne
    @JoinColumn(name="departamento_id")
     Departamento departamento;

	//Constructores
	/**
	 * 
	 */
	public Empleado() {
		
	}
	/**
	 * @param id
	 * @param nombre
	 * @param apellidos
	 * @param departamento_id
	 */
	public Empleado(int id, String nombre, String apellidos, Departamento departamento_id) {
		//super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.departamento = departamento_id;
	}
	
	//Getters & Setters

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public Departamento getDepartamento_id() {
		return departamento;
	}
	public void setDepartamento_id(Departamento departamento_id) {
		this.departamento = departamento_id;
	}
	
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", departamento="
				+ departamento + "]";
	}


}

package com.tienda.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.tienda.dto.Empleado;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="departamentos")//en caso que la tabla sea diferente
public class Departamento {
	

	//Atributos de entidad cliente
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	@Column(name = "presupuesto")//no hace falta si se llama igual
	private int presupuesto;

	
    @OneToMany
    @JoinColumn(name="id")
    private List<Empleado> empleado;
	
	//Constructores
	
	public Departamento() {
	
	}

	/**
	 * @param id
	 * @param nombre
	 */
	public Departamento(int id, String nombre, int presupuesto) {
		//super();
		this.id = id;
		this.nombre = nombre;
		this.presupuesto = presupuesto;

	}

	
	//Getters y Setters
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}

	/**
	 * @return the video
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Empleado")
	public List<Empleado> getEmpleado() {
		return empleado;
	}

	/**
	 * @param video the video to set
	 */
	public void setEmpleado(List<Empleado> empleado) {
		this.empleado = empleado;
	}



	//Metodo impresion de datos por consola

	@Override
	public String toString() {
		return "Departamento [id=" + id + ", nombre=" + nombre + ", presupuesto=" + presupuesto + ", empleado="
				+ empleado + "]";
	}
	
	

}

package com.tienda.service;

import java.util.List;

import com.tienda.dto.Empleado;

public interface IEmpleadoService {
	
	//Metodos del CRUD
	public List<Empleado> listarEmpleados(); //Listar All 
	
	public Empleado guardarEmpleado(Empleado empleado);	//Guarda un empleado CREATE
	
	public Empleado empleadoXID(int id); //Leer datos de un empleado READ
	
	public Empleado actualizarEmpleado(Empleado empleado); //Actualiza datos del empleado UPDATE
	
	public void eliminarEmpleado(int id);// Elimina el empleado DELETE

}

package com.tienda.service;

import java.util.List;

import com.tienda.dto.Departamento;

public interface IDepartamentoService {
	
	//Metodos del CRUD
	public List<Departamento> listarDepartamentos(); //Listar All 
	
	public Departamento guardarDepartamento(Departamento departamento);	//Guarda un departamento CREATE
	
	public Departamento departamentoXID(int id); //Leer datos de un departamento READ
	
	public Departamento actualizarDepartamento(Departamento departamento); //Actualiza datos del departamento UPDATE
	
	public void eliminarDepartamento(int id);// Elimina el departamento DELETE

}

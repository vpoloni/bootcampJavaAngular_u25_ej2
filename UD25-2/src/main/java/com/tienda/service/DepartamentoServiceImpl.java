package com.tienda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.dao.IDepartamentoDAO;
import com.tienda.dto.Departamento;

@Service
public class DepartamentoServiceImpl implements IDepartamentoService{
	
	//Utilizamos los metodos de la interface IClienteDAO, es como si instaciaramos.
		@Autowired
		IDepartamentoDAO iDepartamentoDAO;
		
		@Override
		public List<Departamento> listarDepartamentos() {
			
			return iDepartamentoDAO.findAll();
		}

		@Override
		public Departamento guardarDepartamento(Departamento departamento) {
			
			return iDepartamentoDAO.save(departamento);
		}

		@Override
		public Departamento departamentoXID(int id) {
			
			return iDepartamentoDAO.findById(id).get();
		}

		@Override
		public Departamento actualizarDepartamento(Departamento departamento) {
			
			return iDepartamentoDAO.save(departamento);
		}

		@Override
		public void eliminarDepartamento(int id) {
			
			iDepartamentoDAO.deleteById(id);
			
		}


}

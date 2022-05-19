package com.tienda.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.dto.Empleado;

public interface IEmpleadoDAO extends  JpaRepository<Empleado, Integer> {

}

package com.tienda.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tienda.dto.Departamento;

public interface IDepartamentoDAO extends JpaRepository<Departamento, Integer> {

}

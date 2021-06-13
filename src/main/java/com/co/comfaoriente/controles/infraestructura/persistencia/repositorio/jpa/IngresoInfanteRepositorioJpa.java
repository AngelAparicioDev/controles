package com.co.comfaoriente.controles.infraestructura.persistencia.repositorio.jpa;

import org.springframework.data.repository.CrudRepository;

import com.co.comfaoriente.controles.infraestructura.persistencia.entidades.IngresoInfanteEntidad;

public interface IngresoInfanteRepositorioJpa extends CrudRepository<IngresoInfanteEntidad, Integer>{

}
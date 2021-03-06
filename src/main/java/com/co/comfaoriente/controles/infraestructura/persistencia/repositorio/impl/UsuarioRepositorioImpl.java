package com.co.comfaoriente.controles.infraestructura.persistencia.repositorio.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.co.comfaoriente.controles.dominio.entidades.UsuarioEntidad;
import com.co.comfaoriente.controles.dominio.repositorios.UsuarioRepositorio;
import com.co.comfaoriente.controles.infraestructura.persistencia.mapper.UsuarioMapper;
import com.co.comfaoriente.controles.infraestructura.persistencia.repositorio.jpa.UsuarioRepositorioJpa;

@Component
public class UsuarioRepositorioImpl implements UsuarioRepositorio {

	@Autowired
	private UsuarioRepositorioJpa repositorioJpa;

	private static final UsuarioMapper mapper = UsuarioMapper.getInstance();

	@Override
	public List<UsuarioEntidad> listarUsuarios() {
		List<com.co.comfaoriente.controles.infraestructura.persistencia.entidades.UsuarioEntidad> entity = repositorioJpa
				.listarUsuarios();
		return entity.stream().map(mapper::toDomain).collect(Collectors.toList());
	}

	@Override
	public boolean registrarUsuario(UsuarioEntidad usuario) {
		com.co.comfaoriente.controles.infraestructura.persistencia.entidades.UsuarioEntidad entity = mapper
				.toEntity(usuario, true);
		return repositorioJpa.save(entity) != null;
	}

	@Override
	public boolean actualizarUsuario(UsuarioEntidad usuario) {
		com.co.comfaoriente.controles.infraestructura.persistencia.entidades.UsuarioEntidad entity = mapper
				.toEntity(usuario, false);
		return repositorioJpa.save(entity) != null;
	}

	@Override
	public boolean eliminarUsuario(int documento) {
		repositorioJpa.deleteById(documento);
		return !repositorioJpa.existsById(documento);
	}

	@Override
	public UsuarioEntidad consultarUsuario(int documento) {
		com.co.comfaoriente.controles.infraestructura.persistencia.entidades.UsuarioEntidad entity = repositorioJpa
				.consultarUsuario(documento);
		return mapper.toDomain(entity);
	}

	@Override
	public boolean existeDocumento(int documento) {
		return repositorioJpa.existsById(documento);
	}

	@Override
	public List<UsuarioEntidad> consultarUsuariosxRol(String nombre) {
		List<com.co.comfaoriente.controles.infraestructura.persistencia.entidades.UsuarioEntidad> entity = repositorioJpa
				.consultarUsuariosxRol(nombre);
		entity.stream().forEach(System.out::println);
		return entity.stream().map(mapper::toDomain).collect(Collectors.toList());
	}

}

package com.cursodespring.springboot.error.app.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cursodespring.springboot.error.app.model.domain.Usuario;

@Service
public class UsuarioServiceImp implements UsuarioService {
	
	private List<Usuario> lista;
	public UsuarioServiceImp(){
		this.lista = new ArrayList<>();
		this.lista.add(new Usuario(1, "Jorge", "Meza"));
		this.lista.add(new Usuario(2, "Lucia", "Smith"));
		this.lista.add(new Usuario(3, "Lucas", "Liberman"));
		this.lista.add(new Usuario(4, "Pablo", "García"));
		this.lista.add(new Usuario(5, "Samantha", "Rodríguez"));
		this.lista.add(new Usuario(6, "Lisa", "Lewis"));
		this.lista.add(new Usuario(7, "Edson", "Alvarez"));
	}
	@Override
	public List<Usuario> listar() {
		return this.lista;
	}

	@Override
	public Usuario obtenerPorId(Integer id) {
		Usuario usuario = null;
		for(Usuario user: this.lista){
			if(user.getId().equals(id)){
				usuario = user;
				break;
			}
		}
		return usuario;
	}
	@Override
	public Optional<Usuario> obtenerPorIdOptional(Integer id) {
		Usuario usuario = this.obtenerPorId(id);
		return Optional.ofNullable(usuario);
	}

}

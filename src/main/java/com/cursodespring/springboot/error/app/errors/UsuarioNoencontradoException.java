package com.cursodespring.springboot.error.app.errors;

public class UsuarioNoencontradoException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public UsuarioNoencontradoException(String id) {
		super("Usuario con ID: ".concat(id).concat(" no existente en el sistema"));
	
	}
	
}

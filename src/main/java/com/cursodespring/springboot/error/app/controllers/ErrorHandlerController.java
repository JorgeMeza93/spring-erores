package com.cursodespring.springboot.error.app.controllers;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cursodespring.springboot.error.app.errors.UsuarioNoencontradoException;

@ControllerAdvice
public class ErrorHandlerController {
	
	@ExceptionHandler(ArithmeticException.class)
	public String arithmeticError(ArithmeticException exception, Model model){
		model.addAttribute("error", "Error de Aritmética");
		model.addAttribute("message", exception.getMessage());
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("timestamp", new Date());
		return "error/aritmetica";
	}
	@ExceptionHandler(NumberFormatException.class)
	public String numberFormatError(NumberFormatException exception, Model model){
		model.addAttribute("error", "Error Formato número no válido");
		model.addAttribute("message", exception.getMessage());
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("timestamp", new Date());
		return "error/numero-formato";	
	}
	@ExceptionHandler(UsuarioNoencontradoException.class)
	public String usuarioNoencontradError(UsuarioNoencontradoException exception, Model model){
		model.addAttribute("error", "Error: Usuario no existente");
		model.addAttribute("message", exception.getMessage());
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("timestamp", new Date());
		return "error/no-encontrado";	
	}
}

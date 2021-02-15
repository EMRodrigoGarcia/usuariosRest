package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.modelo.Usuario;

public interface IUsuarioService {
	public boolean insert(Usuario user);
	public boolean update(Usuario user);
	public boolean delete(Usuario user);
	
	public List<Usuario> findAll();
	
	public Optional<Usuario> findByLogin(String login);
	
	
	
}

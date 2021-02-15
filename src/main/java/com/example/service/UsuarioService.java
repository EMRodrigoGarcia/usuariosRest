package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.modelo.Usuario;
import com.example.repository.UsuarioRepository;

public class UsuarioService implements IUsuarioService {
	@Autowired private UsuarioRepository daoUser;
	@Override
	public boolean insert(Usuario user) {
		// TODO Auto-generated method stub
		boolean exito = false;
		if (!daoUser.existsById(user.getLogin())) {
			daoUser.save(user);
			exito = true;
		}
	
		return exito;
	}

	@Override
	public boolean update(Usuario user) {
	// TODO Auto-generated method stub
		boolean exito = false;
		if (daoUser.existsById(user.getLogin())) {
			daoUser.save(user);
			exito = true;
		}
		return exito;
	}

	@Override
	public boolean delete(Usuario user) {
		// TODO Auto-generated method stub
		boolean exito = false;
		if (daoUser.existsById(user.getLogin())) {
			daoUser.delete(user);
			exito = true;
		}
		return exito;
	}

	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return (List<Usuario>) daoUser.findAll();
	}

	@Override
	public Optional<Usuario> findByLogin(String login) {
		// TODO Auto-generated method stub
		return daoUser.findById(login);
	}

}

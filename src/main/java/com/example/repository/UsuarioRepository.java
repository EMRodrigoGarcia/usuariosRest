package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.modelo.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String> {

}

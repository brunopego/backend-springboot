package com.brunopego.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brunopego.domain.Categoria;
import com.brunopego.repositories.CategoriaRepository;
import com.brunopego.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> 
		new ObjectNotFoundException
		("Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}

}

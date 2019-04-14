package com.brunopego.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brunopego.domain.Categoria;
import com.brunopego.domain.Cliente;
import com.brunopego.repositories.ClienteRepository;
import com.brunopego.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> 
		new ObjectNotFoundException
		("Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}

}

package com.codingdojo.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.dojosandninjas.models.Dojo;
import com.codingdojo.dojosandninjas.repositories.DojosRepository;

@Service
public class DojosService {
	private final DojosRepository dojosRepository;

	public DojosService(DojosRepository dojosRepository) {
		this.dojosRepository = dojosRepository;	
	}
	//FIND ALL DOJOS
	public List<Dojo> findAllNDojos(){
		return dojosRepository.findAll();
		}
	//FIND ONE DOJO
	public Dojo findDojoById(Long id) {
		Optional<Dojo> optionalDojo = dojosRepository.findById(id);
		if(optionalDojo.isPresent()) {
			return optionalDojo.get();
		}else {
			return null;
		}
	}
	//CREATE A NEW DOJO
	public Dojo createDojo(Dojo dojo) {
		return dojosRepository.save(dojo);
	}
	
}

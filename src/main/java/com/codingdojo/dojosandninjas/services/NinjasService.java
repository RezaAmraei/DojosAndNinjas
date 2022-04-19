package com.codingdojo.dojosandninjas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.dojosandninjas.models.Ninja;
import com.codingdojo.dojosandninjas.repositories.NinjasRepository;

@Service
public class NinjasService {
	private final NinjasRepository ninjasRepository;
	
	public NinjasService(NinjasRepository ninjasRepository) {
		this.ninjasRepository = ninjasRepository;
	}
	
	//FIND ALL NINJAS
	public List<Ninja> findAllNinjas(){
		return ninjasRepository.findAll();
	}
	
	public Ninja createNinja(Ninja ninja) {
		return ninjasRepository.save(ninja);
	}
}

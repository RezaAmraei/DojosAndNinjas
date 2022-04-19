package com.codingdojo.dojosandninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.dojosandninjas.models.Dojo;



public interface DojosRepository extends CrudRepository<Dojo,Long> {
	List<Dojo> findAll();
}

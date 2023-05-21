package com.apulia.javaee.restapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.apulia.javaee.restapi.entity.Universita;

@Repository
public interface UniversitaRepository extends CrudRepository<Universita, Integer>{

}

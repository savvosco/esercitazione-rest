package com.apulia.javaee.restapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.apulia.javaee.restapi.entity.Studente;

@Repository
public interface StudenteRepository extends CrudRepository<Studente, Integer> {

}

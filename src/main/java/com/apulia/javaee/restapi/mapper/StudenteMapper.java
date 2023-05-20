package com.apulia.javaee.restapi.mapper;

import org.springframework.stereotype.Component;

import com.apulia.javaee.restapi.dto.StudenteDto;
import com.apulia.javaee.restapi.entity.Studente;
import com.apulia.javaee.restapi.entity.Universita;

@Component
public class StudenteMapper {

	public StudenteDto convertToDto(Studente s) {
		return StudenteDto.builder().nome(s.getNome()).cognome(s.getCognome()).matricola(s.getMatricola()).id(s.getId())
				.idUniversita(s.getUniversita().getId()).build();
	}

	public Studente convertFromDto(StudenteDto s) {
		return Studente.builder().nome(s.getNome()).cognome(s.getCognome()).matricola(s.getMatricola()).id(s.getId())
				.universita(Universita.builder().id(s.getIdUniversita()).build()).build();
	}

}

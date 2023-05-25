package com.apulia.javaee.restapi.mapper;

import org.springframework.stereotype.Component;

import com.apulia.javaee.restapi.dto.StudenteDto;
import com.apulia.javaee.restapi.entity.Studente;
import com.apulia.javaee.restapi.entity.Universita;

@Component
public class StudenteMapper {

	public StudenteDto convertToDto(Studente s) {

		StudenteDto result = new StudenteDto();
		result.setNome(s.getNome());
		result.setCognome(s.getCognome());
		result.setMatricola(s.getMatricola());
		result.setId(s.getId());
		result.setIdUniversita(s.getUniversita().getId());

		return result;
	}

	public Studente convertFromDto(StudenteDto s) {
		
		Universita universita = new Universita();
		universita.setId(s.getIdUniversita());

		Studente result = new Studente();
		result.setNome(s.getNome());
		result.setCognome(s.getCognome());
		result.setMatricola(s.getMatricola());
		result.setId(s.getId());
		result.setUniversita(universita);
		return result;
	}

}

package com.apulia.javaee.restapi.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Component;

import com.apulia.javaee.restapi.dto.StudenteDto;
import com.apulia.javaee.restapi.dto.UniversitaDto;
import com.apulia.javaee.restapi.entity.Studente;
import com.apulia.javaee.restapi.entity.Universita;

@Component
public class UniversitaMapper {

	public Universita convertFromDto(UniversitaDto u) {

		return Universita.builder().nome(u.getNome()).citta(u.getCitta())
				.id(Objects.isNull(u.getId()) ? null : u.getId()).build();
	}

	public UniversitaDto convertUniversitaBuilder(Universita u) {
		return UniversitaDto.builder().nome(u.getNome()).citta(u.getCitta()).id(u.getId()).build();
	}

	public Studente convertDtoToStudent(StudenteDto s) {
		return Studente.builder().nome(s.getNome()).cognome(s.getCognome()).matricola(s.getMatricola()).build();
	}

	public List<Studente> convertDtoListToStudent(List<StudenteDto> list) {
		if (list != null)
			return list.stream().map(p -> convertDtoToStudent(p)).toList();
		return new ArrayList<>();
	}

	public StudenteDto convertStudentToDto(Studente s) {
		return StudenteDto.builder().nome(s.getNome()).cognome(s.getCognome()).matricola(s.getMatricola()).build();
	}

	public List<StudenteDto> convertStudentListToDto(List<Studente> list) {
		return list.stream().map(p -> convertStudentToDto(p)).toList();
	}

}

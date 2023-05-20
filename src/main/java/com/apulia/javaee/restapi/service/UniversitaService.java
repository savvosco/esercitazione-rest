package com.apulia.javaee.restapi.service;

import java.util.List;

import com.apulia.javaee.restapi.dto.StudenteDto;
import com.apulia.javaee.restapi.dto.UniversitaDto;

public interface UniversitaService {
	
	List<UniversitaDto> getListaUniversita();
	
	UniversitaDto getUniversita(Integer id);
	
	List<StudenteDto> getListaStudenti(Integer id);

	UniversitaDto saveUniversita(UniversitaDto u);
	
}

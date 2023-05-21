package com.apulia.javaee.restapi.service;

import java.util.List;

import com.apulia.javaee.restapi.dto.StudenteDto;

public interface StudenteService {
	
	StudenteDto getStudenteById(Integer id);
	
	List<StudenteDto> getStudenti();
	
	StudenteDto saveOrUpdateStudente(StudenteDto s);
	
}

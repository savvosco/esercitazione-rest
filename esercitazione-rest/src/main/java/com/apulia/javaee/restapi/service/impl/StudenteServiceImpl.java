package com.apulia.javaee.restapi.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apulia.javaee.restapi.dto.StudenteDto;
import com.apulia.javaee.restapi.entity.Studente;
import com.apulia.javaee.restapi.mapper.StudenteMapper;
import com.apulia.javaee.restapi.repository.StudenteRepository;
import com.apulia.javaee.restapi.service.StudenteService;

@Service
public class StudenteServiceImpl implements StudenteService {

	private final static Logger LOGGER = LoggerFactory.getLogger(StudenteServiceImpl.class);

	@Autowired
	private StudenteRepository studenteRepo;

	@Autowired
	private StudenteMapper mapper;

	@Override
	public StudenteDto getStudenteById(Integer id) {
		return StudenteDto.builder().build();
	}

	@Override
	public List<StudenteDto> getStudenti() {
		return new ArrayList<>();
	}

	@Override
	public StudenteDto saveOrUpdateStudente(StudenteDto studente) {
		return StudenteDto.builder().build();
	}

}

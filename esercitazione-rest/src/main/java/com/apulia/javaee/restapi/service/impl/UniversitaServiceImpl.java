package com.apulia.javaee.restapi.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apulia.javaee.restapi.dto.StudenteDto;
import com.apulia.javaee.restapi.dto.UniversitaDto;
import com.apulia.javaee.restapi.mapper.StudenteMapper;
import com.apulia.javaee.restapi.mapper.UniversitaMapper;
import com.apulia.javaee.restapi.repository.UniversitaRepository;
import com.apulia.javaee.restapi.service.UniversitaService;

@Service
public class UniversitaServiceImpl implements UniversitaService {

	private final static Logger LOGGER = LoggerFactory.getLogger(UniversitaServiceImpl.class);

	@Autowired
	private UniversitaRepository universitaRepo;

	@Autowired
	private UniversitaMapper mapperUni;

	@Autowired
	private StudenteMapper mapperStudenti;

	@Override
	public List<UniversitaDto> getListaUniversita() {
		return new ArrayList<>();
	}

	@Override
	public List<StudenteDto> getListaStudenti(Integer id) {
		return new ArrayList<>();
	}

	@Override
	public UniversitaDto getUniversita(Integer id) {
		return new UniversitaDto();
	}

	@Override
	public UniversitaDto saveUniversita(UniversitaDto u) {
		return new UniversitaDto();
	}

}

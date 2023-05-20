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
import com.apulia.javaee.restapi.entity.Universita;
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

		Optional<Studente> resultFindById = studenteRepo.findById(id);
		Studente s = resultFindById.get();
		StudenteDto result = mapper.convertToDto(s);
		return result;
	}

	@Override
	public List<StudenteDto> getStudenti() {

		List<Studente> lista = (List<Studente>) studenteRepo.findAll();

		List<StudenteDto> listToRetun = new ArrayList<>();

		for (Studente studente : lista)
			listToRetun.add(mapper.convertToDto(studente));

		return listToRetun;
	}

	
	@Override
	public StudenteDto saveOrUpdateStudente(StudenteDto studente) {
		
		Studente s = new Studente();
		
		s.setNome(studente.getNome());
		s.setCognome(studente.getCognome());
		s.setMatricola(studente.getMatricola());
		s.setUniversita(new Universita().builder().id(studente.getIdUniversita()).build());
		
		Studente result = studenteRepo.save(s);
		
		return mapper.convertToDto(result);
	}

	
//	@Override
//	public void saveStudente(SaveStudentRequest request) {
//		
//		Studente s = new Studente();
//		s.setNome(request.getNome());
//		s.setCognome(request.getCognome());
//		s.setMatricola(request.getMatricola());
//		s.setUniversita(new Universita().builder().id(request.getIdUniversita()).build());
//		studenteRepo.save(s);
//	}

}

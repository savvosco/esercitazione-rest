package com.apulia.javaee.restapi.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apulia.javaee.restapi.dto.StudenteDto;
import com.apulia.javaee.restapi.dto.UniversitaDto;
import com.apulia.javaee.restapi.entity.Studente;
import com.apulia.javaee.restapi.entity.Universita;
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

		List<Universita> list = (List<Universita>) universitaRepo.findAll();

		List<UniversitaDto> listToReturn = new ArrayList<>();

		for (Universita universita : list) {
			listToReturn.add(mapperUni.convertUniversitaBuilder(universita));
		}

		return listToReturn;
	}

	@Override
	public List<StudenteDto> getListaStudenti(Integer id) {

		Optional<Universita> resultQuery = universitaRepo.findById(id);
		Universita u = resultQuery.get();
		List<Studente> listaStudenti = u.getStudenti();
		List<StudenteDto> listToReturn = new ArrayList<>();

		for (int i = 0; i < listaStudenti.size(); i++) {
			listToReturn.add(mapperStudenti.convertToDto(listaStudenti.get(i)));
		}

		return listToReturn;
	}

	@Override
	public UniversitaDto getUniversita(Integer id) {
		return mapperUni.convertUniversitaBuilder(universitaRepo.findById(id).get());
	}

	@Override
	public UniversitaDto saveUniversita(UniversitaDto u) {
		Universita result = universitaRepo.save(mapperUni.convertFromDto(u));
		return mapperUni.convertUniversitaBuilder(result);
	}

}

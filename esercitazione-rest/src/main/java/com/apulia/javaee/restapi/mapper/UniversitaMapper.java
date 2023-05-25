package com.apulia.javaee.restapi.mapper;

import org.springframework.stereotype.Component;

import com.apulia.javaee.restapi.dto.UniversitaDto;
import com.apulia.javaee.restapi.entity.Universita;

@Component
public class UniversitaMapper {

	public Universita convertFromDto(UniversitaDto uni) {

		Universita result = new Universita();
		result.setNome(uni.getNome());
		result.setCitta(uni.getCitta());
		result.setId(uni.getId());
		
		return result;
	}

	
	public UniversitaDto convertToDto(Universita uni) {

		UniversitaDto result = new UniversitaDto();
		result.setNome(uni.getNome());
		result.setCitta(uni.getCitta());
		result.setId(uni.getId());		

		return result;
	}

}

package com.apulia.javaee.restapi.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudenteDto {

	private int id;
	private Integer idUniversita;
	private String nome;
	private String cognome;
	private String matricola;
	
}

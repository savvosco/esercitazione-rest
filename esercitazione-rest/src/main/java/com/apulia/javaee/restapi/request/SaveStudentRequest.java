package com.apulia.javaee.restapi.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SaveStudentRequest {

	private String nome;
	private String cognome;
	private String matricola;
	private Integer idUniversita;
	
}

package com.apulia.javaee.restapi.request;

import java.util.List;

import com.apulia.javaee.restapi.dto.StudenteDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddStudenteToUniversitaRequest {

	private Integer idUniversita;
	private List<StudenteDto> studenti;
}

package com.apulia.javaee.restapi.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.apulia.javaee.restapi.dto.StudenteDto;
import com.apulia.javaee.restapi.dto.UniversitaDto;
import com.apulia.javaee.restapi.service.UniversitaService;

@RestController
@RequestMapping("/universita")
public class UniversitaController {

	private final static Logger LOGGER = LoggerFactory.getLogger(UniversitaController.class);

	@Autowired
	private UniversitaService universitaService;

	@GetMapping("/get-studenti")
	public ResponseEntity<List<StudenteDto>> getStudentiUniversita(
			@RequestParam(name = "id", required = true) Integer idUniversita) {
		List<StudenteDto> result = universitaService.getListaStudenti(idUniversita);
		return ResponseEntity.ok(result);
	}

	@GetMapping("/get-by-id")
	public ResponseEntity<UniversitaDto> getUniversita(
			@RequestParam(name = "id", required = true) Integer idUniversita) {
		UniversitaDto result = universitaService.getUniversita(idUniversita);
		return ResponseEntity.ok(result);
	}

	@GetMapping("/get-all")
	public ResponseEntity<List<UniversitaDto>> getUniversita() {
		List<UniversitaDto> result = universitaService.getListaUniversita();
		return ResponseEntity.ok(result);
	}

	@PostMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<UniversitaDto> addUniversita(@RequestBody UniversitaDto u) {
		UniversitaDto result = universitaService.saveUniversita(u);
		return ResponseEntity.ok(result);
	}

}

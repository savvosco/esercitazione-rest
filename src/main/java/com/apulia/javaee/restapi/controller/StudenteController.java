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
import com.apulia.javaee.restapi.service.StudenteService;

@RestController
@RequestMapping("/studente")
public class StudenteController {

	private final static Logger LOGGER = LoggerFactory.getLogger(StudenteController.class);

	@Autowired
	private StudenteService studenteService;

	@GetMapping("/get-by-id")
	public ResponseEntity<StudenteDto> getStudente(@RequestParam(name = "id", required = true) Integer idStudente) {
		StudenteDto result = studenteService.getStudenteById(idStudente);
		return ResponseEntity.ok(result);
	}

	@GetMapping("/get-all")
	public ResponseEntity<List<StudenteDto>> getStudenti() {
		List<StudenteDto> result = studenteService.getStudenti();
		return ResponseEntity.ok(result);
	}

	@PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<StudenteDto> saveStudente(@RequestBody StudenteDto studente) {
		StudenteDto result = studenteService.saveOrUpdateStudente(studente);
		return ResponseEntity.ok(result);
	}

//	@PutMapping("/update/{id}")
//	public ResponseEntity<StudenteDto> updateStudente(@PathVariable(value = "id") Integer studenteId,
//			@RequestBody StudenteDto studente) throws ResourceNotFoundException {
//
//		// studenteService.saveStudente(null);
//
//		return null;
////	     Employee employee = employeeRepository.findById(employeeId)
////	     .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
////
////	     employee.setEmailId(employeeDetails.getEmailId());
////	     employee.setLastName(employeeDetails.getLastName());
////	     employee.setFirstName(employeeDetails.getFirstName());
////	     final Employee updatedEmployee = employeeRepository.save(employee);
////	     return ResponseEntity.ok(updatedEmployee);
//	}

}

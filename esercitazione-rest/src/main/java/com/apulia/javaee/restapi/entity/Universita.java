package com.apulia.javaee.restapi.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "UNIVERSITA")
public class Universita {

	@Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nome;
	
	private String citta;
	
	@OneToMany(mappedBy = "universita", cascade = CascadeType.ALL)
	List<Studente> studenti;

}

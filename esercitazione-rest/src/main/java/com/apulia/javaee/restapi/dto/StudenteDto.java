package com.apulia.javaee.restapi.dto;

import java.util.Objects;

public class StudenteDto {

	private int id;
	private Integer idUniversita;
	private String nome;
	private String cognome;
	private String matricola;

	public StudenteDto(int id, Integer idUniversita, String nome, String cognome, String matricola) {
		super();
		this.id = id;
		this.idUniversita = idUniversita;
		this.nome = nome;
		this.cognome = cognome;
		this.matricola = matricola;
	}

	public StudenteDto() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getIdUniversita() {
		return idUniversita;
	}

	public void setIdUniversita(Integer idUniversita) {
		this.idUniversita = idUniversita;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	@Override
	public String toString() {
		return "StudenteDto [id=" + id + ", idUniversita=" + idUniversita + ", nome=" + nome + ", cognome=" + cognome
				+ ", matricola=" + matricola + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cognome, id, idUniversita, matricola, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudenteDto other = (StudenteDto) obj;
		return Objects.equals(cognome, other.cognome) && id == other.id
				&& Objects.equals(idUniversita, other.idUniversita) && Objects.equals(matricola, other.matricola)
				&& Objects.equals(nome, other.nome);
	}



}

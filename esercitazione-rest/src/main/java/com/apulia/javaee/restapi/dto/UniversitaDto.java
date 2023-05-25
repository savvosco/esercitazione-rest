package com.apulia.javaee.restapi.dto;

import java.util.Objects;

public class UniversitaDto {

	private int id;
	private String nome;
	private String citta;

	public UniversitaDto(int id, String nome, String citta) {
		super();
		this.id = id;
		this.nome = nome;
		this.citta = citta;
	}

	public UniversitaDto() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	@Override
	public int hashCode() {
		return Objects.hash(citta, id, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UniversitaDto other = (UniversitaDto) obj;
		return Objects.equals(citta, other.citta) && id == other.id && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "UniversitaDto [id=" + id + ", nome=" + nome + ", citta=" + citta + "]";
	}

}

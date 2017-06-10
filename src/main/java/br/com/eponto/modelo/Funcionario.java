package br.com.eponto.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Funcionario {

	@Id
	private Integer idFunc;
	
	private String nomeFunc;
	private String cpfFunc;

	public Integer getIdFunc() {
		return idFunc;
	}

	public void setIdFunc(Integer idFunc) {
		this.idFunc = idFunc;
	}

	public String getNomeFunc() {
		return nomeFunc;
	}

	public void setNomeFunc(String nomeFunc) {
		this.nomeFunc = nomeFunc;
	}

	public String getCpfFunc() {
		return cpfFunc;
	}

	public void setCpfFunc(String cpfFunc) {
		this.cpfFunc = cpfFunc;
	}

}

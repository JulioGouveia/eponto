package br.com.eponto.modelo;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Funcionario {

	@Id
	private Integer idFunc;

	private String nomeFunc;
	private String cpfFunc;

	@ElementCollection
	private List<HoraAtual> horaAtual;

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

	public List<HoraAtual> getHoraAtual() {
		return horaAtual;
	}

	public void setHoraAtual(List<HoraAtual> horaAtual) {
		this.horaAtual = horaAtual;
	}

	@Override
	public String toString() {
		return "Funcionario [idFunc=" + idFunc + ", nomeFunc=" + nomeFunc + ", cpfFunc=" + cpfFunc + ", horaAtual="
				+ horaAtual + "]";
	}

}

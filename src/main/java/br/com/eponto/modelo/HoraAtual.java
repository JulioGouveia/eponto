package br.com.eponto.modelo;

import java.util.Calendar;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class HoraAtual {

	@Temporal(TemporalType.TIMESTAMP)
	public Calendar hora;

	//public Tipo tipo;

	public Calendar getHora() {
		return hora;
	}

	public void setHora(Calendar hora) {
		this.hora = hora;
	}

	//public Tipo getTipo() {
	//	return tipo;
	//}

	//public void setTipo(Tipo tipo) {
	//	this.tipo = tipo;
	//}

	@Override
	public String toString() {
		return "HoraAtual [hora=" + hora + "]";
	}

}

package br.com.eponto.controller;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.eponto.modelo.Funcionario;

@Transactional
@Repository
public class RegistraDao {

	@PersistenceContext
	private EntityManager em;

	public void cadastra(Funcionario f1) {
		em.persist(f1);
	}

}

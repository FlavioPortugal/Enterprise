package br.com.fiap.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.ReservaDAO;
import br.com.fiap.dao.impl.ReservaDAOImpl;
import br.com.fiap.entity.Reserva;

class ReservaDAOTeste {

	private static ReservaDAO dao;
	
	@BeforeAll
	public static void iniciar() {
		dao = new ReservaDAOImpl(EntityManagerFactorySingleton
			.getInstance().createEntityManager());
	}
	
	@Test
	void listar() {
		
		List<Reserva> lista = dao.listar();
		
		assertEquals(4, lista.size());
		
	}

}




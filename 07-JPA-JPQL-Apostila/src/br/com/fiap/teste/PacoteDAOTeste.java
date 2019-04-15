package br.com.fiap.teste;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import br.com.fiap.dao.PacoteDAO;
import br.com.fiap.dao.TransporteDAO;

class PacoteDAOTeste {
	
	private static PacoteDAO pacoteDAO;
	private static TransporteDAO transporteDAO;
	
	@BeforeAll
	public static void init() {
		
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}

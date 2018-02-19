package ar.edu.unlam.verano.pb2.testDisco;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.verano.pb2.disco.Disco;


public class TestDisco {

	private Boolean resultado;

	@Test
	public void testCrearDisco(){
		
		Disco miDisco= new Disco(30.00, 50.00);
		resultado = miDisco.verificarDisco();
		assertTrue(resultado);
	}

}

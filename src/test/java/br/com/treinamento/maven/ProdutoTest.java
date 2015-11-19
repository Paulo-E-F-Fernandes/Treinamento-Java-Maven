package br.com.treinamento.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProdutoTest {
	
	@Test
	public void deveSetarAsVariaveis() {
		Produto bala = new Produto("Bala", 15.30);
		// Quando se utiliza double no assertEquals é necessário informar a diferença de erro.
		assertEquals(15.30, bala.getPreco(), 0.0);
		//assertEquals("Bala", bala.getNome());
	}

}

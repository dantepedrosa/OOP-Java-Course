import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteProdutoComTamanho {

	@Test
	void testEqualsObject() {
		
		ProdutoComTamanho produto1 = new ProdutoComTamanho("Axe", 13.99, 0371, 40);
		ProdutoComTamanho produto2 = new ProdutoComTamanho("Rexona", 13.99, 0371, 40);
		
		assertTrue(produto1.equals(produto2));
	}
	
	@Test
	void testNotEqualsObject() {
		
		ProdutoComTamanho produto1 = new ProdutoComTamanho("Axe", 13.99, 0372, 43);
		ProdutoComTamanho produto2 = new ProdutoComTamanho("Rexona", 13.99, 0371, 45);
		
		assertFalse(produto1.equals(produto2));
	}

}

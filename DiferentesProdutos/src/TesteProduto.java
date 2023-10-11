import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteProduto {

	@Test
	void testEqualsObject() {
		
		Produto produto1 = new Produto("Axe", 13.99, 371);
		Produto produto2 = new Produto("Rexona", 13.99, 371);
		
		assertTrue(produto1.equals(produto2));
	}
	
	@Test
	void testNotEqualsObject() {
		
		Produto produto1 = new Produto("Axe", 13.99, 0372);
		Produto produto2 = new Produto("Rexona", 13.99, 0371);
				
		assertFalse(produto1.equals(produto2));
	}

}

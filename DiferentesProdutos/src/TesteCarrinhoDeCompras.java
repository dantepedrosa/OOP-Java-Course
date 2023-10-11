import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteCarrinhoDeCompras {

	@Test
	void testAdionaProdutoDiferente() {
		
		CarrinhoDeCompras c = new CarrinhoDeCompras();
		
		Produto p1 = new Produto("Sorvete", 19.90, 0001);
		Produto p2 = new Produto("Sorvete", 19.90, 0002);
		
		ProdutoComTamanho p3 = new ProdutoComTamanho("Bolo", 14.90, 0001, 300);
		ProdutoComTamanho p4 = new ProdutoComTamanho("Bolo", 17.90, 0001, 400);
		
		c.adcionaProduto(p1, 1);
		c.adcionaProduto(p2, 2);
		c.adcionaProduto(p3, 4);
		c.adcionaProduto(p4, 8);
						
		assertEquals(4, c.carrinho.size());
		
	}

	@Test
	void testAdionaProdutoIgual() {
		
		CarrinhoDeCompras c = new CarrinhoDeCompras();
		
		// Codigos iguais
		Produto p1 = new Produto("Sorvete", 19.90, 0001);
		Produto p2 = new Produto("Sorvete", 19.90, 0001);
		
		// Codigos iguais, tamanho iguais
		ProdutoComTamanho p3 = new ProdutoComTamanho("Bolo", 14.90, 0003, 300);
		ProdutoComTamanho p4 = new ProdutoComTamanho("Bolo", 14.90, 0003, 300);
		// Codigo igual, tamanho diferente
		ProdutoComTamanho p5 = new ProdutoComTamanho("Fubá", 17.90, 0002, 200);
		
		
		c.adcionaProduto(p1, 1);
		c.adcionaProduto(p2, 2);
		c.adcionaProduto(p3, 4);
		c.adcionaProduto(p4, 8);
		c.adcionaProduto(p5, 16);
						
		assertEquals(3, c.carrinho.get(p1));	// 1+2 (soma de produtos iguais)
		assertEquals(12, c.carrinho.get(p3)); 	// 4+8 (soma de produtos iguais)
		assertEquals(16, c.carrinho.get(p5));	// 16  (produto diferente)
		
	}
	
	@Test
	void testRemoveProduto() {
		
		CarrinhoDeCompras c = new CarrinhoDeCompras();
		
		Produto p1 = new Produto("Sorvete", 19.90, 0001);
		Produto p2 = new Produto("Sorvete", 19.90, 0002);
		
		// p3 = p4
		ProdutoComTamanho p3 = new ProdutoComTamanho("Bolo", 14.90, 0003, 300);
		ProdutoComTamanho p4 = new ProdutoComTamanho("Bolo", 14.90, 0003, 300);
		
		c.adcionaProduto(p1, 1);
		c.adcionaProduto(p2, 2);
		c.adcionaProduto(p3, 4);
		c.adcionaProduto(p4, 8);
		
		c.removeProduto(p2, 2);		// Remove totalmente o produto
		c.removeProduto(p4, 9);		// Remove 9 de 12 (4+8)
			
		assertEquals(2, c.carrinho.size());
		assertEquals(3, c.carrinho.get(p3));	
		
	}
	
	
	@Test
	void testRemoveProdutoAMais() {
		
		CarrinhoDeCompras c = new CarrinhoDeCompras();
		
		Produto p1 = new Produto("Sorvete", 19.90, 0001);
		Produto p2 = new Produto("Sorvete", 19.90, 0002);
		
		c.adcionaProduto(p1, 1);
		c.adcionaProduto(p2, 2);
		
		// Remove 3 sendo que tem apenas 2 do produto p2
		c.removeProduto(p1, 3);
		
		assertEquals(1, c.carrinho.size());
		// Conferir no console se o aviso foi emitido
	}

	
	@Test
	void testCalculaTotal() {

		CarrinhoDeCompras c = new CarrinhoDeCompras();
		
		Produto p1 = new Produto("Sorvete", 19.90, 0001);
		Produto p2 = new Produto("Sorvete", 19.90, 0001);
		
		ProdutoComTamanho p3 = new ProdutoComTamanho("Bolo", 14.90, 0003, 300);
		ProdutoComTamanho p4 = new ProdutoComTamanho("Bolo", 14.90, 0003, 300);
		
		ProdutoComTamanho p5 = new ProdutoComTamanho("Fubá", 17.90, 0002, 200);

		// 19.9 + 19.9 + 14.90 + 2 x 14.90 + 17.90 = 102.4
		c.adcionaProduto(p1, 1);
		c.adcionaProduto(p2, 1);
		c.adcionaProduto(p3, 1);
		c.adcionaProduto(p4, 2);
		c.adcionaProduto(p5, 1);
		
		assertEquals(102.4, c.calculaTotal());
	
	}
	
}

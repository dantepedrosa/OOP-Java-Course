import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

class Pizza_Test {
	
	@AfterAll
	static void limpaIngredientes() {
		
		Pizza.zeraIngredientes();
		
		assertTrue(Pizza.totalIngredientes.isEmpty());
	}

	@Test
	void testaPrecoPizzas() {
		
		// Fazer o pedido de cada pizza e seu ingredientes
		Pizza pizza1 = new Pizza("Peperoni", "Calabresa", "Frango"); // 20 reais
		Pizza pizza2 = new Pizza("Tomate", "Cebola", "Frango", "Ovo", "Pimentão", "Milho"); // 23 reais
		Pizza pizza3 = new Pizza("Marguerita"); // 15 reais
		
		assertEquals(20, pizza1.getPreco());
		assertEquals(23, pizza2.getPreco());
		assertEquals(15, pizza3.getPreco());
		
	}
	
	@Test
	void testaPrecoTotal() {
		
		CarrinhoDeCompras carrinho1 = new CarrinhoDeCompras();
		
		Pizza p1 = new Pizza("caramelo", "picanha", "sorvete");		// 20 reais
		Pizza p2 = new Pizza("cebolitos", "picanha", "abóbora", "terra", "sorvete", "Marguerita"); // 23 reais
		Pizza p3 = new Pizza(); // 0 reais (sem ingredientes)
		
		System.out.println("Seu gosto pra pizza é horroroso");
		
		// Adcionar pizzas ao carrinho
		carrinho1.addcionarCarrinho(p1);
		carrinho1.addcionarCarrinho(p2);
		carrinho1.addcionarCarrinho(p3);
		
		assertEquals(43, carrinho1.valorTotal); // Confere preço total do carrinho
		assertEquals(2, carrinho1.pizzasCarrinho.size()); // Confere número de pizzas no carrinho
		
	}	
}


public class Principal
{

	public static void main(String[] args)
	{
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		// Fazer o pedido de cada pizza e seu ingredientes
		Pizza pizza1 = new Pizza("Peperoni", "Calabresa", "Frango");
		Pizza pizza2 = new Pizza("Tomate", "Cebola", "Frango", "Ovo", "Pimentão", "Milho");
		Pizza pizza3 = new Pizza("Marguerita");
		
		// Adcionar pizzas ao carrinho
		carrinho.addcionarCarrinho(pizza1);
		carrinho.addcionarCarrinho(pizza2);
		carrinho.addcionarCarrinho(pizza3);
		
		// Imprime o total do carrinho
		System.out.println("O valor total do carrinho é de R$ " + carrinho.valorTotal+",00\n");
		
		// Imprime a quantidade utilizada de cada ingrediente
		Pizza.imprimirIngredientesUsados();
		
	}
}

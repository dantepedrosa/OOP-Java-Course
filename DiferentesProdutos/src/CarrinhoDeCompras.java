import java.util.HashMap;

public class CarrinhoDeCompras {
	
	// Carrinho de compras
	HashMap<Produto, Integer> carrinho = new HashMap<Produto, Integer>();
	
	// Metodos
	// Adciona um produto "produto", com quantidade "quantidade", ao carrinho de compras
	protected void adcionaProduto(Produto produto, int quantidade) {
				
		for(Produto i : carrinho.keySet()) {
			if (i.equals(produto)) {
				carrinho.put(i, (carrinho.get(i) + quantidade));
				return;
			}
		}
		
		carrinho.put(produto, quantidade);
		return;
		
	
	}
	// Remove um produto "produto", com quantidade "quantidade", ao carrinho de compras
	// Caso a quantidade do produto seja menor ou igual que a quantidade a remover, remove o produto do carrinho
	protected void removeProduto(Produto produto, int quantidade) {
		
		for(Produto i : carrinho.keySet()) {
			if (i.equals(produto)) {
				if (carrinho.get(i) > quantidade)
					carrinho.put(i, (carrinho.get(i) - quantidade));
				else {
					if(carrinho.get(i) < quantidade)
						System.out.println(
								String.format("Aviso: a quantidade de %s é menor que quantidade a remover. ", produto.getNome())
								+ "O produto foi excluído do carrinho");
					carrinho.remove(i);
				}
				return;
			}
		}
	}
	
	// Calcula o preço total do carrinho
	protected double calculaTotal() {
		
		double precoTotal = 0;
		
		for (Produto i : carrinho.keySet())
			precoTotal += i.getPreco() * carrinho.get(i);
		
		return precoTotal;
	}
}

import java.util.ArrayList;

public class CarrinhoDeCompras 
{
	
	int valorTotal;
	
	public ArrayList<Pizza> pizzasCarrinho = new ArrayList<Pizza>();
	
	// Confere se a pizza adcionada tem igredientes
	// Apenas caso tenha, soma o preço no total e adciona ao carrinho
	public int addcionarCarrinho(Pizza p)
	{
		if (p.ingredientesPizza.size() != 0)
		{
			valorTotal += p.getPreco();
			pizzasCarrinho.add(p);
		}
		else
			// Uma mensagem extra
			System.out.println("Erro: A pizza não pode ser adcionada no carrinho por falta de ingredientes\n");
			
		return valorTotal;
	}
}

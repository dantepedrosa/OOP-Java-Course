import java.util.HashSet;
import java.util.HashMap;

public class Pizza 
{
	char preco;
	
	// Ingredientes presentes em uma única pizza (não contabiliza ingedientes repetidos)
	HashSet<String> ingredientesPizza = new HashSet<String>();	
	// Ingredientes usados em todas as pizzas e quantidade
	static HashMap<String, Integer> totalIngredientes = new HashMap<String, Integer>();
	
	
	// Construtor da Classe
	// Recebe qualquer quantidade de ingredientes e adciona-os à pizza
	public Pizza(String... ingredientes)
	{
		for (String i : ingredientes)
			adcionaIngediente(i);
	}
	
	// Adciona o igrediente à lista de ingredientes do objeto
	public void adcionaIngediente(String ingrediente)
	{
		ingredientesPizza.add(ingrediente);
		contabilizaIngrediente(ingrediente);
	}
	
	// Define o preço da pizza a partir do tamanho da lista de ingredientes da pizza
	public char getPreco()
	{
		int numIngredientes = ingredientesPizza.size();
		
		if (numIngredientes <= 2)
			preco = 15;
		else if (numIngredientes <= 5)
			preco = 20;
		else
			preco = 23;
		
		return preco;
	}
	
	// Contabiliza os ingredientes da pizza na lista do total de ingredientes
	// Caso o ingediente já foi adcionado, apenas soma o valor
	public static void contabilizaIngrediente(String ingrediente)
	{
		if (totalIngredientes.containsKey(ingrediente))
			totalIngredientes.put(ingrediente, (totalIngredientes.get(ingrediente)+1));
		else
			totalIngredientes.put(ingrediente, 1);
	}
	
	// Função que indica todos os ingredientes usados
	// Considerei que imprimir a quantidade de cada ingrediente cabe à classe pizza, e não à Principal
	public static void imprimirIngredientesUsados()
	{
		for (String i : totalIngredientes.keySet())
		{
			System.out.println("O ingrediente "+i+" foi usado "+totalIngredientes.get(i)+" vezes");
		}
	}
	
	public static void zeraIngredientes()
	{
		totalIngredientes.clear();
	}

}

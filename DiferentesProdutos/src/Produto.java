
public class Produto {
	
	private String nome;
	private int codigo;
	private double preco;
	
	Produto(String nome, double preco, int codigo) {
		this.nome = nome;
		this.preco = preco;
		this.codigo = codigo;
	}
	
	
	public double getPreco() {
		return preco;
	}


	public String getNome() {
		return nome;
	}

	public int hashCode() {
        return this.codigo * 7;
	}
	
	public boolean equals (Object objeto) {
		if (objeto instanceof Produto) {
			if (this.hashCode() == objeto.hashCode())
				return true;
		}
		return false;
	}

	
}

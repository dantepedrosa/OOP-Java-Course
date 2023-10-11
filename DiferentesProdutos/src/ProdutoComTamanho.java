
public class ProdutoComTamanho extends Produto {
	
	int tamanho;
	
	ProdutoComTamanho(String nome, double preco, int codigo, int tamanho) {
		super(nome, preco, codigo);
		this.tamanho = tamanho;
		
	}	
	
	public int hashCode() {
		return super.hashCode() * tamanho;
	}
	
	public boolean equals (Object objeto) {
		if (objeto instanceof ProdutoComTamanho) {
			if (this.hashCode() == objeto.hashCode())
				return true;
		}
		return false;
	}
	
}


public class Carro {
	
	int potencia;
	int velocidade;
	String nome;
	
	Carro(String nome) {
		if (nome == ""){
			nome = "Genérico";
		}
		this.potencia = 0;
		this.velocidade = 0;
		this.nome = nome;
	}
	
	void acelerar() {
		velocidade += potencia;
	}
	void frear() {
		velocidade /= 2;
	}
	
	int getVelocidade() {
		return velocidade;
	}
	
	void imprimir() {
		System.out.println("Caralho mano! O/A " + nome + " tá a " + velocidade + " km/h");
	}
	
}

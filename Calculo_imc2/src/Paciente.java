public class Paciente {
	
	double peso;
	double altura;
	double IMC;
	
	public Paciente(double peso, double altura) {
		
		this.peso = peso;
		this.altura = altura;
	}
	
	public double calcularIMC() {
		
		IMC = peso / (altura * altura);
		return IMC;
	}
	
	public String diagnostico() {
		
		calcularIMC();
		
		if 		(16 > IMC) 					return "Baixo peso muito grave";
		else if (16 < IMC && IMC < 16.99) 	return "Baixo peso grave";
		else if (17 < IMC && IMC < 18.49) 	return "Baixo peso";
		else if (18.5 < IMC && IMC < 24.99) return "Peso normal";
		else if (25 < IMC && IMC < 29.99) 	return "Sobrepeso";
		else if (30 < IMC && IMC < 34.99) 	return "Obesidade grau I";
		else if (35 < IMC && IMC < 39.99) 	return "Obesidade grau II";
		else  								return "Obesidade grau III (obesidade mórbida)";
	}
	
}
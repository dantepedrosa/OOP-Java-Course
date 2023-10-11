import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteIMC {
	

	String mensagem;


	@Test
	void testaBaixoPesoMuitoGrave() {
		
		Paciente p = new Paciente(50, 1.9);
		mensagem = "Baixo peso muito grave";
		
		assertTrue(mensagem == p.diagnostico(), "IMC = "+String.valueOf(p.IMC));
	}
	
	@Test
	void testaBaixoPesoGrave() {
		
		Paciente p = new Paciente(55, 1.85);
		mensagem = "Baixo peso grave";
		
		assertTrue(mensagem == p.diagnostico(), "IMC = "+String.valueOf(p.IMC));
	}
	
	@Test
	void testaBaixoPeso() {
		
		Paciente p = new Paciente(60, 1.85);
		mensagem = "Baixo peso";
		
		assertTrue(mensagem == p.diagnostico(), "IMC = "+String.valueOf(p.IMC));
	}
	
	@Test
	void testaPesoNormal() {
		
		Paciente p = new Paciente(60, 1.8);
		mensagem = "Peso normal";
		
		assertTrue(mensagem == p.diagnostico(), "IMC = "+String.valueOf(p.IMC));
	}
	
	@Test
	void testaSobrepeso() {
		
		Paciente p = new Paciente(80, 1.7);
		mensagem = "Sobrepeso";
		
		assertTrue(mensagem == p.diagnostico(), "IMC = "+String.valueOf(p.IMC));
	}
	
	@Test
	void testaObesidadeGrauI() {
		
		Paciente p = new Paciente(80, 1.6);
		mensagem = "Obesidade grau I";
		
		assertTrue(mensagem == p.diagnostico(), "IMC = "+String.valueOf(p.IMC));
	}
	
	@Test
	void testaObesidadeGrauII() {
		
		Paciente p = new Paciente(80, 1.5);
		mensagem = "Obesidade grau II";
		
		assertTrue(mensagem == p.diagnostico(), "IMC = "+String.valueOf(p.IMC));
	}
	
	@Test
	void testaObesidadeGrauIII() {
		
		Paciente p = new Paciente(90, 1.5);
		mensagem = "Obesidade grau III (obesidade mórbida)";
		
		assertTrue(mensagem == p.diagnostico(), "IMC = "+String.valueOf(p.IMC));
	}
	

}

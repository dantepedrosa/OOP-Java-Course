import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.Test;

class TesteBancoDePalavras {
	
	private String path = "C:\\Users\\dante\\Documents\\ACADEMICO\\Cursos\\Orientação a Objetos com Java - Coursera\\eclipse-workspace\\JogoDasPalavras\\test";
	
	@Test
	void testSorteiaPalavra() throws FileNotFoundException {
		BancoDePalavras banco = new BancoDePalavras(this.path + "\\test_palavras_1.txt");
		String palavra = banco.sorteiaPalavra();
		assumeTrue((banco.getTamanhoLista() == 2));
		assertTrue(palavra.equals("morango") || palavra.equals("beterrabas"));
	}

	@Test
	void testSetPath() throws FileNotFoundException {
		BancoDePalavras banco = new BancoDePalavras(this.path + "\\test_palavras_1.txt");
		assumeTrue((banco.getTamanhoLista() == 2));
		banco.setPath(this.path + "\\test_palavras_2.txt");
		assumeTrue((banco.getTamanhoLista() == 3));
		String palavra = banco.sorteiaPalavra();
		assertTrue(palavra.equals("abacaxi") || palavra.equals("vinagrete") || palavra.equals("quiabo"));
	}

}

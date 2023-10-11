import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.Test;

class BancoDePalavrasTest {

	@Test
	void testSorteiaPalavra() throws FileNotFoundException {
		BancoDePalavras banco = new BancoDePalavras("/home/dante/Projects/CURSOS/Orientação a Objetos com Java/Eclipse_Workspace/JogoDasPalavras/palavras.txt");
		System.out.println(banco.sorteiaPalavra());
	}

}

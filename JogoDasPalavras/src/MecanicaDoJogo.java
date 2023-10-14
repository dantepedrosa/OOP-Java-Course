/**
 * Interface que representa o andamento e a lógica do jogo. 
 * É responsável por ditar o andamento do jogo. 
 */
public interface MecanicaDoJogo {

	public int incrementaVidas(int v);	// Soma o número de vidas em um e retorna o número atual
	public int getVidas();				// Retorna o numero de vidas
	public int getPontos();				// Retorna a quantidade de pontos do jogo atual
	public boolean getDificuldade(); 	// Determina o tamanho da palavra
	
	
	public String getPalavra();					// Retorna uma palavra embaralhada
	public boolean enviarTentativa(String p); 	// Enviar a palavra montada. Retorna true para correto.
	
	
}

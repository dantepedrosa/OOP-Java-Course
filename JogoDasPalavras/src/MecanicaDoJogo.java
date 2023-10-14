/**
 * Interface que representa o andamento e a lógica do jogo. 
 * É responsável por ditar o andamento do jogo. 
 */
public interface MecanicaDoJogo {

	public int somaVidas(int v);		// Soma o número de vidas em v e retorna o número atual
	public int perdeVida(int v);		// Subtrai o número de vidas em v e retorna o número atual
	public int getVidas();				// Retorna o numero de vidas
	
	public int somaPontos(int n);		// Soma o numero de pontos em n e retorna o número atual
	public int getPontos();				// Retorna a quantidade de pontos do jogo atual
	
	public void setDifuculdade(int d);	// Determina a dificuldade do jogo
	public int getDificuldade(); 		// Retorna a dificuldade configurada para o jogo
	public int getDificuldadePalavra(String p);	// Configura a dificuldade da palavra p
	
	public String getPalavra();					// Retorna uma palavra embaralhada
	public boolean enviarTentativa(String p); 	// Enviar a palavra montada. Retorna true para correto.
}

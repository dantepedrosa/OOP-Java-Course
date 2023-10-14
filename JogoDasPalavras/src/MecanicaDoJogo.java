/**
 * Interface que representa o andamento e a lógica do jogo. 
 * É responsável por ditar o andamento do jogo. 
 */
public interface MecanicaDoJogo {

	/** 
	 * Soma o número de vidas em v e retorna o número atual
	 * 
	 * @param v numero de vidas a somar
	 * @return	numero total de vidas
	 */
	public int somaVidas(int v);
	
	/** 
	 * Subtrai o número de vidas em v e retorna o número atual
	 * 
	 * @param v numero de vidas a perder
	 * @return 	numero total de vidas
	 */
	public int perdeVida(int v);
	
	/** 
	 * Retorna o numero de vidas
	 * 
	 * @return	numero total de vidas
	 */
	public int getVidas();
	
	/** 
	 * Equivalente a colocar uma moeda para tentar novamente
	 */
	public void novaChance();
	
	/** 
	 * Soma o numero de pontos em n e retorna o número atual
	 * 
	 * @param n	numero de pontos a somar
	 * @return	total de pontos
	 */
	public int somaPontos(int n);
	
	/** 
	 * Retorna a quantidade de pontos do jogo atual
	 * 
	 * @return total de pontos
	 */
	public int getPontos();
	
	/** 
	 * Determina a dificuldade do jogo
	 * 
	 * @param d	dificuldade do jogo
	 */
	public void setDifuculdade(int d);
	
	/**
	 * Retorna a dificuldade configurada para o jogo
	 * 
	 * @return dificuldade do jogo atual
	 */
	public int getDificuldade();
	
	/**
	 * Configura a dificuldade da palavra p
	 * 
	 * @param p	palavra
	 * @return 	dificuldade da palavra
	 */
	public int getDificuldadePalavra(String p);
	
	/**
	 * Retorna uma palavra embaralhada da dificuldade d
	 * 
	 * @return palavra embaralhada
	 */
	public String getPalavra();
	
	/**
	 * Enviar a palavra montada. Retorna true para correto.
	 * 
	 * @param p	palavra montada
	 * @return	Retorna true se correto e false se incorreto
	 */
	public boolean enviarTentativa(String p);
}


public class MecanicaJogoMelhorDeX implements MecanicaDoJogo {
	
	private final int init_vidas;		// Número de vidas que o jogador começa
	private int numVitorias;			// Número de jogos que deve ser ganho
	private int numAcertos;				// Número de vitórias ganhas
	private int vidas;					// Número de vidas que o jogador ainda tem
	private int pontos;					// Número de pontos no jogo (varia com a dificuldade)
	private int dificuldade;			// Dificuldade do jogo atual
	private String palavra;				// Palavra da jogada
	private BancoDePalavras bnc;		// Objeto 
	// TODO - private FabricaEmbaralhadores e;
	
	public MecanicaJogoMelhorDeX(BancoDePalavras banco, int dificuldade, int vidas) {

		this.bnc = banco;
		// TODO - this.e = e.getEmbaralhador();
		this.init_vidas = vidas;
		this.vidas = 0;
		somaVidas(init_vidas);
		setDifuculdade(dificuldade);
		this.numVitorias = init_vidas + 1;
	}
	
	@Override
	public int somaVidas(int v) {
		if(v > 0)
			vidas += v;
		return vidas;
	}

	@Override
	public int perdeVida(int v) {
		if(v > 0)
			vidas -= v;
		return vidas;
	}

	@Override
	public int getVidas() {
		return vidas;
	}
	
	@Override
	public int getAcertos() {
		return numAcertos;
	}

	@Override
	public void novaChance() {
		// TODO - Implementar melhor sistema de vidas
		if(vidas == 0) {
			vidas += 2;
			numVitorias += 2;
		}	
	}

	@Override
	public int somaPontos(int n) {
		if(n > 0)
			pontos += n;
		return pontos;
	}

	@Override
	public int getPontos() {
		return pontos;
	}

	@Override
	public void setDifuculdade(int d) {
		if(d < 0)
			this.dificuldade = 0;
		else if (d > 14)
			this.dificuldade = 14;
	}

	@Override
	public int getDificuldade() {
		return dificuldade;
	}

	@Override
	public int getDificuldadePalavra(String p) {
		return p.length();
	}

	@Override
	public String getPalavra() {
		String p = bnc.sorteiaPalavra();
		switch(dificuldade) {
		case 0:
			// Envia palavras aleatórias
			break;
		case 1:
			// Envia apenas palavras com 6 letras ou menos
			while(getDificuldadePalavra(p) > 6)
				p = bnc.sorteiaPalavra();
			break;
		case 2:
			// Envia apenas palavras com 7 letras ou mais
			while(getDificuldadePalavra(p) < 7)
				p = bnc.sorteiaPalavra();
			break;
		default:
			// Para demais dificuldades, palavras só retornam em seu tamanho
			while(getDificuldadePalavra(p) != dificuldade)
				p = bnc.sorteiaPalavra();
			break;
		}
		this.palavra = p;
		// TODO - return e.embaralhaPalavra(p);
		return p;
	}

	@Override
	public int enviarTentativa(String p) {
		if(p == palavra) {
			somaPontos(getDificuldadePalavra(palavra));
			this.numAcertos++;
			if(this.numAcertos == this.numVitorias)
				return 0;	// Jogo ganho
			return 2;	// Palavra certa
		} else {
			this.vidas--;
			if(this.vidas == 0)
				return 1;	// Jogo perdido
			return 3;	// Palavra errada
		}
	}

}

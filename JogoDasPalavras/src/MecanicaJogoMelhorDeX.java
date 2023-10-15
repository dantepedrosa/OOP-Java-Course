
public class MecanicaJogoMelhorDeX implements MecanicaDoJogo {
	
	private final int init_vidas;		// Número de vidas que o jogador começa
	private final int numVitorias;		// Número de jogos que deve ser ganho
	private int vidas;		// Número de vidas que o jogador ainda tem
	private int pontos;
	private int dificuldade;
	private String palavra;
	private BancoDePalavras bnc;
	private int numAcertos;
	
	
	public MecanicaJogoMelhorDeX(BancoDePalavras banco, int dificuldade, int vidas) {

		this.bnc = banco;
		this.dificuldade = dificuldade;
		this.init_vidas = vidas;
		this.vidas = init_vidas;
		this.numVitorias = init_vidas + 1; // TODO Implementar função no MecanicaDoJogo getAcertos
	}
	
	@Override
	public int somaVidas(int v) {
		if(vidas > 0)
			vidas += v;
		return vidas;
	}

	@Override
	public int perdeVida(int v) {
		if(vidas > 0)
			vidas -= v;
		return vidas;
	}

	@Override
	public int getVidas() {
		return vidas;
	}

	@Override
	public void novaChance() {
		if(vidas == 0)
			vidas += init_vidas;
	}

	@Override
	public int somaPontos(int n) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPontos() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setDifuculdade(int d) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getDificuldade() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getDificuldadePalavra(String p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getPalavra() {
		return null;
	}

	@Override
	public boolean enviarTentativa(String p) {
		// TODO Auto-generated method stub
		return false;
	}

}


public class Respeitoso implements FormatadorNome {

	private String genero;
	
	/* O gênero deve ser Masculino/Feminino.
	 * Qualquer outra string/formatação levará ao resultado "Sr(a).".*/
	public Respeitoso(String genero) {
		this.genero = genero;
	}
	
	@Override
	public String formatarNome(String nome, String sobrenome) {
		if (genero == "Masculino")
			return "Sr. " + sobrenome;
		
		else if (genero == "Feminino")
			return "Sra. " + sobrenome;
		
		else
			return "Sr(a). " + sobrenome;
	}

}

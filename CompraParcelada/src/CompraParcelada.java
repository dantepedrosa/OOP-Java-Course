import static java.lang.Math.pow;

public class CompraParcelada extends Compra {

	private int parcelas;
	private double juros;
	
	public CompraParcelada(double valor, int parcelas, double juros) {
		super(valor);
		
	}

	@Override
	public double total() {
		// total = inicial * (1 + juros) ^ parcelas
		return valor * pow((1 + juros), parcelas);
	}
}
 
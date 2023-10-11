
public class Principal {

	public static void main(String[] args) {
		
		Paciente paciente1 = new Paciente(64, 1.8);
		Paciente paciente2 = new Paciente(45, 1.64);
		Paciente paciente3 = new Paciente(80, 1.5);
		
		System.out.println(
			"O paciente1 está com " + paciente1.diagnostico() + ", com o IMC de " + paciente1.IMC + " kg/m²." 
		);
		System.out.println(
			"O paciente1 está com " + paciente2.diagnostico() + ", com o IMC de " + paciente2.IMC + " kg/m²." 
		);
		System.out.println(
			"O paciente1 está com " + paciente3.diagnostico() + ", com o IMC de " + paciente3.IMC + " kg/m²." 
		);

	}

}

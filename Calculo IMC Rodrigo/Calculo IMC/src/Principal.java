public class Principal {
    public static void main(String[] args) {
        // Criando 3 pacientes aleatorios com altura entre 1.5m ~ 2m, peso entre 50kg ~ 100 kg
        Paciente paciente1 = new Paciente(Math.random() * 0.5 + 1.5, Math.random() * 50 + 50);
        Paciente paciente2 = new Paciente(Math.random() * 0.5 + 1.5, Math.random() * 50 + 50);
        Paciente paciente3 = new Paciente(Math.random() * 0.5 + 1.5, Math.random() * 50 + 50);

        // Gerando os diagnosticos
        paciente1.Diagnostico();
        paciente2.Diagnostico();
        paciente3.Diagnostico();

    }
}

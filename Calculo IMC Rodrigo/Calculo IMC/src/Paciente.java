import java.text.DecimalFormat;

public class Paciente {
    // Inicializando os atributos
    private double altura;
    private double peso;

    //Gerando o construtor
    Paciente(double altura, double peso)
    {
        this.altura = altura;
        this.peso = peso;
    }

    //Calculo do IMC
    private double CalcularIMC()
    {
        return (peso / (altura * altura));
    }

    //Diagnostico final
    public void Diagnostico()
    {
        double IMC = CalcularIMC();
        
        DecimalFormat formatar = new DecimalFormat("0.00");

        String resposta = "";

        if(IMC < 16) { resposta = "Baixo peso muito grave";}
        else if(IMC < 16.99) { resposta = "Baixo peso grave";}
        else if(IMC < 18.49) { resposta = "Baixo peso";}
        else if(IMC < 24.99) { resposta = "Peso normal";}
        else if(IMC < 29.99) { resposta = "Sobrepeso";}
        else if(IMC < 34.99) { resposta = "Obesidade grau I";}
        else if(IMC < 39.99) { resposta = "Obesidade grau II";}
        else if(IMC > 40) { resposta = "Obesidade grau III (obesidade mórbida)";}

        System.out.println("O paciente mede: " + formatar.format(altura) + "m" + ", pesa:"+ formatar.format(peso) +"kg e seu IMC é:" + formatar.format(IMC) + "\n" + resposta);
        System.out.println();
    }
}


/*
    Baixo peso muito grave = IMC abaixo de 16 kg/m²

    Baixo peso grave = IMC entre 16 e 16,99 kg/m²

    Baixo peso = IMC entre 17 e 18,49 kg/m²

    Peso normal = IMC entre 18,50 e 24,99 kg/m²

    Sobrepeso = IMC entre 25 e 29,99 kg/m²

    Obesidade grau I = IMC entre 30 e 34,99 kg/m²

    Obesidade grau II = IMC entre 35 e 39,99 kg/m²

    Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²


*/
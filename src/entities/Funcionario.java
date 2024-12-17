package entities;

public class Funcionario {

    public String nome;
    public double salarioBruto;
    public double desconto;

    public double salarioDescontado(){
        return salarioBruto - desconto;
    }

    public double salarioFinal(double porcentagem){
        return salarioBruto - desconto + ((salarioBruto) * (porcentagem / 100));
    }
}

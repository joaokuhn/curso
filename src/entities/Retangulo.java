package entities;

public class Retangulo {

    public double altura;
    public double base;

    public double calculaArea(){
        return base * altura;
    }

    public double calculaPerimetro(){
        return 2 * (base + altura);
    }

    public double calculaDiagonal(){
        return Math.sqrt(Math.pow(altura, 2) + (Math.pow(base, 2)));
    }
    
}

package entities;

public class Conversor {

    public static double calculaDolar(double cotacao, double dolares){
        return (cotacao * dolares) + (((cotacao * dolares)/100) * 6);
    }

}



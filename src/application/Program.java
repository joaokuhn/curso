package application;

import java.util.Scanner;

import entities.Conversor;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Qual a cotacao do dolar? ");
        double cot = sc.nextDouble();
        System.out.print("Quantos Dolares quer comprar? ");
        double dol = sc.nextDouble();
        
        double dolares = Conversor.calculaDolar(cot, dol);
        System.out.printf("Quantia a pagar em reais: %.2f", dolares);

        sc.close();
    }
}
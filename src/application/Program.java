package application;

import java.util.Scanner;

import entities.Idade;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Idade idade = new Idade();

        System.out.print("Digite os anos: ");
        idade.ano = sc.nextInt();
        System.out.print("Digite os meses: ");
        idade.mes = sc.nextInt();
        System.out.print("Digite os dias: ");
        idade.dia = sc.nextInt();

        System.out.println(idade.calculaIdade() + " dias");


        sc.close();
    }
}
package application;

import java.util.Scanner;

import entities.Conta;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.print("Entre com o numero da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Entre com o nome do titular: ");
        String titular = sc.nextLine();
        System.out.print("Deseja fazer um deposito inicial? ");
        char resposta = sc.next().charAt(0);

        if (resposta == 'y') {
            System.out.print("Qual a quantia que deseja depositar? ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(numero, titular, depositoInicial);
        } else {
            conta = new Conta(numero, titular);
        }

        System.out.println("Dados da Conta: ");
        System.out.println(conta);
        System.out.print("Digite um valor para deposito: ");
        double valorDeposito = sc.nextDouble();
        conta.deposito(valorDeposito);

        System.out.println();
        System.out.println("Dados da Conta Atualizados: ");
        System.out.println(conta);

        System.out.print("Digite um valor para saque: ");
        double valorSaque = sc.nextDouble();
        conta.saque(valorSaque);
        System.out.println();
        System.out.println("Dados da Conta Atualizados: ");
        System.out.println(conta);

        sc.close();
    }

}

package application;

import java.util.Scanner;

import entities.Funcionario;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.println("Nome: ");
        funcionario.nome = sc.nextLine();
        System.out.println("Salario Bruto: ");
        funcionario.salarioBruto = sc.nextDouble();
        System.out.println("Desconto: ");
        funcionario.desconto = sc.nextDouble();

        System.out.println("Funcionario: " + funcionario.nome + ", $" + funcionario.salarioDescontado());

        System.out.println("Quanto devemos acrecentar ao salario? ");
        double porcentagem = sc.nextDouble();
        System.out.println("Funcionario: " + funcionario.nome + ", $" + funcionario.salarioFinal(porcentagem));

        sc.close();

    }
}
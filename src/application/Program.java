package application;

import java.util.Scanner;

import entities.Estudante;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Estudante estudante = new Estudante();

        System.out.print("Primeira nota: ");
        estudante.nota1 = sc.nextDouble();
        System.out.print("Segunda nota: ");
        estudante.nota2 = sc.nextDouble();
        System.out.print("Terceira nota: ");
        estudante.nota3 = sc.nextDouble();

        System.out.println("Nota Final: " + estudante.notaFinal());

        if (estudante.notaFinal() >= 60) {
            System.out.println("Passou!");
        } else {
            System.out.println("Reprovou!");
            System.out.println("Faltou " + (60 - estudante.notaFinal()) + " pontos");
        }
        sc.close();
    }
}
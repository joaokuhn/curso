package application;

import java.util.Scanner;

import entities.Product;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String escolha;

        Product product = new Product();
        System.out.println("Enter product data");
        System.out.println("Name: ");
        product.name = sc.nextLine();
        System.out.println("Price: ");
        product.price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println("Deseja inserir ou remover produtos?");
        System.out.println("I - Inserir | R - Remover | E - Encerrar Programa");
        escolha = sc.next().toUpperCase();

        switch (escolha) {
            case "I":
                System.out.println();
                System.out.println("Enter the number of products to be added in stock: ");

                int quantity = sc.nextInt();
                product.addProducts(quantity);

                System.out.println();
                System.out.println("Updated data: " + product);
                break;

            case "R":

                System.out.println();
                System.out.println("Enter the number of products to remove: ");

                quantity = sc.nextInt();
                product.removeProducts(quantity);

                System.out.println();
                System.out.println("Updated data: " + product);
                break;

            case "E":
                System.out.println("Obrigado por usar o app!");

            default:
                System.out.println("Opção inválida");
                break;
        }

        sc.close();
    }
}
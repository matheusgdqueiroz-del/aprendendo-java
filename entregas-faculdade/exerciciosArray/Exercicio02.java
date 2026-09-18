package exerciciosArray;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] idades = new int[6];

        for (int i = 0; i < idades.length; i++) {
            System.out.printf("Digite a idade da %dª pessoa: ", i + 1);
            idades[i] = sc.nextInt();
        }

        System.out.println("Idades digitadas:");

        for (int idade : idades) {
            System.out.println(idade);
        }

        sc.close();
    }
}
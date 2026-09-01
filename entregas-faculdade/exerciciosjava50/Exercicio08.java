package exerciciosjava50;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        /*
         * Parte 1 — Aquecimento com entrada de dados
         *
         * 8. Dobro e metade
         * Peça um número para o usuário.
         *
         * Mostre o dobro e a metade desse número.
         *
         */
        Scanner sc = new Scanner(System.in);

        double inputNumero, dobro, metade;

        System.out.print("Digite um número: ");
        inputNumero = sc.nextDouble();

        dobro = inputNumero * 2;
        metade = inputNumero / 2;

        System.out.printf("O dobro de %.2f é %.2f, e a metade é %.2f", inputNumero, dobro, metade);

        sc.close();
    }
}

package exerciciosjava50;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        /*
         * Parte 2 — Decisões simples com if
         *
         * 19. Número negativo
         * Peça um número.
         *
         * Se o número for menor que zero, mostre:
         *
         * Número negativo.
         *
         */
        Scanner sc = new Scanner(System.in);

        double numero;

        System.out.println("Digite um numero: ");
        numero = sc.nextDouble();

        if (numero < 0) {
            System.out.println("Número negativo");
        }
        sc.close();
    }
}

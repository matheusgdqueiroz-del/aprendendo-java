package exerciciosjava50;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        /*
         * Parte 3 — Decisões com if e else
         *
         * 24. Par ou ímpar
         * Peça um número inteiro.
         *
         * Verifique se ele é par ou ímpar e mostre o resultado.
         *
         */
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número inteiro: ");
        numero = sc.nextInt();

        if(numero % 2 == 0) {
            System.out.printf("%d é par", numero);
        } else {
            System.out.printf("%d é impar", numero);
        }

        sc.close();
    }
}

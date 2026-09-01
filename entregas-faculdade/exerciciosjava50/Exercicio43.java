package exerciciosjava50;

import java.util.Scanner;

public class Exercicio43 {
    public static void main(String[] args) {
        /*
         * Parte 5 — Operador ternário
         *
         * 43. Par ou ímpar com ternário
         * Peça um número inteiro.
         *
         * Use operador ternário para verificar se ele é par ou ímpar.
         *
         */
        Scanner sc = new Scanner(System.in);

        int numero;
        String mensagem;

        System.out.println("Digite um número inteiro: ");
        numero = sc.nextInt();

        mensagem = numero % 2 == 0 ? "Par" : "Ímpar";

        System.out.println(mensagem);

        sc.close();
    }
}

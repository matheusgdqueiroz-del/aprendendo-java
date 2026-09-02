package exerciciosjava50;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        /*
         * Parte 2 — Decisões simples com if
         *
         * 17. Compra com desconto
         * Peça o valor de uma compra.
         *
         * Se o valor for maior ou igual a 100, mostre:
         *
         * Cliente ganhou desconto.
         *
         */
        Scanner sc = new Scanner(System.in);

        double compra;

        System.out.println("Digite o valor da compra: ");
        compra = sc.nextDouble();

        if (compra >= 100) {
            System.out.println("Cliente ganhou desconto.");
        }

        sc.close();
    }
}

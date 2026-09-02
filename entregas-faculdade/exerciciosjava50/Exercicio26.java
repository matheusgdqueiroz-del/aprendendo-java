package exerciciosjava50;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        /*
         * Parte 3 — Decisões com if e else
         *
         * 26. Frete grátis
         * Peça o valor da compra.
         *
         * Se o valor for maior ou igual a 150, mostre:
         *
         * Frete grátis.
         *
         * Caso contrário, mostre:
         *
         * Frete de R$ 20,00.
         *
         */
        Scanner sc = new Scanner(System.in);

        double valorCompra;

        System.out.println("Digite o valor da compra: ");
        valorCompra = sc.nextDouble();

        if(valorCompra >= 150) {
            System.out.println("Frete grátis");
        } else {
            System.out.println("Frete de R$ 20,00");
        }

        sc.close();
    }
}

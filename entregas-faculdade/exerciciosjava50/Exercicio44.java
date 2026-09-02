package exerciciosjava50;

import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        /*
         * Parte 5 — Operador ternário
         *
         * 44. Frete com ternário
         * Peça o valor da compra.
         *
         * Use operador ternário para definir o valor do frete.
         *
         * Se a compra for maior ou igual a 150, o frete será 0.
         *
         * Caso contrário, o frete será 20.
         *
         */
        Scanner sc = new Scanner(System.in);

        double valorCompra;
        double frete;

        System.out.println("Digite o valor da compra: ");
        valorCompra = sc.nextDouble();

        frete = valorCompra >= 150 ? 0 : 20;

        System.out.println("Valor do frete: R$ " + frete);

        sc.close();
    }
}

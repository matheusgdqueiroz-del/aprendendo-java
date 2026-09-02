package exerciciosjava50;

import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        /*
         * Parte 4 — Decisões com else if
         *
         * 37. Desconto progressivo
         * Peça o valor da compra.
         *
         * Aplique o desconto seguindo a regra:
         *
         * Até 100: sem desconto
         * De 101 até 300: 5% de desconto
         * De 301 até 500: 10% de desconto
         * Acima de 500: 15% de desconto
         *
         * Mostre o valor original, o desconto e o valor final.
         *
        */
        Scanner sc = new Scanner(System.in);

        double valorCompra;
        double percentualDesconto;
        double valorDesconto;
        double valorFinal;

        System.out.println("Digite o valor da compra: ");
        valorCompra = sc.nextDouble();

        if(valorCompra <= 100) {
            percentualDesconto = 0;
        } else if(valorCompra <= 300) {
            percentualDesconto = 5;
        } else if(valorCompra <= 500) {
            percentualDesconto = 10;
        } else {
            percentualDesconto = 15;
        }

        valorDesconto = valorCompra * percentualDesconto / 100;
        valorFinal = valorCompra - valorDesconto;

        System.out.println("Valor original: R$ " + valorCompra);
        System.out.println("Valor do desconto: R$ " + valorDesconto);
        System.out.println("Valor final: R$ " + valorFinal);

        sc.close();
    }
}

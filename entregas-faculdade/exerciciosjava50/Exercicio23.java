package exerciciosjava50;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        /*
         * Parte 3 — Decisões com if e else
         *
         * 23. Compra aprovada
         * Peça o saldo do cliente e o valor do produto.
         *
         * Se o saldo for suficiente, mostre:
         *
         * Compra aprovada.
         *
         * Caso contrário, mostre:
         *
         * Saldo insuficiente.
         *
         */
        Scanner sc = new Scanner(System.in);

        double saldo, valorProduto;

        System.out.println("Digite o seu saldo: ");
        saldo = sc.nextDouble();
        System.out.println("Digite o valor do produto: ");
        valorProduto = sc.nextDouble();

        if(saldo >= valorProduto) {
            System.out.println("Compra aprovada.");
        } else {
            System.out.println("Saldo insuficiente.");
        }

        sc.close();
    }
}

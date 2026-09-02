package exerciciosjava50;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        /*
         * Parte 2 — Decisões simples com if
         *
         * 14. Estoque de produto
         * Peça a quantidade de produtos no estoque.
         *
         * Se a quantidade for maior que zero, mostre:
         *
         * Produto disponível para venda.
         *
         */
        Scanner sc = new Scanner(System.in);

        int estoque;

        System.out.print("Digite a quantidade de produtos no estoque: ");
        estoque = sc.nextInt();

        if(estoque > 0) {
            System.out.println("Produto disponível para venda.");
        }
        sc.close();
    }
}

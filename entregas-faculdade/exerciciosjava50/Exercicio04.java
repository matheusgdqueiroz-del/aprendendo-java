package exerciciosjava50;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        /*
         * Parte 1 — Aquecimento com entrada de dados
         *
         * 4. Produto comprado
         * Peça o nome de um produto, o valor unitário e a quantidade comprada.
         *
         * Depois mostre o valor total da compra.
         *
         */
        Scanner sc = new Scanner(System.in);

        String nomeProduto;
        double valorUnitario, valorTotal;
        int quantidadeComprada;

        System.out.print("Digite o nome do produto: ");
        nomeProduto = sc.nextLine();
        System.out.print("Digite o valor unitário: ");
        valorUnitario = sc.nextDouble();
        System.out.print("Digite a quantidade comprada: ");
        quantidadeComprada = sc.nextInt();

        valorTotal = valorUnitario * quantidadeComprada;

        System.out.printf("""
                CUPOM FISCAL
                ==========================
                %s
                R$%.2f
                %d unidades
                TOTAL: R$%.2f
                """, nomeProduto, valorUnitario, quantidadeComprada, valorTotal);

        sc.close();
    }
}

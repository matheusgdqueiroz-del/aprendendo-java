package exerciciosjava50;

import java.util.Scanner;

public class Exercicio47 {
    public static void main(String[] args) {
        /*
         * Parte 6 — Switch case
         *
         * 47. Cardápio da lanchonete
         * Mostre um cardápio para o usuário:
         *
         * 1: hambúrguer — R$ 25,00
         * 2: pizza — R$ 40,00
         * 3: salada — R$ 18,00
         * 4: refrigerante — R$ 8,00
         *
         * Peça a opção escolhida e a quantidade.
         *
         * Use switch case para definir o preço.
         *
         * Depois calcule e mostre o valor total do pedido.
         *
         */
        Scanner sc = new Scanner(System.in);

        int opcao;
        int quantidade;
        String produto = "";
        double preco = 0;
        boolean opcaoValida = true;

        System.out.println("1 - Hambúrguer: R$ 25,00");
        System.out.println("2 - Pizza: R$ 40,00");
        System.out.println("3 - Salada: R$ 18,00");
        System.out.println("4 - Refrigerante: R$ 8,00");

        System.out.println("Digite a opção escolhida: ");
        opcao = sc.nextInt();

        System.out.println("Digite a quantidade: ");
        quantidade = sc.nextInt();

        switch(opcao) {
            case 1:
                produto = "Hambúrguer";
                preco = 25;
                break;
            case 2:
                produto = "Pizza";
                preco = 40;
                break;
            case 3:
                produto = "Salada";
                preco = 18;
                break;
            case 4:
                produto = "Refrigerante";
                preco = 8;
                break;
            default:
                opcaoValida = false;
        }

        if(opcaoValida) {
            System.out.println("Produto: " + produto);
            System.out.println("Valor total: R$ " + (preco * quantidade));
        } else {
            System.out.println("Opção inválida.");
        }

        sc.close();
    }
}

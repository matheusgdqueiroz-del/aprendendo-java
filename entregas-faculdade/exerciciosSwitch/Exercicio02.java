package exerciciosSwitch;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        /*
         * Cardápio de lanchonete
         *
         * Escolha um lanche e informe a quantidade:
         * 1 - Hambúrguer: R$ 25,00
         * 2 - Pizza: R$ 40,00
         * 3 - Batata frita: R$ 18,00
         * 4 - Refrigerante: R$ 8,00
         * 5 - Suco: R$ 10,00
         *
         * Calcule o valor total do pedido usando switch.
         */
        Scanner sc = new Scanner(System.in);

        int opcaoLanche;
        int quantidade;
        double preco = 0;
        String item = "";

        System.out.printf("""
                1 - Hambúrguer: R$ 25,00
                2 - Pizza: R$ 40,00
                3 - Batata frita: R$ 18,00
                4 - Refrigerante: R$ 8,00
                5 - Suco: R$ 10,00
                """);

        System.out.println("Digite a opção do lanche: ");
        opcaoLanche = sc.nextInt();

        System.out.println("Digite a quantidade: ");
        quantidade = sc.nextInt();

        switch(opcaoLanche) {
            case 1:
                item = "Hambúrguer";
                preco = 25;
                break;
            case 2:
                item = "Pizza";
                preco = 40;
                break;
            case 3:
                item = "Batata frita";
                preco = 18;
                break;
            case 4:
                item = "Refrigerante";
                preco = 8;
                break;
            case 5:
                item = "Suco";
                preco = 10;
                break;
            default:
                System.out.printf("Opção inválida%n");
                sc.close();
                return;
        }

        System.out.printf("""
                ============================
                CARDÁPIO - PEDIDO
                ============================
                Item: %s
                Quantidade: %d
                Total do pedido: R$ %.2f
                ============================
                """,
                item, quantidade, preco * quantidade);

        sc.close();
    }
}

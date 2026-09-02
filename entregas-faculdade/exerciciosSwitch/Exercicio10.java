package exerciciosSwitch;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        /*
         * Sistema de pedidos com adicional
         *
         * Escolha o produto, informe a quantidade e diga se deseja adicional:
         * 1 - Açaí: R$ 18,00
         * 2 - Sorvete: R$ 12,00
         * 3 - Milkshake: R$ 20,00
         *
         * Se houver adicional, acrescente R$ 5,00 por unidade.
         */
        Scanner sc = new Scanner(System.in);

        int produto;
        int quantidade;
        boolean temAdicional;
        double preco = 0;
        double valorProdutos;
        double valorAdicional;
        double valorTotal;
        double valorDesconto;
        double valorFinal;
        String nomeProduto = "";

        System.out.printf("1 - Açaí: R$ 18,00%n2 - Sorvete: R$ 12,00%n3 - Milkshake: R$ 20,00%n");

        System.out.println("Digite o produto escolhido: ");
        produto = sc.nextInt();

        System.out.println("Digite a quantidade: ");
        quantidade = sc.nextInt();

        System.out.println("Deseja adicional? (true/false)");
        temAdicional = sc.nextBoolean();

        switch(produto) {
            case 1:
                nomeProduto = "Açaí";
                preco = 18;
                break;
            case 2:
                nomeProduto = "Sorvete";
                preco = 12;
                break;
            case 3:
                nomeProduto = "Milkshake";
                preco = 20;
                break;
            default:
                System.out.printf("Produto inválido%n");
                sc.close();
                return;
        }

        valorProdutos = preco * quantidade;
        valorAdicional = temAdicional ? 5 * quantidade : 0;
        valorTotal = valorProdutos + valorAdicional;
        valorDesconto = temAdicional && quantidade >= 3 ? valorTotal * 0.10 : 0;
        valorFinal = valorTotal - valorDesconto;

        System.out.printf("""
                ============================
                PEDIDO
                ============================
                Produto: %s
                Quantidade: %d
                Adicional: %s
                Desconto: R$ %.2f
                Valor final: R$ %.2f
                ============================
                """,
                nomeProduto, quantidade, temAdicional ? "Sim" : "Não", valorDesconto, valorFinal);

        sc.close();
    }
}

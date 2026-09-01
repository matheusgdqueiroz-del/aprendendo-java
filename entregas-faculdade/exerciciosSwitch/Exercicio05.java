package exerciciosSwitch;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        /*
         * Loja de roupas
         *
         * Escolha o produto e informe a quantidade:
         * 1 - Camiseta: R$ 49,90
         * 2 - Calça: R$ 119,90
         * 3 - Jaqueta: R$ 199,90
         * 4 - Tênis: R$ 249,90
         *
         * Se a quantidade for maior ou igual a 3, aplique 15% de desconto.
         */
        Scanner sc = new Scanner(System.in);

        int tipoProduto;
        int quantidade;
        double preco = 0;
        double valorCompra;
        double percentualDesconto;
        double valorDesconto;
        double valorFinal;
        String produto = "";

        System.out.printf("""
                1 - Camiseta: R$ 49,90
                2 - Calça: R$ 119,90
                3 - Jaqueta: R$ 199,90
                4 - Tênis: R$ 249,90
                """);

        System.out.println("Digite o tipo de produto: ");
        tipoProduto = sc.nextInt();

        System.out.println("Digite a quantidade: ");
        quantidade = sc.nextInt();

        switch(tipoProduto) {
            case 1:
                produto = "Camiseta";
                preco = 49.90;
                break;
            case 2:
                produto = "Calça";
                preco = 119.90;
                break;
            case 3:
                produto = "Jaqueta";
                preco = 199.90;
                break;
            case 4:
                produto = "Tênis";
                preco = 249.90;
                break;
            default:
                System.out.printf("Produto inválido%n");
                sc.close();
                return;
        }

        valorCompra = preco * quantidade;
        percentualDesconto = quantidade >= 5 ? 20 : quantidade >= 3 ? 15 : 0;
        valorDesconto = valorCompra * percentualDesconto / 100;
        valorFinal = valorCompra - valorDesconto;

        System.out.printf("""
                ============================
                LOJA DE ROUPAS
                ============================
                Produto: %s
                Quantidade: %d
                Desconto aplicado: %.0f%%
                Valor final: R$ %.2f
                ============================
                """,
                produto, quantidade, percentualDesconto, valorFinal);

        sc.close();
    }
}

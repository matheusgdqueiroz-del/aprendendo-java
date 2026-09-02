package exerciciosSwitch;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        /*
         * Ingresso de cinema
         *
         * Escolha o tipo de ingresso e informe a quantidade:
         * 1 - Inteira: R$ 32,00
         * 2 - Meia-entrada: R$ 16,00
         * 3 - VIP: R$ 60,00
         *
         * Se a quantidade for maior que 4, aplique 5% de desconto.
         */
        Scanner sc = new Scanner(System.in);

        int tipoIngresso;
        int quantidade;
        double preco = 0;
        double valorCompra;
        double valorDesconto;
        double valorFinal;
        String ingresso = "";

        System.out.printf("""
                1 - Inteira: R$ 32,00
                2 - Meia-entrada: R$ 16,00
                3 - VIP: R$ 60,00
                """);

        System.out.println("Digite o tipo de ingresso: ");
        tipoIngresso = sc.nextInt();

        System.out.println("Digite a quantidade: ");
        quantidade = sc.nextInt();

        switch(tipoIngresso) {
            case 1:
                ingresso = "Inteira";
                preco = 32;
                break;
            case 2:
                ingresso = "Meia-entrada";
                preco = 16;
                break;
            case 3:
                ingresso = "VIP";
                preco = 60;
                break;
            default:
                System.out.printf("Tipo de ingresso inválido%n");
                sc.close();
                return;
        }

        valorCompra = preco * quantidade;
        valorDesconto = quantidade > 4 ? valorCompra * 0.05 : 0;
        valorFinal = valorCompra - valorDesconto;

        System.out.printf("""
                ============================
                INGRESSO DE CINEMA
                ============================
                Tipo: %s
                Quantidade: %d
                Desconto aplicado: %.0f%%
                Valor final: R$ %.2f
                ============================
                """,
                ingresso, quantidade, quantidade > 4 ? 5.0 : 0.0, valorFinal);

        sc.close();
    }
}

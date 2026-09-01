package exerciciosSwitch;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        /*
         * Frete por região
         *
         * Informe a região e o valor do produto:
         * 1 - Sudeste: frete R$ 20,00
         * 2 - Sul: frete R$ 25,00
         * 3 - Nordeste: frete R$ 35,00
         * 4 - Norte: frete R$ 45,00
         * 5 - Centro-Oeste: frete R$ 30,00
         *
         * Se o produto custar R$ 300,00 ou mais, o frete será grátis.
         */
        Scanner sc = new Scanner(System.in);

        int regiao;
        double valorProduto;
        double frete = 0;
        String nomeRegiao = "";

        System.out.printf("""
                1 - Sudeste: frete R$ 20,00
                2 - Sul: frete R$ 25,00
                3 - Nordeste: frete R$ 35,00
                4 - Norte: frete R$ 45,00
                5 - Centro-Oeste: frete R$ 30,00
                """);

        System.out.println("Digite a região: ");
        regiao = sc.nextInt();

        System.out.println("Digite o valor do produto: ");
        valorProduto = sc.nextDouble();

        switch(regiao) {
            case 1:
                nomeRegiao = "Sudeste";
                frete = 20;
                break;
            case 2:
                nomeRegiao = "Sul";
                frete = 25;
                break;
            case 3:
                nomeRegiao = "Nordeste";
                frete = 35;
                break;
            case 4:
                nomeRegiao = "Norte";
                frete = 45;
                break;
            case 5:
                nomeRegiao = "Centro-Oeste";
                frete = 30;
                break;
            default:
                System.out.printf("Região inválida%n");
                sc.close();
                return;
        }

        if(valorProduto >= 300) {
            frete = 0;
        }

        System.out.printf("""
                ============================
                FRETE POR REGIÃO
                ============================
                Região: %s
                Valor do produto: R$ %.2f
                Frete: R$ %.2f
                Valor final: R$ %.2f
                ============================
                """,
                nomeRegiao, valorProduto, frete, valorProduto + frete);

        sc.close();
    }
}

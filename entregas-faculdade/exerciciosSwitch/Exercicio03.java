package exerciciosSwitch;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        /*
         * Plano de assinatura
         *
         * Escolha um plano e informe a quantidade de meses:
         * 1 - Básico: R$ 29,90 por mês
         * 2 - Profissional: R$ 59,90 por mês
         * 3 - Premium: R$ 99,90 por mês
         *
         * Calcule o valor total. Para 12 meses ou mais, aplique 10% de desconto.
         */
        Scanner sc = new Scanner(System.in);

        int plano;
        int meses;
        String nomePlano = "";
        double valorMensal = 0;
        double valorSemDesconto;
        double percentualDesconto;
        double valorDesconto;
        double valorFinal;

        System.out.printf("""
                1 - Básico: R$ 29,90 por mês
                2 - Profissional: R$ 59,90 por mês
                3 - Premium: R$ 99,90 por mês
                """);

        System.out.println("Digite o plano escolhido: ");
        plano = sc.nextInt();

        System.out.println("Digite a quantidade de meses: ");
        meses = sc.nextInt();

        switch(plano) {
            case 1:
                nomePlano = "Básico";
                valorMensal = 29.90;
                break;
            case 2:
                nomePlano = "Profissional";
                valorMensal = 59.90;
                break;
            case 3:
                nomePlano = "Premium";
                valorMensal = 99.90;
                break;
            default:
                System.out.printf("Plano inválido%n");
                sc.close();
                return;
        }

        valorSemDesconto = valorMensal * meses;
        percentualDesconto = meses >= 24 ? 15 : meses >= 12 ? 10 : 0;
        valorDesconto = valorSemDesconto * percentualDesconto / 100;
        valorFinal = valorSemDesconto - valorDesconto;

        System.out.printf("""
                ============================
                PLANO DE ASSINATURA
                ============================
                Plano: %s
                Meses contratados: %d
                Desconto aplicado: %.0f%%
                Valor final: R$ %.2f
                ============================
                """,
                nomePlano, meses, percentualDesconto, valorFinal);

        sc.close();
    }
}

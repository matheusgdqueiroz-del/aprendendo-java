package exerciciosjava50;

import java.util.Scanner;

public class Exercicio50 {
    public static void main(String[] args) {
        /*
         * Parte 6 — Switch case
         *
         * 50. Plano de assinatura
         * Mostre os planos:
         *
         * 1: básico — R$ 29,90 por mês
         * 2: intermediário — R$ 59,90 por mês
         * 3: premium — R$ 99,90 por mês
         *
         * Peça o plano escolhido e a quantidade de meses.
         *
         * Use switch case para definir o valor mensal.
         *
         * Se a quantidade de meses for 12 ou mais, aplique 10% de desconto.
         *
         * No final, mostre:
         *
         * Nome do plano
         * Valor mensal
         * Quantidade de meses
         * Valor sem desconto
         * Valor do desconto
         * Valor final do contrato
         *
         */
        Scanner sc = new Scanner(System.in);

        int plano;
        int meses;
        String nomePlano = "";
        double valorMensal = 0;
        double valorSemDesconto;
        double valorDesconto;
        double valorFinal;
        boolean planoValido = true;

        System.out.println("1 - Básico: R$ 29,90 por mês");
        System.out.println("2 - Intermediário: R$ 59,90 por mês");
        System.out.println("3 - Premium: R$ 99,90 por mês");

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
                nomePlano = "Intermediário";
                valorMensal = 59.90;
                break;
            case 3:
                nomePlano = "Premium";
                valorMensal = 99.90;
                break;
            default:
                planoValido = false;
        }

        if(planoValido) {
            valorSemDesconto = valorMensal * meses;
            valorDesconto = meses >= 12 ? valorSemDesconto * 0.10 : 0;
            valorFinal = valorSemDesconto - valorDesconto;

            System.out.println("Plano: " + nomePlano);
            System.out.println("Valor mensal: R$ " + valorMensal);
            System.out.println("Quantidade de meses: " + meses);
            System.out.println("Valor sem desconto: R$ " + valorSemDesconto);
            System.out.println("Valor do desconto: R$ " + valorDesconto);
            System.out.println("Valor final do contrato: R$ " + valorFinal);
        } else {
            System.out.println("Plano inválido.");
        }

        sc.close();
    }
}

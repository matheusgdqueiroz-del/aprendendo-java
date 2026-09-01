package exerciciosjava50;

import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        /*
         * Parte 4 — Decisões com else if
         *
         * 40. Tipo de cliente
         * Peça o total gasto pelo cliente no mês.
         *
         * Classifique assim:
         *
         * Até 100: cliente comum
         * De 101 até 500: cliente bronze
         * De 501 até 1000: cliente prata
         * Acima de 1000: cliente ouro
         *
         */
        Scanner sc = new Scanner(System.in);

        double totalGasto;
        String mensagem;

        System.out.println("Digite o total gasto no mês: ");
        totalGasto = sc.nextDouble();

        if(totalGasto <= 100) {
            mensagem = "cliente comum";
        } else if(totalGasto <= 500) {
            mensagem = "cliente bronze";
        } else if(totalGasto <= 1000) {
            mensagem = "cliente prata";
        } else {
            mensagem = "cliente ouro";
        }

        System.out.println(mensagem);

        sc.close();
    }
}

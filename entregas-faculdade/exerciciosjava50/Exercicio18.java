package exerciciosjava50;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        /*
         * Parte 2 — Decisões simples com if
         *
         * 18. Presença mínima
         * Peça a porcentagem de presença de um aluno.
         *
         * Se for maior ou igual a 75, mostre:
         *
         * Presença suficiente.
         *
         */
        Scanner sc = new Scanner(System.in);

        double presenca;

        System.out.println("Digite a porcentagem de presença do aluno: ");
        presenca = sc.nextDouble();

        if(presenca >= 75) {
            System.out.println("Presença suficiente.");
        }

        sc.close();
    }
}

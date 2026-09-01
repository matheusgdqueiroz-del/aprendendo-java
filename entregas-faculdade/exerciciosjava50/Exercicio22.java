package exerciciosjava50;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        /*
         * Parte 3 — Decisões com if e else
         *
         * 22. Aprovado ou reprovado
         * Peça a nota final do aluno.
         *
         * Se a nota for maior ou igual a 7, mostre:
         *
         * Aprovado.
         *
         * Caso contrário, mostre:
         *
         * Reprovado.
         *
         */
        Scanner sc = new Scanner(System.in);

        double nota;

        System.out.println("Digite sua nota: ");
        nota = sc.nextDouble();

        if(nota >= 7) {
            System.out.println("Aprovado.");
        } else {
            System.out.println("Reprovado");
        }

        sc.close();
    }
}

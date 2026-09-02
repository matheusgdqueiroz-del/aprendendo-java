package exerciciosjava50;

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        /*
         * Parte 4 — Decisões com else if
         *
         * 32. Conceito da nota
         * Peça a nota do aluno.
         *
         * Classifique assim:
         *
         * 9 ou mais: excelente
         * 7 até 8.9: bom
         * 5 até 6.9: recuperação
         * Menor que 5: reprovado
         *
         */
        Scanner sc = new Scanner(System.in);

        double nota;
        String mensagem;

        System.out.println("Digite sua nota: ");
        nota = sc.nextDouble();

        if(nota >= 9) {
            mensagem = "excelente";
        } else if(nota >= 7) {
            mensagem = "bom";
        } else if(nota >= 5) {
            mensagem = "recuperação";
        } else {
            mensagem = "reprovado";
        }
        System.out.println(mensagem);

        sc.close();
    }
}

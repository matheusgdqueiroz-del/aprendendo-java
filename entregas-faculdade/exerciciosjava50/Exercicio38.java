package exerciciosjava50;

import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        /*
         * Parte 4 — Decisões com else if
         *
         * 38. Situação do aluno
         * Peça a nota e a presença do aluno.
         *
         * A regra é:
         *
         * Nota maior ou igual a 7 e presença maior ou igual a 75: aprovado
         * Nota maior ou igual a 5 e menor que 7: recuperação
         * Caso contrário: reprovado
         *
         */
        Scanner sc = new Scanner(System.in);

        double nota;
        double presenca;
        String mensagem;

        System.out.println("Digite a nota do aluno: ");
        nota = sc.nextDouble();

        System.out.println("Digite a presença do aluno: ");
        presenca = sc.nextDouble();

        if(nota >= 7 && presenca >= 75) {
            mensagem = "aprovado";
        } else if(nota >= 5 && nota < 7) {
            mensagem = "recuperação";
        } else {
            mensagem = "reprovado";
        }

        System.out.println(mensagem);

        sc.close();
    }
}

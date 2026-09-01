package exerciciosjava50;

import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        /*
         * Parte 5 — Operador ternário
         *
         * 42. Aprovação com ternário
         * Peça a nota do aluno.
         *
         * Use operador ternário para mostrar se ele foi aprovado ou reprovado.
         *
         * A regra é:
         *
         * Nota maior ou igual a 7: aprovado
         * Caso contrário: reprovado
         *
         */
        Scanner sc = new Scanner(System.in);

        double nota;
        String mensagem;

        System.out.println("Digite a nota do aluno: ");
        nota = sc.nextDouble();

        mensagem = nota >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(mensagem);

        sc.close();
    }
}

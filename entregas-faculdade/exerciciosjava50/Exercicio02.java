package exerciciosjava50;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        /*
         * Parte 1 — Aquecimento com entrada de dados
         *
         * 2. Cadastro simples de aluno
         * Peça o nome do aluno, a idade e a nota final.
         *
         * Depois mostre tudo em uma frase organizada.
         *
         */
        String nome;
        short idade;
        double notaFinal;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        nome = sc.nextLine();
        System.out.print("Digite a sua idade: ");
        idade = sc.nextShort();
        System.out.print("Digite a sua nota final: ");
        notaFinal = sc.nextDouble();

        System.out.printf("""
                CADASTRO DO ALUNO
                Nome: %s
                idade: %d
                Nota final: %.2f
                """, nome, idade, notaFinal);


        sc.close();
    }
}

package exerciciosjava50;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        /*
         * Parte 2 — Decisões simples com if
         *
         * 12. Nota boa
         * Peça a nota de um aluno.
         *
         * Se a nota for maior ou igual a 7, mostre:
         *
         * Aluno aprovado.
         *
         */
        Scanner sc = new Scanner(System.in);

        double nota;
        System.out.print("Digite sua nota: ");
        nota = sc.nextDouble();

        if(nota >= 7){
            System.out.println("Aluno aprovado");
        }


        sc.close();
    }
}

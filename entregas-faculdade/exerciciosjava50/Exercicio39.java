package exerciciosjava50;

import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        /*
         * Parte 4 — Decisões com else if
         *
         * 39. Categoria do atleta
         * Peça a idade do atleta.
         *
         * Classifique assim:
         *
         * Até 10 anos: infantil
         * De 11 até 15: juvenil
         * De 16 até 20: júnior
         * De 21 até 35: profissional
         * Acima de 35: sênior
         *
         */
        Scanner sc = new Scanner(System.in);

        int idade;
        String mensagem;

        System.out.println("Digite a idade do atleta: ");
        idade = sc.nextInt();

        if(idade <= 10) {
            mensagem = "infantil";
        } else if(idade <= 15) {
            mensagem = "juvenil";
        } else if(idade <= 20) {
            mensagem = "júnior";
        } else if(idade <= 35) {
            mensagem = "profissional";
        } else {
            mensagem = "sênior";
        }

        System.out.println(mensagem);

        sc.close();
    }
}

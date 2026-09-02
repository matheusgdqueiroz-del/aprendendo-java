package exerciciosjava50;

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        /*
         * Parte 4 — Decisões com else if
         *
         * 31. Fase da vida
         * Peça a idade da pessoa.
         *
         * Classifique assim:
         *
         * Menor que 12: criança
         * De 12 até 17: adolescente
         * De 18 até 59: adulto
         * 60 ou mais: idoso
         *
         */
        Scanner sc = new Scanner(System.in);

        int idade;
        String mensagem;

        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();

        if(idade < 12) {
            mensagem = "criança";
        } else if(idade < 17) {
            mensagem = "adolescente";
        } else if(idade < 59) {
            mensagem = "adulto";
        } else {
            mensagem = "idoso";
        }
        System.out.println(mensagem);

        sc.close();
    }
}

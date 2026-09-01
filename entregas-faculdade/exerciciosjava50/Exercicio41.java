package exerciciosjava50;

import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {
        /*
         * Parte 5 — Operador ternário
         *
         * 41. Maioridade com ternário
         * Peça a idade do usuário.
         *
         * Use operador ternário para guardar uma mensagem dizendo se ele é maior ou menor de idade.
         *
         * Depois mostre a mensagem.
         *
         */
        Scanner sc = new Scanner(System.in);

        int idade;
        String mensagem;

        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();

        mensagem = idade >= 18 ? "Maior de idade" : "Menor de idade";

        System.out.println(mensagem);

        sc.close();
    }
}

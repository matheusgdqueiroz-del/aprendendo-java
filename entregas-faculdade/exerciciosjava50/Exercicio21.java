package exerciciosjava50;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        /*
         * Parte 3 — Decisões com if e else
         *
         * 21. Maior ou menor de idade
         * Peça a idade do usuário.
         *
         * Se for maior ou igual a 18, mostre:
         *
         * Maior de idade.
         *
         * Caso contrário, mostre:
         *
         * Menor de idade.
         *
         */
        Scanner sc = new Scanner(System.in);

        int idade;

        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();

        if(idade >= 18) {
            System.out.println("Maior de idade.");
        } else {
            System.out.println("Menor de idade.");
        }

        sc.close();
    }
}

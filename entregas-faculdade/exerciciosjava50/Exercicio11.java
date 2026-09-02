package exerciciosjava50;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        /*
         * Parte 2 — Decisões simples com if
         *
         * 11. Entrada no evento
         * Peça a idade da pessoa.
         *
         * Se ela tiver 18 anos ou mais, mostre a mensagem:
         *
         * Entrada permitida.
         *
         */
        Scanner sc = new Scanner(System.in);

        int idade;

        System.out.print("Digite sua idade: ");
        idade = sc.nextInt();

        if(idade >= 18) {
            System.out.println("Entrada permitida");
        }
        sc.close();
    }
}

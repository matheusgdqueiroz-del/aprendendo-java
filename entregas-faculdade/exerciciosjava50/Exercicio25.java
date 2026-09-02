package exerciciosjava50;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        /*
         * Parte 3 — Decisões com if e else
         *
         * 25. Pode dirigir?
         * Peça a idade da pessoa e pergunte se ela tem CNH.
         *
         * Se a pessoa tiver 18 anos ou mais e tiver CNH, mostre:
         *
         * Pode dirigir.
         *
         * Caso contrário, mostre:
         *
         * Não pode dirigir.
         *
         */
        Scanner sc = new Scanner(System.in);

        int idade;
        boolean isCNH;

        System.out.println("Digite a sua idade: ");
        idade = sc.nextInt();
        System.out.println("Você tem CNH? (true/false)");
        isCNH = sc.nextBoolean();

        if(idade >= 18 && isCNH) {
            System.out.println("Pode dirigir.");
        } else {
            System.out.println("Não pode dirigir");
        }

        sc.close();
    }
}

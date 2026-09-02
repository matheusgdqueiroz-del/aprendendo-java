package exerciciosjava50;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        /*
         * Parte 2 — Decisões simples com if
         *
         * 20. Login ativo
         * Peça para o usuário informar se ele está logado usando true ou false.
         *
         * Se ele estiver logado, mostre:
         *
         * Bem-vindo ao sistema.
         *
         */
        Scanner sc = new Scanner(System.in);

        boolean isLogado;

        System.out.println("O usuário está logado? (true/false)");
        isLogado = sc.nextBoolean();

        if (isLogado) {
            System.out.println("Bem-vindo ao sistema.");
        }
        sc.close();
    }
}

package exerciciosjava50;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        /*
         * Parte 2 — Decisões simples com if
         *
         * 13. Saldo disponível
         * Peça o saldo da conta do usuário.
         *
         * Se o saldo for maior que zero, mostre:
         *
         * Você possui saldo disponível.
         *
         */
        Scanner sc = new Scanner(System.in);

        double saldo;
        System.out.print("Digite o seu saldo: ");
        saldo = sc.nextDouble();

        if(saldo > 0) {
            System.out.println("Você possui saldo disponível.");
        }

        sc.close();
    }
}

package exerciciosjava50;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        /*
         * Parte 3 — Decisões com if e else
         *
         * 28. Caixa eletrônico
         * Peça o saldo da conta e o valor do saque.
         *
         * Se o saque for menor ou igual ao saldo, mostre:
         *
         * Saque realizado com sucesso.
         *
         * E também mostre o saldo restante.
         *
         * Caso contrário, mostre:
         *
         * Saldo insuficiente.
         *
         */
        Scanner sc = new Scanner(System.in);

        double saldoConta, valorSaque;

        System.out.println("Digite o saldo da conta: ");
        saldoConta = sc.nextDouble();
        System.out.println("Digite o valor do saque: ");
        valorSaque = sc.nextDouble();

        if(valorSaque <= saldoConta) {
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }

        sc.close();
    }
}

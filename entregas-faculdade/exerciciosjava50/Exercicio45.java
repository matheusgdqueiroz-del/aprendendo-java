package exerciciosjava50;

import java.util.Scanner;

public class Exercicio45 {
    public static void main(String[] args) {
        /*
         * Parte 5 — Operador ternário
         *
         * 45. Bônus salarial
         * Peça o salário do funcionário.
         *
         * Use operador ternário para calcular o bônus.
         *
         * Se o salário for menor que 3000, o bônus será 500.
         *
         * Caso contrário, o bônus será 200.
         *
         * Mostre o salário, o bônus e o valor total.
         *
         */
        Scanner sc = new Scanner(System.in);

        double salario;
        double bonus;
        double valorTotal;

        System.out.println("Digite o salário do funcionário: ");
        salario = sc.nextDouble();

        bonus = salario < 3000 ? 500 : 200;
        valorTotal = salario + bonus;

        System.out.println("Salário: R$ " + salario);
        System.out.println("Bônus: R$ " + bonus);
        System.out.println("Valor total: R$ " + valorTotal);

        sc.close();
    }
}

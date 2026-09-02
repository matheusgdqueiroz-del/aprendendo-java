package exerciciosjava50;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        /*
         * Parte 1 — Aquecimento com entrada de dados
         *
         * 7. Salário por hora
         * Peça quanto a pessoa ganha por hora e quantas horas trabalhou no mês.
         *
         * Depois calcule o salário bruto.
         *
         */
        Scanner sc = new Scanner(System.in);

        double salarioPorHora, horasTrabalhadas, salarioBruto;

        System.out.print("Quanto você ganha por hora? ");
        salarioPorHora = sc.nextDouble();
        System.out.print("Quantas horas você trabalhou esse mês? ");
        horasTrabalhadas = sc.nextDouble();

        salarioBruto = salarioPorHora * horasTrabalhadas;

        System.out.printf("O valor do salário bruto é: R$%.2f", salarioBruto);

        sc.close();
    }
}

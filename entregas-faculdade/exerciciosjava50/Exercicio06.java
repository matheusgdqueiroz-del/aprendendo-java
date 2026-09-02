package exerciciosjava50;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        /*
         * Parte 1 — Aquecimento com entrada de dados
         *
         * 6. Conversor de metros
         * Peça uma medida em metros.
         *
         * Mostre o valor convertido para centímetros.
         *
         */
        Scanner sc = new Scanner(System.in);

        double metros, centimetros;

        System.out.println("Digite a medida em metros: ");
        metros = sc.nextDouble();

        centimetros = metros * 100;

        System.out.printf("A medida em centimetros é: %.2f centimetros", centimetros);
        sc.close();
    }
}

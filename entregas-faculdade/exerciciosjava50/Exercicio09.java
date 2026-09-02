package exerciciosjava50;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        /*
         * Parte 1 — Aquecimento com entrada de dados
         *
         * 9. Temperatura
         * Peça uma temperatura em Celsius.
         *
         * Converta para Fahrenheit e mostre o resultado.
         *
         */
        Scanner sc = new Scanner(System.in);

        double celcius, fahrenheit;

        System.out.print("Digite uma temperatura em celcius: ");
        celcius = sc.nextDouble();

        fahrenheit = celcius * 1.8 + 32;

        System.out.printf("%.1fºC em fahrenheit é: %.1fºF", celcius, fahrenheit);

        sc.close();
    }
}

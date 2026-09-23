package exerciciosArray;

import java.util.Scanner;

public class Exercicio23 {
    /*
    23. Multiplicar todos os valores
Enunciado:
Peça 5 números. Depois peça um número multiplicador e mostre todos os valores multiplicados por ele.

O que precisa fazer:
Percorrer o array e multiplicar cada posição pelo número informado.

Dicas:
Use numeros[i] * multiplicador.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            numeros[i] = sc.nextDouble();
        }

        System.out.println("Digite um número multiplicador: ");
        double multiplicador = sc.nextDouble();

        for (double numero : numeros) {
            System.out.printf("%.0f multiplicado por %.0f é %.0f\n", numero, multiplicador, numero * multiplicador);
        }


        sc.close();
    }
}

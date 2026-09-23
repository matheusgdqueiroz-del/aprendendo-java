package exerciciosArray;

import java.util.Scanner;

public class Exercicio15 {
    /*
    15. Dobro dos valores
Enunciado:
Peça 5 números e mostre o dobro de cada um.

O que precisa fazer:
Guardar os números em um array e depois apresentar cada valor multiplicado por 2.

Dicas:
Use numeros[i] * 2.
     */
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            numeros[i] = sc.nextDouble();
        }

        for (double numero : numeros) {
            System.out.printf("O dobro de %.0f é %.0f \n", numero, numero * 2);
        }

        sc.close();
    }
}

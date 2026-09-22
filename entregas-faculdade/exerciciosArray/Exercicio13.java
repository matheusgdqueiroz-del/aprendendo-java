package exerciciosArray;

import java.util.Scanner;

public class Exercicio13 {
    /*
    13. Contar repetição de um número
Enunciado:
Peça 10 números. Depois peça um número para pesquisar e conte quantas vezes ele aparece.

O que precisa fazer:
Comparar o número pesquisado com todos os valores do array.

Dicas:
Crie uma variável contador.
Quando encontrar o número, faça contador++.
     */
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            numeros[i] = sc.nextDouble();
        }

        System.out.print("Digite um número para pesquisar: ");
        double input = sc.nextDouble();

        int contador = 0;

        for (double numero : numeros) {
            if (input == numero) {
                contador++;
            }
        }
        System.out.printf("O número %.0f aparece %d vezes", input, contador);

        sc.close();
    }
}

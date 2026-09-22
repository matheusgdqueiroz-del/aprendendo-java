package exerciciosArray;

import java.util.Scanner;

public class Exercicio12 {
    /*
    12. Buscar número e posição
Enunciado:
Peça 8 números. Depois peça outro número e mostre se ele existe no array e em qual posição está.

O que precisa fazer:
Percorrer o array procurando o número.

Dicas:
Use uma variável booleana chamada encontrado.
Use o índice i para mostrar a posição.
     */
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[8];

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            numeros[i] = sc.nextDouble();
        }

        System.out.print("Digite um número para pesquisar: ");
        double input = sc.nextDouble();
        boolean encontrado = false;
        int posicao = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (input == numeros[i]) {
                encontrado = true;
                posicao = i;
            }
        }
        if (encontrado) {
            System.out.printf("%.1f encontrado na posição %d", input, posicao);
        } else {
            System.out.println("Número não encontrado!");
        }

        sc.close();
    }
}

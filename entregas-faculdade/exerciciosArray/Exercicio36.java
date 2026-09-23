package exerciciosArray;

import java.util.Scanner;

public class Exercicio36 {
    /*
    36. Soma de cada coluna
Enunciado:
Crie uma matriz 3 por 4. Peça os valores e mostre a soma de cada coluna.

O que precisa fazer:
Percorrer primeiro as colunas e depois as linhas.

Dicas:
Para somar por coluna, o for de fora pode controlar a coluna.
     */
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Digite o valor da posição [%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matriz[0].length; i++) {
            int somaColuna = 0;
            for (int j = 0; j < matriz.length; j++) {
                somaColuna += matriz[j][i];
            }
            System.out.printf("A soma da coluna %d é: %d\n", i + 1, somaColuna);
        }

        sc.close();
    }
}


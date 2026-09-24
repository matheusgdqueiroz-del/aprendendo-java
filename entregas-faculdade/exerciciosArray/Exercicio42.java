package exerciciosArray;

import java.util.Scanner;

public class Exercicio42 {
    /*
    42. Contar pares na matriz
Enunciado:
Crie uma matriz 4 por 4. Peça os valores e conte quantos números pares existem.

O que precisa fazer:
Percorrer todas as posições e testar cada número.

Dicas:
Use % 2 == 0.
     */
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Digite o valor da posição [%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    System.out.printf("%d é par\n", matriz[i][j]);
                }
            }
        }

        sc.close();
    }
}

package exerciciosArray;

import java.util.Scanner;

public class Exercicio41 {
    /*
    41. Diagonal secundária
Enunciado:
Crie uma matriz 3 por 3. Peça os valores e mostre os valores da diagonal secundária.

O que precisa fazer:
Identificar a diagonal que começa no canto superior direito e termina no canto inferior esquerdo.

Dicas:
Em uma matriz 3 por 3, as posições são:
matriz[0][2], matriz[1][1], matriz[2][0].
     */
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Digite o valor da posição [%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {

                System.out.printf("%d ", matriz[i][matriz.length - 1 - i]);
        }

        sc.close();
    }
}
/*
1 2 3
1 2 3
1 2 3

 */

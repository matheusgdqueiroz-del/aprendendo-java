package exerciciosArray;

import java.util.Scanner;

public class Exercicio39 {
    /*
    39. Diagonal principal
Enunciado:
Crie uma matriz 3 por 3. Peça os valores e mostre apenas os valores da diagonal principal.

O que precisa fazer:
Mostrar os valores em que a linha e a coluna têm o mesmo índice.

Dicas:
Diagonal principal: matriz[0][0], matriz[1][1], matriz[2][2].
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
        

        sc.close();
    }
}

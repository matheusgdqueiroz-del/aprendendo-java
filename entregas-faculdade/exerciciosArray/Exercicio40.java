package exerciciosArray;

import java.util.Scanner;

public class Exercicio40 {
    /*
    40. Soma da diagonal principal
Enunciado:
Crie uma matriz 3 por 3. Peça os valores e some apenas os valores da diagonal principal.

O que precisa fazer:
Somar apenas quando o índice da linha for igual ao índice da coluna.

Dicas:
Use if (i == j).
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

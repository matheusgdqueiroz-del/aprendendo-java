package exerciciosArray;

import java.util.Scanner;

public class Exercicio32 {
    /*
    32. Soma da matriz
Enunciado:
Crie uma matriz 3 por 3. Peça os valores e mostre a soma de todos eles.

O que precisa fazer:
Percorrer todas as posições da matriz e acumular a soma.

Dicas:
Use uma variável soma.
Some com soma += matriz[i][j].
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

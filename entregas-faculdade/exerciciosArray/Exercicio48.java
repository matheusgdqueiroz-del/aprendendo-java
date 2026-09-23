package exerciciosArray;

import java.util.Scanner;

public class Exercicio48 {
    /*
    48. Matriz transposta
Enunciado:
Crie uma matriz 2 por 3. Peça os valores e depois crie uma nova matriz 3 por 2.

A nova matriz deve ser a transposta da primeira.

O que precisa fazer:
Transformar linhas em colunas.

Dicas:
Use transposta[j][i] = matriz[i][j].
     */
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[2][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Digite o valor da posição [%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }
        

        sc.close();
    }
}

package exerciciosArray;

import java.util.Scanner;

public class Exercicio31 {
    /*
    31. Criar matriz 2 por 3
Enunciado:
Crie uma matriz com 2 linhas e 3 colunas. Peça todos os valores e depois mostre a matriz na tela.

O que precisa fazer:
Usar array bidimensional e dois laços for.

Dicas:
Use int[][] matriz = new int[2][3].
O primeiro for percorre as linhas.
O segundo for percorre as colunas.
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

        for (int[] linha : matriz) {
            for (int numero : linha) {
                System.out.print(numero + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

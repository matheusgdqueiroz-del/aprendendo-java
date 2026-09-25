package exerciciosArray;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio45 {
    /*
    45. Trocar linha 0 com linha 2
Enunciado:
Crie uma matriz 3 por 3. Peça os valores e depois troque os valores da linha 0 com os valores da linha 2.

O que precisa fazer:
Fazer a troca coluna por coluna.

Dicas:
Use uma variável auxiliar temporario.
Troque matriz[0][j] com matriz[2][j].
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

        //Mostra a matriz antes de trocar
        for (int[] linhas : matriz) {
            for (int numero : linhas) {
                System.out.print(numero + " ");
            }
        }
        System.out.println(); // Pula uma linha pra organizar

        int[] temporario = new int[3];


        /* for (int i = 0; i < 1; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                temporario[j] = matriz[i][j]; // Guarda os valores da linha 0 em temporario
                matriz[i][j] = matriz[i + 2][j]; // Troca os valores da linha 0 com os da linha 2
            }
        } */

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i + 2][j] = temporario[j]; // Troca os valores da linha 2 com os de temporario
            }
        }

        // Mostra a matriz trocada
        for (int[] linhas : matriz) {
            for (int numero : linhas) {
                System.out.print(numero + " ");
            }
        }

        sc.close();
    }
}

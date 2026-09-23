package exerciciosArray;

import java.util.Scanner;

public class Exercicio35 {
    /*
    35. Soma de cada linha
Enunciado:
Crie uma matriz 3 por 4. Peça os valores e mostre a soma de cada linha.

O que precisa fazer:
Para cada linha, somar suas colunas.

Dicas:
A variável somaLinha deve zerar no começo de cada linha.
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
        
        int somaLinha = 0;

        for (int i = 0; i < matriz.length; i++) {
            somaLinha = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.printf("A soma da linha %d é : %d\n", i + 1, somaLinha);
        }

        sc.close();
    }
}

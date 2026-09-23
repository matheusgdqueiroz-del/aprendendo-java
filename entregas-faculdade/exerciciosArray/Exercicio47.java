package exerciciosArray;

import java.util.Scanner;

public class Exercicio47 {
    /*
    47. Multiplicar matriz por um número
Enunciado:
Crie uma matriz 3 por 3. Peça os valores da matriz e depois peça um número multiplicador.

Mostre todos os valores multiplicados por esse número.

O que precisa fazer:
Percorrer a matriz e multiplicar cada valor.

Dicas:
Use matriz[i][j] * multiplicador.
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

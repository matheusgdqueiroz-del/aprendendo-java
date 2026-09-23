package exerciciosArray;

import java.util.Scanner;

public class Exercicio34 {
    /*
    34. Menor valor da matriz
Enunciado:
Crie uma matriz 3 por 3. Peça os valores e mostre o menor valor informado.

O que precisa fazer:
Percorrer a matriz inteira e comparar os valores.

Dicas:
Comece a variável menor com matriz[0][0].
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

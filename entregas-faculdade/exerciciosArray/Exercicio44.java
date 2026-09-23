package exerciciosArray;

import java.util.Scanner;

public class Exercicio44 {
    /*
    44. Buscar valor na matriz
Enunciado:
Crie uma matriz 3 por 3. Depois peça um número para pesquisar.

Informe se o número foi encontrado e em qual linha e coluna ele está.

O que precisa fazer:
Percorrer a matriz e comparar cada valor com o número pesquisado.

Dicas:
Use uma variável booleana encontrado.
Mostre os índices i e j.
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

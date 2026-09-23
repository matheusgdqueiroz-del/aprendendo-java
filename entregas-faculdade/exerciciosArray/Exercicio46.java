package exerciciosArray;

import java.util.Scanner;

public class Exercicio46 {
    /*
    46. Trocar coluna 0 com coluna 2
Enunciado:
Crie uma matriz 3 por 3. Peça os valores e depois troque os valores da coluna 0 com os valores da coluna 2.

O que precisa fazer:
Fazer a troca linha por linha.

Dicas:
Use uma variável auxiliar.
Troque matriz[i][0] com matriz[i][2].
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

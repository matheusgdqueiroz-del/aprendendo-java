package exerciciosArray;

import java.util.Scanner;

public class Exercicio43 {
    /*
    43. Contar positivos, negativos e zeros
Enunciado:
Crie uma matriz 3 por 3. Peça os valores e conte quantos são positivos, negativos e zeros.

O que precisa fazer:
Classificar cada valor usando if, else if e else.

Dicas:
Maior que 0 é positivo.
Menor que 0 é negativo.
Igual a 0 é zero.
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

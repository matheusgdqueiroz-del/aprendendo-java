package exerciciosArray;

import java.util.Scanner;

public class Exercicio38 {
    /*
    38. Boletim com nomes
Enunciado:
Peça o nome de 4 alunos em um array simples. Depois peça 3 notas para cada aluno em uma matriz.

No final, mostre o nome, as notas, a média e a situação de cada aluno.

O que precisa fazer:
Usar um array de nomes e uma matriz de notas.

Dicas:
O índice do aluno no array de nomes deve ser o mesmo índice da linha na matriz.
     */
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] alunos = new String[4];
        double[][] notas = new double[4][3];

        for (int i = 0; i < alunos.length; i++) {
            System.out.printf("Digite o nome do %dº aluno: ", i + 1);
            alunos[i] = sc.nextLine();
            for (int j = 0; j < notas[i].length; j++) {
                System.out.printf("Digite a %dª nota de %s: ", j + 1, alunos[i]);
                notas[i][j] = sc.nextDouble();
            }
            sc.nextLine();
        }
        

        sc.close();
    }
}

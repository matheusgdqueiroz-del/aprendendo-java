package exerciciosArray;

import java.util.Scanner;

public class Exercicio37 {
    /*
    37. Média de cada aluno
Enunciado:
Crie uma matriz onde cada linha representa um aluno e cada coluna representa uma nota. Use 4 alunos e 3 notas.

O que precisa fazer:
Calcular a média de cada linha da matriz.

Dicas:
Cada linha é um aluno.
Cada coluna é uma nota.
Divida a soma da linha por notas[i].length.
     */
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] notas = new double[4][3];

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.printf("Digite a %dª nota do %dº aluno: ", j + 1, i + 1);
                notas[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < notas.length; i++) {

            double soma = 0;

            for (int j = 0; j < notas[i].length; j++) {
                soma += notas[i][j];
            }

            double media = soma / notas[i].length;
            System.out.printf("A média do %d° aluno é %.2f\n", i + 1, media);
        }

        sc.close();
    }
}

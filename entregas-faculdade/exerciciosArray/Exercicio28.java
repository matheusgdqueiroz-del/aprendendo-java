package exerciciosArray;

import java.util.Scanner;

public class Exercicio28 {
    /*
    28. Relatório de alunos
Enunciado:
Peça o nome e a nota de 5 alunos. Depois mostre o nome, a nota e a situação de cada um.

O que precisa fazer:
Criar um array para nomes e outro para notas.

Dicas:
Use o mesmo índice nos dois arrays.
Exemplo: nomes[0] pertence à nota notas[0].
     */
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[5];
        double[] notas = new double[5];

        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("Digite o nome do %dº aluno: ", i + 1);
            nomes[i] = sc.nextLine();
            System.out.printf("Digite a nota de %s: ", nomes[i]);
            notas[i] = sc.nextDouble();
            sc.nextLine();
        }
        

        sc.close();
    }
}

package exerciciosArray;

import java.util.Scanner;

public class Exercicio17 {
    /*
    17. Aprovados e reprovados
Enunciado:
Peça a nota de 8 alunos e conte quantos foram aprovados e quantos foram reprovados.

O que precisa fazer:
Guardar as notas em um array e usar condição para contar.

Dicas:
Aprovado: nota maior ou igual a 7.
Reprovado: nota menor que 7.
     */
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[8];

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            notas[i] = sc.nextDouble();
        }

        int aprovados = 0;
        int reprovados = 0;

        for (double nota : notas) {
            if (nota >=7) {
                aprovados++;
            } else {
                reprovados++;
            }
        }
        System.out.printf("Tivemos %d aprovados e %d reprovados", aprovados, reprovados);

        sc.close();
    }
}

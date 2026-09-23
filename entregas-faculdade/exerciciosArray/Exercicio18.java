package exerciciosArray;

import java.util.Scanner;

public class Exercicio18 {
    /*
    18. Maior e menor nota
Enunciado:
Peça 6 notas e mostre a maior nota, a menor nota e a média da turma.

O que precisa fazer:
Guardar as notas, somar, comparar maior e menor.

Dicas:
Você pode fazer tudo em um único laço depois de preencher o array.
     */
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[6];

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Digite a %dª nota: ", i + 1);
            notas[i] = sc.nextDouble();
        }

        double menor = notas[0];
        double maior = notas[0];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < menor) {
                menor = notas[i];
            }
            if (notas[i] > maior) {
                maior = notas[i];
            }
            soma += notas[i];
        }
        double media = soma / notas.length;

        System.out.printf("""
                Menor nota: %.0f
                Maior nota: %.0f
                Média : %.2f
                """, menor, maior, media);

        sc.close();
    }
}

package exerciciosArray;

import java.util.Scanner;

public class Exercicio10 {
    /*
    10. Notas acima da média
Enunciado:
Peça 5 notas, calcule a média e depois mostre quais notas ficaram acima da média.

O que precisa fazer:
Primeiro preencher o array.
Depois calcular a média.
Depois percorrer novamente para mostrar as notas acima da média.

Dicas:
Você pode usar dois laços: um para somar e outro para comparar.
     */
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[5];
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Digite a %dº nota: ", i + 1);
            notas[i] = sc.nextDouble();
        }
        double soma = 0;
        for(double nota : notas) {
            soma += nota;
        }
        double media = soma / notas.length;
        System.out.println("A média é: " + media);
        System.out.println("As notas acima da média são: ");
        for (double nota : notas) {
            if (nota > media) {
                System.out.print(nota + " ");
            }
        }


        sc.close();
    }
}

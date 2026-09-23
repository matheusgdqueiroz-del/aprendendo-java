package exerciciosArray;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio21 {
    /*
    21. Somar dois arrays
Enunciado:
Peça os valores de dois arrays com 5 posições cada. Depois crie um terceiro array com a soma das posições correspondentes.

O que precisa fazer:
Somar posição por posição.

Dicas:
soma[i] = array1[i] + array2[i].
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros1 = new double[5];

        for (int i = 0; i < numeros1.length; i++) {
            System.out.printf("Digite o %dº número do 1º array: ", i + 1);
            numeros1[i] = sc.nextDouble();
        }

        double[] numeros2 = new double[5];

        for (int i = 0; i < numeros2.length; i++) {
            System.out.printf("Digite o %dº número do 2º array: ", i + 1);
            numeros2[i] = sc.nextDouble();
        }
        double[] numeros3 = new double[5];

        for (int i = 0; i < numeros1.length; i++) {
            numeros3[i] = numeros1[i] + numeros2[i];
        }
        System.out.println(Arrays.toString(numeros3));

        sc.close();
    }
}

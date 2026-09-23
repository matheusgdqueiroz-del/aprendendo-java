package exerciciosArray;

import java.util.Scanner;
import java.util.Arrays;

public class Exercicio16 {
    /*
    16. Criar segundo array com dobro
Enunciado:
Peça 5 números. Crie outro array onde cada posição recebe o dobro do valor do primeiro array.

O que precisa fazer:
Ter dois arrays: um original e um com os valores dobrados.

Dicas:
Use dobros[i] = numeros[i] * 2.
     */
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            numeros[i] = sc.nextDouble();
        }

        double[] numerosDobrados = new double[5];
        for (int i = 0; i < numeros.length; i++) {
            numerosDobrados[i] = numeros[i] * 2;
        }
        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(numerosDobrados));

        sc.close();
    }
}

package exerciciosArray;

import java.util.Scanner;

public class Exercicio06 {
    /*
    6. Menor número
Enunciado:
Peça 6 números e descubra qual foi o menor número digitado.

O que precisa fazer:
Guardar os valores no array e verificar qual é o menor.

Dicas:
Crie uma variável menor recebendo o primeiro valor.
Use if (numeros[i] < menor).
     */
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[6];

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %dº número: ", i + 1);
            numeros[i] = sc.nextInt();
        }

        int menor = numeros[0];

        for (int numero : numeros) {
            if (numero < menor){
            menor = numero;
            }
        }
        System.out.println(menor);

        sc.close();
    }
}

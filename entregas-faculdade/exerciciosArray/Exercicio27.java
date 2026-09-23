package exerciciosArray;

import java.util.Scanner;

public class Exercicio27 {
    /*
    27. Contar nomes que começam com a letra A
Enunciado:
Peça 6 nomes e conte quantos começam com a letra A.

O que precisa fazer:
Verificar a primeira letra de cada nome.

Dicas:
Use charAt(0) para pegar a primeira letra.
Exemplo: nomes[i].charAt(0) == 'A'.
     */
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[6];

        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("Digite o %dº nome: ", i + 1);
            nomes[i] = sc.nextLine();
        }

        for (String nome : nomes) {
            if (nome.charAt(0) == 'A') {
                System.out.printf("%s começa com a letra A\n", nome);
            }
        }

        sc.close();
    }
}

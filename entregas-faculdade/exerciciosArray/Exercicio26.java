package exerciciosArray;

import java.util.Scanner;

public class Exercicio26 {
    /*
    26. Mostrar nomes com mais de 5 letras
Enunciado:
Peça 6 nomes e mostre apenas os nomes que possuem mais de 5 letras.

O que precisa fazer:
Guardar os nomes em um array e verificar o tamanho de cada nome.

Dicas:
Para saber o tamanho de uma String, use .length().

Exemplo: nomes[i].length().
     */
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[6];

        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("Digite o %dº nome: ", i + 1);
            nomes[i] = sc.nextLine();
        }
        for (String nome : nomes) {
            if (nome.length() > 5) {
                System.out.printf("%s tem mais de 5 letras\n", nome);
            }
        }

        sc.close();
    }
}

package exerciciosArray;

import java.util.Scanner;

public class                                                                                                            Exercicio30 {
    /*
    30. Sistema simples de estoque
Enunciado:
Cadastre 5 produtos e suas quantidades em estoque. Depois mostre apenas os produtos que estão com estoque abaixo de 5 unidades.

O que precisa fazer:
Criar um array de nomes e outro de quantidades.

Dicas:
Use if (quantidades[i] < 5).
Use o mesmo índice para relacionar produto e quantidade.
     */
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] produtos = new String[5];
        int[] quantidades = new int[5];

        for (int i = 0; i < produtos.length; i++) {
            System.out.printf("Digite o nome do %dº produto: ", i + 1);
            produtos[i] = sc.nextLine();
            System.out.printf("Digite a quantidade de %s: ", produtos[i]);
            quantidades[i] = sc.nextInt();
            sc.nextLine();
        }

        for (int i = 0; i < produtos.length; i++) {
            if (quantidades[i] < 5) {
                System.out.printf("%s tem menos de 5 unidades no estoque\n", produtos[i]);
            }
        }

        sc.close();
    }
}

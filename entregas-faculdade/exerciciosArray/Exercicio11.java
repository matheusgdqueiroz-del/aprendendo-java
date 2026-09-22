package exerciciosArray;

import java.util.Scanner;

public class Exercicio11 {
    /*
    11. Buscar nome
Enunciado:
Peça o nome de 5 alunos. Depois peça um nome para pesquisar e informe se ele foi encontrado.

O que precisa fazer:
Comparar o nome pesquisado com cada nome do array.

Dicas:
Para comparar String, use .equals().

Exemplo: nomePesquisado.equals(nomes[i]).
     */
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] alunos = new String[5];

        for (int i = 0; i < alunos.length; i++) {
            System.out.printf("Digite o nome do %dº aluno: ", i + 1);
            alunos[i] = sc.nextLine();
        }

        System.out.print("Digite um nome para pesquisar: ");
        String nome = sc.nextLine();

        for (String aluno : alunos) {
            if (nome.equals(aluno)) {
                System.out.printf("O(a) aluno(a) %s existe na lista!", nome);
            } else {
                System.out.println("Aluno não encontrado!");
                break;
            }
        }

        sc.close();
    }
}

package ExerciciosLoop;

import java.util.Scanner;


public class Exercicio10 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("1 - Cadastrar usuario 2 - Listar usuários 3 - Sair");
            opcao = sc.nextInt();

        } while (opcao != 3);
        System.out.println("Sistema encerrado!");
    }
}

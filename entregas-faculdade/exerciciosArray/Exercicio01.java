package exerciciosArray;

import java.util.Scanner;

public class Exercicio01 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[5];
        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("Digite o %dº nome: ", i+1);
            nomes[i] = sc.nextLine();
        }
        for (String nome : nomes) {
            System.out.println(nome);
        }

    }
}

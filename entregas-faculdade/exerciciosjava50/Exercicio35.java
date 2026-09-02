package exerciciosjava50;

import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        /*
         * Parte 4 — Decisões com else if
         *
         * 35. Nível do jogador
         * Peça a quantidade de XP do jogador.
         *
         * Classifique assim:
         *
         * Menor que 1000: iniciante
         * De 1000 até 4999: intermediário
         * De 5000 até 9999: avançado
         * 10000 ou mais: lendário
         *
         */
        Scanner sc = new Scanner(System.in);

        int xp;
        String mensagem;

        System.out.println("Digite a quantidade de XP: ");
        xp = sc.nextInt();

        if(xp < 1000) {
            mensagem = "iniciante";
        } else if(xp < 5000) {
            mensagem = "intermediário";
        } else if(xp < 10000) {
            mensagem = "avançado";
        } else {
            mensagem = "lendário";
        }
        System.out.println(mensagem);

        sc.close();
    }
}

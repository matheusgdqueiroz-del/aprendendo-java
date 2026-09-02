package exerciciosjava50;

import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        /*
         * Parte 4 — Decisões com else if
         *
         * 34. Clima do dia
         * Peça a temperatura.
         *
         * Classifique assim:
         *
         * Menor que 15: frio
         * De 15 até 25: agradável
         * De 26 até 35: quente
         * Acima de 35: muito quente
         *
         */
        Scanner sc = new Scanner(System.in);

        double temperatura;
        String mensagem;

        System.out.println("Digite a temperatura: ");
        temperatura = sc.nextDouble();

        if(temperatura < 15) {
            mensagem = "frio";
        } else if(temperatura <= 25) {
            mensagem = "agradável";
        } else if(temperatura <= 35) {
            mensagem = "quente";
        } else {
            mensagem = "muito quente";
        }
        System.out.println(mensagem);

        sc.close();
    }
}

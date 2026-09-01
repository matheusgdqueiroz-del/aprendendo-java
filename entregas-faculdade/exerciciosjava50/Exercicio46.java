package exerciciosjava50;

import java.util.Scanner;

public class Exercicio46 {
    public static void main(String[] args) {
        /*
         * Parte 6 — Switch case
         *
         * 46. Dia da semana
         * Peça um número de 1 a 7.
         *
         * Use switch case para mostrar o dia da semana correspondente.
         *
         * 1: domingo
         * 2: segunda-feira
         * 3: terça-feira
         * 4: quarta-feira
         * 5: quinta-feira
         * 6: sexta-feira
         * 7: sábado
         *
         * Qualquer outro número deve mostrar:
         *
         * Dia inválido.
         *
         */
        Scanner sc = new Scanner(System.in);

        int numero;
        String dia;

        System.out.println("Digite um número de 1 a 7: ");
        numero = sc.nextInt();

        switch(numero) {
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda-feira";
                break;
            case 3:
                dia = "terça-feira";
                break;
            case 4:
                dia = "quarta-feira";
                break;
            case 5:
                dia = "quinta-feira";
                break;
            case 6:
                dia = "sexta-feira";
                break;
            case 7:
                dia = "sábado";
                break;
            default:
                dia = "Dia inválido.";
        }

        System.out.println(dia);

        sc.close();
    }
}

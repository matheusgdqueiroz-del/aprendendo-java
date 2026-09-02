package exerciciosjava50;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        /*
         * Parte 2 — Decisões simples com if
         *
         * 15. Temperatura alta
         * Peça a temperatura atual.
         *
         * Se ela for maior que 30, mostre:
         *
         * Está muito quente hoje.
         *
         */
        Scanner sc = new Scanner(System.in);

        double temperatura;

        System.out.print("Digite a temperatura: ");
        temperatura = sc.nextDouble();

        if(temperatura > 30) {
            System.out.println("Está muito quente hoje.");
        }

        sc.close();
    }
}

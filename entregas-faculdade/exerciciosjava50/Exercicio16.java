package exerciciosjava50;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        /*
         * Parte 2 — Decisões simples com if
         *
         * 16. Velocidade do carro
         * Peça a velocidade do veículo.
         *
         * Se a velocidade for maior que 80, mostre:
         *
         * Você foi multado.
         *
         */
        Scanner sc = new Scanner(System.in);

        double velocidade;

        System.out.print("Digite a velocidade do carro: ");
        velocidade = sc.nextDouble();

        if(velocidade > 80) {
            System.out.println("Você foi multado");
        }

        sc.close();
    }
}

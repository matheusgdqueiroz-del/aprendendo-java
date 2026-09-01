package exerciciosjava50;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        /*
         * Parte 1 — Aquecimento com entrada de dados
         *
         * 5. Média de três notas
         * Peça três notas para o usuário.
         *
         * Calcule a média e mostre o resultado final.
         *
         */
        Scanner sc = new Scanner(System.in);

        double nota1, nota2, nota3, mediaNotas;

        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        nota3 = sc.nextDouble();

        mediaNotas = (nota1 + nota2 + nota3) / 3;

        System.out.printf("A média das notas é: %.2f", mediaNotas);
        sc.close();
    }
}

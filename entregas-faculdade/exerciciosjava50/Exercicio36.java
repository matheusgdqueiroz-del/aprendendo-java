package exerciciosjava50;

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        /*
         * Parte 4 — Decisões com else if
         *
         * 36. IMC
         * Peça o peso e a altura do usuário.
         *
         * Calcule o IMC.
         *
         * Depois classifique assim:
         *
         * Menor que 18.5: abaixo do peso
         * De 18.5 até 24.9: peso normal
         * De 25 até 29.9: sobrepeso
         * 30 ou mais: obesidade
         *
         */
        Scanner sc = new Scanner(System.in);

        double peso;
        double altura;
        double imc;
        String mensagem;

        System.out.println("Digite seu peso: ");
        peso = sc.nextDouble();

        System.out.println("Digite sua altura: ");
        altura = sc.nextDouble();

        imc = peso / (altura * altura);

        if(imc < 18.5) {
            mensagem = "abaixo do peso";
        } else if(imc < 25) {
            mensagem = "peso normal";
        } else if(imc < 30) {
            mensagem = "sobrepeso";
        } else {
            mensagem = "obesidade";
        }
        System.out.println(mensagem);

        sc.close();
    }
}

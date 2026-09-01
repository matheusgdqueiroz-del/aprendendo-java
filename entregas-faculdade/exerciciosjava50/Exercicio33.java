package exerciciosjava50;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        /*
         * Parte 4 — Decisões com else if
         *
         * 33. Faixa salarial
         * Peça o salário do usuário.
         *
         * Classifique assim:
         *
         * Até 1500: salário baixo
         * De 1501 até 3000: salário médio
         * De 3001 até 7000: salário bom
         * Acima de 7000: salário alto
         *
         */
        Scanner sc = new Scanner(System.in);

        double salario;
        String mensagem;

        System.out.println("Digite seu salário: ");
        salario = sc.nextDouble();

        if(salario <= 1500) {
            mensagem = "salário baixo";
        } else if(salario <= 3000) {
            mensagem = "salário médio";
        } else if(salario <= 7000) {
            mensagem = "salário bom";
        } else {
            mensagem = "salário alto";
        }
        System.out.println(mensagem);

        sc.close();
    }
}

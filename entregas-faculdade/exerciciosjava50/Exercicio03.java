package exerciciosjava50;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        /*
         * Parte 1 — Aquecimento com entrada de dados
         *
         * 3. Calculando idade aproximada
         * Peça para o usuário digitar o ano de nascimento.
         *
         * Depois calcule e mostre a idade aproximada dele.
         *
         */
        Scanner sc = new Scanner(System.in);

        // Passei usar int ou double como default pois evita diversos problemas de incompatibilidae.
        // Nesse caso, por exemplo, usar short daria erro ao tentar atribuir com LocalDate
        // Short, byte ou float são otimizações de memória para casos muito especificos.

        int anoNascimento, idadeAproximada;

        System.out.print("Digite o ano do seu nascimento: ");
        anoNascimento = sc.nextInt();

        idadeAproximada = LocalDate.now().getYear() - anoNascimento;

        System.out.println("A sua idade aproximada é " + idadeAproximada);
        sc.close();
    }
}

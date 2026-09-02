package faccat;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o seu salário atual? ");
        double salario = sc.nextDouble();

        System.out.print("Qual o percentual de reajuste? ");
        double reajuste = sc.nextDouble();

        double novoSalario = salario * (1 + reajuste / 100);

        System.out.printf("""
                O seu salário era R$ %.2f
                Com o reajuste de %.2f%%, o seu salário foi para R$ %.2f
                """, salario, reajuste, novoSalario);

        sc.close();
    }
}
package faccat;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        double altura, base, area;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da base: ");
        base = sc.nextDouble();

        System.out.print("Digite o valor da altura: ");
        altura = sc.nextDouble();

        area = base * altura;

        System.out.printf("A área do retângulo é %.2f ", area);

        sc.close();
    }
}

package intermediario.teste;

import intermediario.dominio.Calculadora;

import java.util.Scanner;

public class CalculadoraTeste01 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int x = sc.nextInt();

        System.out.println("Digite o segundo valor: ");
        int y = sc.nextInt();

        calculadora.soma(x, y);
        calculadora.subtracao(x, y);
        calculadora.multiplicacao(x, y);
    }
}

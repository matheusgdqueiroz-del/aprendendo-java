package faccat;

import java.util.Scanner;

public class Sucessor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = teclado.nextInt();

        int sucessor = numero + 1;

        System.out.println("O sucessor é: " + sucessor);

        teclado.close();
    }
}
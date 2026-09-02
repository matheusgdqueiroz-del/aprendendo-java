package faccat;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = teclado.nextInt();

        int antecessor = numero - 1;

        System.out.println("O antecessor é: " + antecessor);

        teclado.close();
    }
}

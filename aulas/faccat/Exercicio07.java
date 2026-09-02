package faccat;
import java.util.Scanner;

public class Exercicio07 {
   // Faça um algoritmo que leia a idade de uma pessoa expressa em anos,
   // meses e dias e escreva a idade
   // dessa pessoa expressa apenas em dias.
   // Considerar ano com 365 dias e mês com 30 dias.
    public static void main(String[] args) {
        byte dias, meses, anos;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos anos voce tem?");
        anos = sc.nextByte();

        System.out.println("Quantos meses adicionais?");
        meses = sc.nextByte();

        System.out.println("Quantos dias adicionais?");
        dias = sc.nextByte();

        int diasDeVida = dias + (meses * 30) + (anos * 365);

        System.out.println("Você tem " + diasDeVida + " dias de vida!");

    }
}

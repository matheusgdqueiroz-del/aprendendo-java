package exerciciosjava50;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        /*
         * Parte 1 — Aquecimento com entrada de dados
         *
         * 1. Apresentação do usuário
         * Crie um programa que pergunte o nome, a idade e a cidade do usuário.
         *
         * No final, mostre uma mensagem apresentando essa pessoa.
         *
         */
        String nome, cidade;
        short idade;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        nome = sc.nextLine();
        System.out.print("Digite a sua idade: ");
        idade = Byte.parseByte(sc.nextLine());
        System.out.print("Digite a sua cidade: ");
        cidade = sc.nextLine();

        System.out.printf("""
                APRESENTAÇÃO DO USUÁRIO
                =======================
                Nome: %s
                Idade: %d
                Cidade: %s 
                =======================
                """, nome, idade, cidade);

        sc.close();
    }
}

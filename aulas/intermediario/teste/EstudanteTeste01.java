package intermediario.teste;

import intermediario.dominio.Estudante;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudante estudante = new Estudante();


        System.out.println("Digite o nome do estudante: ");
        String nome = sc.nextLine();
        estudante.nome = nome;

        System.out.println("Digite a idade do estudante");
        int idade = Integer.parseInt(sc.nextLine());
        estudante.idade = idade;

        System.out.println("Digite o rg do estudante: ");
        String rg = sc.nextLine();
        estudante.rg = rg;

        System.out.println("Digite o tel do estudante: ");
        String tel = sc.nextLine();
        estudante.tel = tel;

        System.out.println("Digite o curso do estudante: ");
        String curso = sc.nextLine();
        estudante.curso = curso;

        System.out.printf("""
                DADOS DO ESTUDANTE
                ------------------
                Nome: %s
                Idade: %d
                Rg: %s
                Tel: %s
                Curso: %S
                ------------------
                """, estudante.nome, estudante.idade, estudante.rg, estudante.tel, estudante.curso);

    }
}

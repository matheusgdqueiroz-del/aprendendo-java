package intermediario.teste;

import intermediario.dominio.Professor;

import java.util.Scanner;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Professor professor = new Professor();

        System.out.println("Digite o nome do professor: ");
        String nome = sc.nextLine();
        professor.nome = nome;

        System.out.println("Digite a idade do professor: ");
        int idade = Integer.parseInt(sc.nextLine());
        professor.idade = idade;

        System.out.println("Digite a disciplina do professor: ");
        String disciplina = sc.nextLine();
        professor.disciplina = disciplina;

        System.out.println("Digite o salario do professor: ");
        double salario = Double.parseDouble(sc.nextLine());
        professor.salario = salario;

        System.out.printf("""
                DADOS DO PROFESSOR
                ------------------
                Nome: %s
                Idade: %d
                Disciplina: %s
                Salario: R$ %.2f
                ------------------
                """, professor.nome, professor.idade, professor.disciplina, professor.salario);
    }
}

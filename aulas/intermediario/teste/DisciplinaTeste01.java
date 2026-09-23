package intermediario.teste;

import intermediario.dominio.Disciplina;

import java.util.Scanner;

public class DisciplinaTeste01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Disciplina disciplina = new Disciplina();

        System.out.println("Digite o nome da disciplina: ");
        String nome = sc.nextLine();
        disciplina.nome = nome;

        System.out.println("Digite a carga horaria da disciplina: ");
        int cargaHorario = Integer.parseInt(sc.nextLine());
        disciplina.cargaHorario = cargaHorario;

        System.out.println("Digite o nome do professor: ");
        String nomeProfessor = sc.nextLine();
        disciplina.nomeProfessor = nomeProfessor;

        System.out.println("Digite o semestre da disciplina: ");
        int semestre = Integer.parseInt(sc.nextLine());
        disciplina.semestre = semestre;

        System.out.printf("""
                DADOS DA DISCIPLINA
                -------------------
                Nome: %s
                Carga horaria: %d horas
                Professor: %s
                Semestre: %d
                -------------------
                """, disciplina.nome, disciplina.cargaHorario,
                disciplina.nomeProfessor, disciplina.semestre);
    }
}

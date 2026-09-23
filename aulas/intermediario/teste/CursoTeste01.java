package intermediario.teste;

import intermediario.dominio.Curso;

import java.util.Scanner;

public class CursoTeste01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Curso curso = new Curso();

        System.out.println("Digite o nome do curso: ");
        String nome = sc.nextLine();
        curso.nome = nome;

        System.out.println("Digite a duracao do curso em anos: ");
        int duracaoAnos = Integer.parseInt(sc.nextLine());
        curso.duracaoAnos = duracaoAnos;

        System.out.println("Digite a mensalidade do curso: ");
        double mensalidade = Double.parseDouble(sc.nextLine());
        curso.mensalidade = mensalidade;

        System.out.println("Digite o modelo do curso: ");
        String modelo = sc.nextLine();
        curso.modelo = modelo;

        System.out.println("Digite o turno do curso: ");
        String turno = sc.nextLine();
        curso.turno = turno;

        System.out.printf("""
                DADOS DO CURSO
                --------------
                Nome: %s
                Duracao: %d anos
                Mensalidade: R$ %.2f
                Modelo: %s
                Turno: %s
                --------------
                """, curso.nome, curso.duracaoAnos, curso.mensalidade,
                curso.modelo, curso.turno);
    }
}

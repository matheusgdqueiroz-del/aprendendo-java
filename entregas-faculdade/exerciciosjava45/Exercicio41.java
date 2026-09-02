package exerciciosjava45;

public class Exercicio41 {
    static void main(String[] args) {
        double nota = 8;
        int presenca = 80;
        String mensagem;

        if (nota >= 7 && presenca >= 75) {
            mensagem = "Aprovado";
        } else if (nota >= 5 && nota < 7) {
            mensagem = "Recuperação";
        } else {
            mensagem = "Reprovado";
        }
        System.out.println(mensagem);
    }
}

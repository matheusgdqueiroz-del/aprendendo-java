package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class Exercicio22 {
    static void main(String[] args) {
        double nota = 8;
        String mensagem;
        if (nota >= 9) {
            mensagem = "Excelente";
        } else if (nota >= 7) {
            mensagem = "Bom";
        } else if (nota >= 5) {
            mensagem = "Recuperação";
        } else {
            mensagem = "Reprovado";
        }
        System.out.println(mensagem);
    }
}

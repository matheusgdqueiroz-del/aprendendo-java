package exerciciosjava45;

public class Exercicio21 {
    static void main(String[] args) {
        byte idade = 25;
        String mensagem;
        if (idade < 12) {
            mensagem = "Criança";
        } else if (idade <= 17) {
            mensagem = "Adolescente";
        } else if (idade <= 59) {
            mensagem = "Adulto";
        } else {
            mensagem = "Idoso";
        }
        System.out.println(mensagem);
    }
}

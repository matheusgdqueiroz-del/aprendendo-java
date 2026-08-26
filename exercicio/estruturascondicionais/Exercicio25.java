package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class Exercicio25 {
    static void main(String[] args) {
        int xp = 7500;
        String mensagem;
        if (xp < 1000) {
            mensagem = "Iniciante";
        } else if (xp <= 4999) {
            mensagem = "Intermediário";
        } else if (xp <= 9999) {
            mensagem = "Avançado";
        } else {
            mensagem = "Lendário";
        }
        System.out.println(mensagem);
    }
}

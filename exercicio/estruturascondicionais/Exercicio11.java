package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class Exercicio11 {
    static void main(String[] args) {
        byte idade = 27;
        String mensagem;
        if (idade >= 18) {
            mensagem = "Maior de idade";
        } else {
            mensagem = "Menor de idade";
        }
        System.out.println(mensagem);
    }
}

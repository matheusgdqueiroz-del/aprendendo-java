package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class Exercicio15 {
    static void main(String[] args) {
        long numero = 20;
        String mensagem;
        if (numero >= 0) {
            mensagem = "Número positivo";
        } else {
            mensagem = "Número negativo";
        }
        System.out.println(mensagem);
    }
}

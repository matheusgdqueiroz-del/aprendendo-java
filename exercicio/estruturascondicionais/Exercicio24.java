package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class Exercicio24 {
    static void main(String[] args) {
        int temperatura = 28;
        String mensagem;
        if (temperatura < 15) {
            mensagem = "Frio";
        } else if (temperatura <= 25) {
            mensagem = "Agradável";
        } else if (temperatura <= 35) {
            mensagem = "Quente";
        } else {
            mensagem = "Muito quente";
        }
        System.out.println(mensagem);
    }
}

package exerciciosjava45;

public class Exercicio43 {
    static void main(String[] args) {
        byte idade = 20;
        boolean temCarteirinhaEstudante = true;
        String mensagem;

        if (idade < 12 || temCarteirinhaEstudante) {
            mensagem = "Paga meia entrada";
        } else {
            mensagem = "Paga entrada inteira";
        }
        System.out.println(mensagem);
    }
}

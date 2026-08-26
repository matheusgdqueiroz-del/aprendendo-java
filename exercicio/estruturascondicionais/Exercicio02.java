package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class Exercicio02 {
    static void main(String[] args) {
        // 2. Verificar saldo positivo
        // Crie uma variável saldo.
        // Se o saldo for maior que 0, exiba:
        // "Você possui saldo disponível."
        double saldo = 100;
        String mensagem = "";
        if (saldo > 0) {
            mensagem = "Você possui saldo disponível.";
        }
        System.out.println(mensagem);
    }
}

package flamingo.aprendendo.basico.exercicio.estruturascondicionais;

public class Exercicio14 {
    static void main(String[] args) {
        boolean emailCorreto = true;
        boolean senhaCorreta = true;
        String mensagem;
        if (emailCorreto && senhaCorreta) {
            mensagem = "Login realizado com sucesso!";
        } else {
            mensagem = "Email ou senha inválidos!";
        }
        System.out.println(mensagem);
    }
}

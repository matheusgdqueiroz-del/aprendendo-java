package unidade03;

public class ValidadorCadastro {

    public static boolean emailPreenchido(String email) {
        return email != null && !email.trim().isEmpty();

    }public static boolean nomePreenchido(String nome) {
        return nome != null && !nome.trim().isEmpty();
    }

    public static boolean idadePermitida(int idade) {
        return idade >= 18 && idade <= 130;
    }

    public static boolean senhaValida(String senha) {
        return senha != null && senha.length() >= 8;
    }

    public static String avaliarCadastro(
            String email,
            int idade,
            String senha,
            boolean termosAceitos,
            String nome
            ) {

        if (!emailPreenchido(email)) {
            return "E-MAIL OBRIGATORIO";
        }

        if (!nomePreenchido(nome)) {
            return "NOME NAO PREENCHIDO";
        }

        if (!idadePermitida(idade)) {
            return "IDADE NAO PERMITIDA";
        }

        if (!senhaValida(senha)) {
            return "SENHA INVALIDA";
        }

        if (!termosAceitos) {
            return "TERMOS NAO ACEITOS";
        }

        return "CADASTRO PERMITIDO";
    }

    public static void main(String[] args) {

        String email = "aluno@exemplo.com";
        int idade = 18;
        String senha = "qa123456";
        boolean termosAceitos = true;
        String nome = "Matheus";

        String resultado = avaliarCadastro(email, idade, senha, termosAceitos, nome);

        System.out.println("Resultado: " + resultado);

        System.out.println();
        System.out.println("Verificando idades proximas ao limite:");

        for (int idadeTeste = 16; idadeTeste <= 20; idadeTeste++) {

            boolean permitido = idadePermitida(idadeTeste);

            System.out.println(
                    "Idade " + idadeTeste +
                            " -> " + permitido
            );
        }
    }
}

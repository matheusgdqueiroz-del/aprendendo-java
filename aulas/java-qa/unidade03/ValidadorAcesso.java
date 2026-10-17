package unidade03;

public class ValidadorAcesso {

    public static boolean usuarioAtivo (boolean ativo) {
        return ativo;
    }

    public static boolean usuarioBloqueado (boolean bloqueado) {
        return bloqueado;
    }

    public static boolean qtdTentativas (int tentativas) {
        return tentativas <= 3;
    }

    public static boolean perfilPreenchido (String perfil) {

        return perfil == "ALUNO" || perfil == "PROFESSOR";
    }

    public static String acessoPermitido (
            boolean ativo,
            boolean bloqueado,
            int tentativas,
            String preenchido

    ) {
        if (!usuarioAtivo(ativo)) {
            return "O USUÁRIO NÃO ESTÁ ATIVO!";
        }

        if (usuarioBloqueado(bloqueado)) {
            return "O USUÁRIO ESTÁ BLOQUEADO!";
        }

        if (!qtdTentativas(tentativas)) {
            return "NÚMERO MÁXIMO DE TENTATIVAS EXCEDIDO!";
        }

        if (!perfilPreenchido(preenchido)) {
            return "O USUÁRIO PRECISA SER ALUNO OU PROFESSOR";
        }
        return "ACESSO VALIDADO";
    }

}

static void main(String[] args) {
    boolean ativo = true;
    boolean bloqueado = false;
    int tentativas = 2;
    String preenchido = "ALUNO";

    String resultado = acessoPermitido(ativo, bloqueado, tentativas, preenchido);
}

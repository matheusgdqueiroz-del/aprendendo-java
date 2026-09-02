package faccat;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o total de eleitores: ");
        int eleitores = sc.nextInt();

        System.out.print("Digite o total de votos válidos: ");
        int validos = sc.nextInt();

        System.out.print("Digite o total de votos brancos: ");
        int brancos = sc.nextInt();

        System.out.print("Digite o total de votos nulos: ");
        int nulos = sc.nextInt();

        double porcentagemValidos = validos * 100.0 / eleitores;
        double porcentagemBrancos = brancos * 100.0 / eleitores;
        double porcentagemNulos = nulos * 100.0 / eleitores;

        int naoVotaram = eleitores - validos - brancos - nulos;

        System.out.printf("""
                Total de eleitores: %d
                Votos válidos: %.2f%%
                Votos brancos: %.2f%%
                Votos nulos: %.2f%%
                Não votaram: %d
                """,
                eleitores,
                porcentagemValidos,
                porcentagemBrancos,
                porcentagemNulos,
                naoVotaram
        );

        sc.close();
    }
}
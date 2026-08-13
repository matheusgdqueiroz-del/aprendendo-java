package flamingo.aprendendo.introducao;

import java.time.LocalDate;

public class ExercicioPraticaBasica {
    static void main(String[] args) {
        String nome = "Matheus";
        String endereco = "Rua Padre José Natuzzi,164 casa 4";
        double salario = 10000.66;
        LocalDate hoje = LocalDate.now();
        System.out.println("Eu" + nome + "morando no endereço " + endereco + ", confirmo o salário de " + salario + " na data " + hoje );
    }
}

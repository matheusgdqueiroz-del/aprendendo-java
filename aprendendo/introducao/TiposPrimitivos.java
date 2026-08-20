package flamingo.aprendendo.introducao;

public class TiposPrimitivos {
    public static void main(String[] args){
        // byte : -128 a 127
        // short : -32.768 a 32.767
        // long : Para números inteiros muito grande (usa um L o final do numero
        // float : Precisão simples (usa um f no final, ex: 5.5f)
        // double: Precisão dupla, sendo o padrão para decimais no Java
        // char : Guarda uma única letra ou simbolo em formato Unicode (ex: 'A')
        // boolean Guarda apenas dois valores: true (verdadeiro) ou false (falso))
        short idade = 20;
        int municipio = 114000000;
        long contaBancaria = 999999999999999999L;
        float salario = 15000.66f;
        double salarioExtra = 25000.50;
        char primeiraLetraDoNome = 'J';
        boolean vaiEstudarNasFerias = true;
        System.out.println("Minha idade é " + idade);
        System.out.println("São paulo (SP): Mais de " + municipio + " milhões de moradores.");
        System.out.println("Minha conta bancaria daqui a 5 anos " + contaBancaria);
        System.out.println("Meu salario depois de estudar com o bigas " + salario );
        System.out.println("Plr caiu " + salarioExtra);
        System.out.println("A primeira letra do meu nome é " + primeiraLetraDoNome);
        System.out.println(vaiEstudarNasFerias);
    }
}

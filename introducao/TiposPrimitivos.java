package flamingo.aprendendo.introducao;


public class TiposPrimitivos {

    public static void main(String[] args) {
        // byte -128 até 127
        //short -32.768 a 32.767
        short idade = 27;
        int municipio = 2000000000;
        long contaBancaria = 999999999999999999L;
        float salario = 10000.66F;
        double salarioExtra = 5000.50;
        char primeiraLetraDoNome = 'M';
        boolean vaiFicarRico = true;
        System.out.println("Minha idade é " + idade);
        System.out.println("São Paulo SP possui mais de " + municipio + " habitantes");
        System.out.println("Minha conta bancaria daqui a 5 anos: " + contaBancaria);
        System.out.println("Meu salario é: " + salario);
        System.out.println("Meu salario extra é: " + salarioExtra);
        System.out.println("Primeira letra do meu nome é: " + primeiraLetraDoNome);
        System.out.println("Eu vou ficar rico futuramente? " + vaiFicarRico);
    }
}

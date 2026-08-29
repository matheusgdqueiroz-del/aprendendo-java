package basico;

public class OperadoresParte02 {
    static void main(String[] args) {
        /*
        <, >, <=, >=, ==, !=
        */
        byte idade = 27;
        byte idadeMae = 50;
        byte idadePrima = 27;
        System.out.println("A idade da minha mãe é maior que a minha? " + (idadeMae > idade));
        System.out.println("A minha idade é maior que a da minha mãe? " + (idade > idadeMae));
        System.out.println("A minha idade é menor ou igual a da minha prima? " + (idade <= idadePrima));
        System.out.println("A minha idade é maior ou igual a da minha mãe? " + (idade >= idadeMae));
        System.out.println("A minha idade é igual a da minha prima? " + (idade == idadePrima));
        System.out.println("A minha idade é diferente da minha prima? " + (idade != idadePrima));
    }
}

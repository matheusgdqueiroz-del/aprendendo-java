package flamingo.aprendendo.basico;

public class EstruturasCondicionaisParte02 {
    static void main(String[] args) {
        /*byte idade = 17;

        if(idade >= 18) {
            System.out.println("Pode comprar bebida");
        } else {
            System.out.println("Não pode comprar bebida");
        }*/

        byte idade = 16;
        String categoria = "";

        if(idade < 15) {
            categoria = "Infantil";
        } else if (idade < 18) {
            categoria = "Juvenil";
        } else {
            categoria = "Adulto";
        }
        System.out.println("A categoria é: " + categoria);
    }

}

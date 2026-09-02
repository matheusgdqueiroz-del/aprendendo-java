package basico;

public class EstruturasCondicionaisParte01 {
    static void main(String[] args) {
        byte idade = 18;
        boolean isAutorizadoComprarBebida = idade >= 21;

        if (isAutorizadoComprarBebida) {
            System.out.println("Pode comprar bebida");
        }
    }
}

import entities.Conta;
import utils.Minha;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Conta s = new Conta(1, "11", "jucu", 300);
        Minha.saida(s.toString());
        s.sacar(295);

        Minha.saida(s.toString());
    }
}

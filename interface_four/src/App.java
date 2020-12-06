import services.Services;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Conta s = new Conta(1, "11", "jucu", 300);
        // Conta s2 = new Conta(1, "11", "jucu", 300);
        // s.transfere(s2, 301);
        // Minha.saida(s.toString());
        // Minha.saida(s2.toString());

        Services.registrar();
        Services.registrar();

        Services.listar();

    }
}

import entities.Casa;
import entities.Moto;
import interfaces.ITaxable;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        ITaxable casa = new Casa("Sucatinga", false, 100);
        ITaxable moto = new Moto(1, 100, 50);
    }
}

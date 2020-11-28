import services.ProductManagment;
import view.Layout;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        ProductManagment productManagment = new ProductManagment();

        productManagment.register();
        Layout.clearScreen();
        productManagment.register();

    }

}

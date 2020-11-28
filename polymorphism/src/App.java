import java.util.Scanner;

import services.ProductManagment;
import view.Layout;

public class App {
    public static void main(String[] args) {
        boolean isLive = true;
        Scanner input = new Scanner(System.in);
        ProductManagment productManagment = new ProductManagment();

        while (isLive) {
            Layout.menu();
            switch (input.nextInt()) {
                case 0:
                    isLive = false;
                    productManagment.showAll();
                    break;
                case 1:
                    productManagment.register();
                    break;
            }
        }

    }

}

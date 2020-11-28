package services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import constant.Kind;
import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;
import util.My;
import view.Layout;

public class ProductManagment {

    List<Product> productManagment = new ArrayList<Product>();

    public void register() {
        Scanner input = new Scanner(System.in);
        String nameController, manufactureDateController;
        double priceController, customsFreeController;

        My.Print("Name: ");
        nameController = input.nextLine();
        My.Print("price: ");
        priceController = input.nextDouble();

        Layout.kind();

        switch (input.nextInt()) {
            case 0:
                Product product = new Product(nameController, priceController, Kind.COMMON);
                productManagment.add(product);
                break;
            case 1:
                Layout.customsFree();
                customsFreeController = input.nextInt();
                ImportedProduct imported = new ImportedProduct(nameController, priceController, customsFreeController);
                productManagment.add(imported);
                break;
            case 2:
                Layout.manufactureDate();
                manufactureDateController = input.next();
                UsedProduct used = new UsedProduct(nameController, priceController, manufactureDateController);
                productManagment.add(used);
                break;

        }

        My.Print("product successfully added!");
    }

    public void showAll() {
        My.Print("-----------------------------------");
        for (Product e : productManagment) {
            My.Print(e.toString());
        }
    }

}

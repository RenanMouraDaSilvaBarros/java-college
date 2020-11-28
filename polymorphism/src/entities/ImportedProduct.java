package entities;

import constant.Kind;

public class ImportedProduct extends Product {
    Kind kind = Kind.IMPORTED;
    double customsFree;

    public ImportedProduct(String name, double price, double customsFree) {
        super(name, price);
        this.customsFree = customsFree;
    }

}
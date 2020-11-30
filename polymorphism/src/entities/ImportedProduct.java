package entities;

import constant.Kind;

public class ImportedProduct extends Product {
    static Kind kind = Kind.IMPORTED;
    double customsFree;

    public ImportedProduct(String name, double price, double customsFree) {
        super(name, price, kind);
        this.customsFree = customsFree;
    }

    @Override
    double priceTag() {
        return super.priceTag() * customsFree;
    }

    @Override
    public String toString() {
        return super.toString() + "CustomsFree: " + customsFree + "\n";
    }

}
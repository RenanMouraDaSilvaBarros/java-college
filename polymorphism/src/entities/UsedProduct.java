package entities;

import constant.Kind;

public class UsedProduct extends Product {

    static Kind kind = Kind.USED;
    String manufactureDate;

    public UsedProduct(String name, double price, String manufactureDate) {
        super(name, price, kind);
        this.manufactureDate = manufactureDate;
    }


   

    @Override
    public String toString() {
        return super.toString() + "Manufacture date: " + manufactureDate + "\n";
    };

}

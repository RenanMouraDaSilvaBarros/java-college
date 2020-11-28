package entities;

import constant.Kind;
import java.util.Date;

public class UsedProduct extends Product {

    static Kind kind = Kind.USED;
    String manufactureDate;

    public UsedProduct(String name, double price, String manufactureDate) {
        super(name, price, kind);
        this.manufactureDate = manufactureDate;
    }

    Date manufatureDate;

    String priceTag() {
        return "";
    }

    @Override
    public String toString() {
        return super.toString() + "Manufacture date: " + manufactureDate + "\n";
    };

}

package entities;

import constant.Kind;
import java.util.Date;

public class UsedProduct extends Product {

    Kind kind = Kind.USED;
    String manufactureDate;

    public UsedProduct(String name, double price, String manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;

    }

    Date manufatureDate;

    String priceTag() {
        return "";
    };

}

package entities;

import constant.Kind;

public class Product {
    private static int id = 1;
    String name;

    double price;

    Kind kind = Kind.COMMON;

    public Product(String name, double price, Kind kind) {
        this.name = name;
        this.price = price;
        this.kind = kind;
    }

    String priceTag() {
        return String.valueOf(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product #" + id++ + " data:\n" + "Common, used or imported? " + kind + "\nName: " + name + "\nPrice: "
                + price + "\n";
    }

}

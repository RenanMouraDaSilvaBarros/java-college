package entities;

import constant.Kind;

public class Product {

    String name;

    double price;

    Kind kind = Kind.COMMON;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
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
        return "Product [name=" + name + ", price=" + price + "]";
    }

}

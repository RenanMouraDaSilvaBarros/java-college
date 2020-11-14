package entities;

import java.util.Date;

abstract class Person {
    String name;
    int identity;
    Date birth;

    @Override
    public String toString() {
        return "Person name:" + name + "idantity:" + identity + "birth" + birth;
    }
}

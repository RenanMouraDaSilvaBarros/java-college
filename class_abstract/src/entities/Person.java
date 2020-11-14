package entities;

abstract class Person {

    String name;
    int identity;
    String birth;

    public Person(String name, int identity, String birth) {
        this.name = name;
        this.identity = identity;
        this.birth = birth;
    }

    @Override
    public String toString() {
        return " Person name:" + name + " identity:" + identity + " birth" + birth;
    }

}

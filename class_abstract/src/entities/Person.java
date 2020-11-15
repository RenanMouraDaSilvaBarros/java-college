package entities;

import java.util.UUID;

abstract class Person {

    String name;
    int identity;
    String birth;
    String id;

    public Person(String name, int identity, String birth) {
        this.name = name;
        this.identity = identity;
        this.birth = birth;
        this.id = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdentity() {
        return identity;
    }

    public void setIdentity(int identity) {
        this.identity = identity;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return " Person name:" + name + " identity:" + identity + " birth:" + birth;
    }

}

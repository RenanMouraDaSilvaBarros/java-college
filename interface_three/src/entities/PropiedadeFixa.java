package entities;

public class PropiedadeFixa {

    protected String location;
    protected boolean inCity;
    protected double estimatedValue;

    public PropiedadeFixa(String location, boolean inCity, double estimatedValue) {
        this.location = location;
        this.inCity = inCity;
        this.estimatedValue = estimatedValue;
    }

    public PropiedadeFixa(String location) {
        this(location, true, 1000000);

    }

    public String getLocation() {
        return location;
    }

}


public class CommissionedEmployee extends Employee {
    double valuePerSale;
    int quantityForSale;

    public CommissionedEmployee(String name, String registration, int quantityForSale, double valuePerSale) {
        super(name, registration);
        this.valuePerSale = valuePerSale;
        this.quantityForSale = quantityForSale;

    }

    @Override
    public double earnings() {
        return getValuePerSale() * getValuePerSale();
    }

    public double getValuePerSale() {
        return valuePerSale;
    }

    public void setValuePerSale(double valuePerSale) {
        this.valuePerSale = valuePerSale;
    }

    public int getQuantityForSale() {
        return quantityForSale;
    }

    public void setQuantityForSale(int quantityForSale) {
        this.quantityForSale = quantityForSale;
    }

}

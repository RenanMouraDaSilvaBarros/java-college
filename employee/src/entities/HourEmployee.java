public class HourEmployee extends SalariedEmployee {
    int hour;
    double hourValue;

    public HourEmployee(String name, String registration, double weeklySalary, int hour, double hourValue) {
        super(name, registration, weeklySalary);
        this.hour = hour;
        this.hourValue = hourValue;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public double getHourValue() {
        return hourValue;
    }

    public void setHourValue(double hourValue) {
        this.hourValue = hourValue;
    }

    @Override
    public double earnings() {
        return super.earnings() + (getHourValue() * getHour());
    }

    @Override
    public String toString() {
        return super.toString() + "HourEmployee [hour=" + hour + ", hourValue=" + hourValue + "]";
    }

}

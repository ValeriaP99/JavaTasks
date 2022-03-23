package md.pentalog.tasks_part1.chapter10.Ex17;

public class Building implements CarbonFootprint{
    private double averageMonthlyKwh;
    private final int months = 12;
    private int number;
    private String street;
    private int floor;
    private int apartments;

    public Building(double averageMonthlyKwh, int number, String street, int floor, int apartments) {
        this.averageMonthlyKwh = averageMonthlyKwh;
        this.number = number;
        this.street = street;
        this.floor = floor;
        this.apartments = apartments;
    }

    public double getAverageMonthlyKwh() {
        return averageMonthlyKwh;
    }

    public void setAverageMonthlyKwh(double averageMonthlyKwh) {
        this.averageMonthlyKwh = averageMonthlyKwh;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getApartments() {
        return apartments;
    }

    public void setApartments(int apartments) {
        this.apartments = apartments;
    }

    @Override
    public String toString() {
        return "Building{" +
                "number=" + number +
                ", street='" + street + '\'' +
                ", floor=" + floor +
                ", apartments=" + apartments +
                '}';
    }

    @Override
    public double getCarbonFootprint() {
        return getAverageMonthlyKwh() * months;
    }
}

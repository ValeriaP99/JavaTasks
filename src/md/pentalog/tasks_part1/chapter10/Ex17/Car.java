package md.pentalog.tasks_part1.chapter10.Ex17;

public class Car implements CarbonFootprint{
    private double averagePerYearlyMiles;
    private double averageMGP;
    private final int kgCO2PerMile = 9;
    private String model;
    private int year;
    private int capacity;
    private int weight;

    public Car(double averagePerYearlyMiles, double averageMGP, String model, int year, int capacity, int weight) {
        this.averagePerYearlyMiles = averagePerYearlyMiles;
        this.averageMGP = averageMGP;
        this.model = model;
        this.year = year;
        this.capacity = capacity;
        this.weight = weight;
    }

    public double getAveragePerYearlyMiles() {
        return averagePerYearlyMiles;
    }

    public void setAveragePerYearlyMiles(double averagePerYearlyMiles) {
        this.averagePerYearlyMiles = averagePerYearlyMiles;
    }

    public double getAverageMGP() {
        return averageMGP;
    }

    public void setAverageMGP(double averageMGP) {
        this.averageMGP = averageMGP;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", capacity=" + capacity +
                ", weight=" + weight +
                '}';
    }

    @Override
    public double getCarbonFootprint() {
        return ((getAveragePerYearlyMiles() * getAverageMGP()) * kgCO2PerMile);
    }
}

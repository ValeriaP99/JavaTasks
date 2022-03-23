package md.pentalog.tasks_part1.chapter10.Ex17;

public class Bicycle implements CarbonFootprint{
    private double yearlyMiles;
    private final int caloriesPerMiles = 34;
    private String model;
    private int typeOfTires;
    private String typeOfBicycle;

    public Bicycle(double yearlyMiles, String model, int typeOfTires, String typeOfBicycle) {
        this.yearlyMiles = yearlyMiles;
        this.model = model;
        this.typeOfTires = typeOfTires;
        this.typeOfBicycle = typeOfBicycle;
    }

    public double getYearlyMiles() {
        return yearlyMiles;
    }

    public void setYearlyMiles(double yearlyMiles) {
        this.yearlyMiles = yearlyMiles;
    }

    public int getCaloriesPerMiles() {
        return caloriesPerMiles;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTypeOfTires() {
        return typeOfTires;
    }

    public void setTypeOfTires(int typeOfTires) {
        this.typeOfTires = typeOfTires;
    }

    public String getTypeOfBicycle() {
        return typeOfBicycle;
    }

    public void setTypeOfBicycle(String typeOfBicycle) {
        this.typeOfBicycle = typeOfBicycle;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "model='" + model + '\'' +
                ", typeOfTires=" + typeOfTires +
                ", typeOfBicycle='" + typeOfBicycle + '\'' +
                '}';
    }

    @Override
    public double getCarbonFootprint() {
        return getYearlyMiles() * caloriesPerMiles;
    }
}

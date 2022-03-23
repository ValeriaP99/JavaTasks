package md.pentalog.tasks_part1.chapter10.Ex17;

import java.util.ArrayList;

public class TestPolymorphism {
    public static void main(String[] args) {
        ArrayList<CarbonFootprint> carbonFootprints = new ArrayList<>();

        carbonFootprints.add(new Building(4000.0, 101, "Street nr.1", 11, 80));
        carbonFootprints.add(new Car(5400.34, 20.5, "Model nr.1", 2019, 4, 1000));
        carbonFootprints.add(new Bicycle(200, "Model Bi", 23, "Bicycle"));

        for(CarbonFootprint carbonFootprint : carbonFootprints){
            System.out.println(carbonFootprint.toString()+"\nCarbon footprint : "+carbonFootprint.getCarbonFootprint()+"\n");
        }

    }
}

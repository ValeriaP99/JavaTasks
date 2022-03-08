package md.pentalog.tasks_part1.chapter3.Ex16;

public class HeartRatesTest {
    public static void main(String[] args) {
        HeartRates heartRates = new HeartRates("John", "Blue", 3, 9, 1990);

        System.out.println("Information about person");
        System.out.println("First name: "+heartRates.getFirstName());
        System.out.println("Last name: "+heartRates.getLastName());
        System.out.println("Month of birth: "+heartRates.getMonth());
        System.out.println("Day of birth: "+heartRates.getDay());
        System.out.println("Year of birth: "+heartRates.getYear());

        System.out.println("Age in years --> "+heartRates.calculateAge(heartRates.getMonth(), heartRates.getDay(),
                heartRates.getYear()));
        System.out.println("Your max heart rate --> "+heartRates.calculateMaximumHeartRate());
        System.out.println("Your target heart rate --> "+heartRates.calculateTargetHeartRate());
    }
}

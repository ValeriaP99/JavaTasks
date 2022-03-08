package md.pentalog.tasks_part1.chapter3.Ex17;

public class HealthProfileTest {
    public static void main(String[] args) {
        HealthProfile healthProfile1 = new HealthProfile("Anubis", "II", HealthProfile.GENDER.MALE, 1,
                24, 1970, 143.3, 66);

        HealthProfile healthProfile2 = new HealthProfile("Cleopatra", "I", HealthProfile.GENDER.FEMALE, 4,
                21, 1990, 140, 66);
        getHealthProfile(healthProfile1);
        System.out.println();
        getHealthProfile(healthProfile2);

    }

    public static void getHealthProfile(HealthProfile healthProfile){
        System.out.println("---------------[ Health profile ]---------------^");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("|%-11s|%-11s|%-10s|%-10s|%-10s|%-10s|%-12s|%-12s|%-10s|%-10s|%-10s|%-10s|%n",
                "First name", "Last name", "Gender", "Month bday", "Day bday", "Year bday", "Weight(lbs)", "Height(in)",
                "Age", "MHR", "THR", "BMI");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("|%-11s|%-11s|%-10s|%-10s|%-10s|%-10s|%-12s|%-12s|%-10s|%-10s|%-10s|%-10.2f|%n",
                healthProfile.getFirstName(), healthProfile.getLastName(), healthProfile.getGender(),
                healthProfile.getMonth(), healthProfile.getDay(), healthProfile.getYear(),
                healthProfile.getWeight(), healthProfile.getHeight(), healthProfile.calculateAge(healthProfile.getMonth(),
                        healthProfile.getDay(), healthProfile.getYear()),
                healthProfile.calculateMaximumHeartRate(), healthProfile.calculateTargetHeartRate(),
                healthProfile.getBMI(healthProfile.getWeight(), healthProfile.getHeight()));
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------\n");
        System.out.println("-------[ INFO -  ]------");
        System.out.println("MHR = Maximum Heart Rate");
        System.out.println("THR = Target Heart Rate");
        System.out.println("BMI = Body Mass Index");
        System.out.println("-----------------------------------");
        System.out.println("-------[ INFO - BMI VALUES ]------");
        System.out.println("Underweight: less than 18,5");
        System.out.println("Normal:      between 18,5 and 24,9");
        System.out.println("Overweight:  between 25 and 29,9");
        System.out.println("Obese:       30 or greater");
        System.out.println("-----------------------------------");
    }

}

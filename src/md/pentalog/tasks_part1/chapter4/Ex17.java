package md.pentalog.tasks_part1.chapter4;

//Gas Mileage

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        int gallons;
        int miles;
        int totalGallons = 0;
        int totalMiles = 0;
        int tripId = 0;
        String yesOrNo;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want add some information (for yes write -> y and for no -> n)?  --> ");
        yesOrNo = scanner.next();

        while(!yesOrNo.equals("n")){
            tripId += 1;
            System.out.printf("%n------[ id trip = %d]------%n", (tripId));
            System.out.print("Miles = ");
            miles = scanner.nextInt();
            System.out.print("Gallons = ");
            gallons = scanner.nextInt();
            System.out.printf("nmiles/gallons = %.2f%n", (double)miles/gallons);
            totalMiles += miles;
            totalGallons += gallons;

            System.out.print("%nDo you want add some information (for yes write -> y and for no -> n)?  --> ");
            yesOrNo = scanner.next();
        }

        System.out.println("%n--------------[ TOTAL ]--------------");
        System.out.printf("Total miles for %d trips --> %d", tripId, totalMiles);
        System.out.printf("%nTotal gallons for %d trips --> %d", tripId, totalGallons);
        System.out.printf("%nTotal miles/gallons for %d trips --> %.2f", tripId, (double)totalMiles/totalGallons);
        System.out.println("-----------------------------------------");
    }
}

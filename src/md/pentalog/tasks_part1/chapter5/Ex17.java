package md.pentalog.tasks_part1.chapter5;


import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        double retailPrice1 = 0.0;
        double retailPrice2 = 0.0;
        double retailPrice3 = 0.0;
        double retailPrice4 = 0.0;
        double retailPrice5 = 0.0;
        double total;
        int quantity;
        int numberOfProduct;
        String yesOrNo;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want add some information (yes -> y and no -> n)? ---> ");
        yesOrNo = scanner.next();

        System.out.println();
        System.out.println("Enter the product number and quantity ");
        System.out.println("-----[ INFO PRICES]-----");
        System.out.println("Product 1: $2.98");
        System.out.println("Product 2: $4.50");
        System.out.println("Product 3: $9.98");
        System.out.println("Product 4: $4.49");
        System.out.println("Product 5: $6.87");
        System.out.println("------------------------");
        System.out.println();
        while (yesOrNo.equals("y")){
            System.out.print("number of product: ");
            numberOfProduct = scanner.nextInt();

            System.out.print("quantity: ");
            quantity = scanner.nextInt();

            switch (numberOfProduct){
                case 1:
                    retailPrice1 += 2.90 * quantity;
                    break;
                case 2:
                    retailPrice2 += 4.50 * quantity;
                    break;
                case 3:
                    retailPrice3 += 9.98 + quantity;
                    break;
                case 4:
                    retailPrice4 += 4.49 * quantity;
                    break;
                case 5:
                    retailPrice5 += 6.87 * quantity;
                    break;
            }

            System.out.print("Continue (yes -> y and no -> n)? ---> ");
            yesOrNo = scanner.next();
            System.out.println();
        }

        total = retailPrice1 + retailPrice2 + retailPrice3 + retailPrice4 + retailPrice5;
        System.out.println();
        System.out.println("---------[ TOTAL PRICE]---------");
        System.out.printf("Product 1: %.2f%n", retailPrice1);
        System.out.printf("Product 2: %.2f%n", retailPrice2);
        System.out.printf("Product 3: %.2f%n", retailPrice3);
        System.out.printf("Product 4: %.2f%n", retailPrice4);
        System.out.printf("Product 5: %.2f%n", retailPrice5);
        System.out.println("---------------");
        System.out.printf("Total: %.2f%n", total);
        System.out.println("---------------------------------");

    }

}

package md.pentalog.tasks_part1.chapter14;

// Tokenizing Telephone Numbers

import java.util.Scanner;

public class Ex14_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phoneNumber;
        System.out.println("Enter phone number -- format (555) 555-5555");
        System.out.print("--> ");
        phoneNumber = scanner.nextLine();
        if(validatePhoneNumber(phoneNumber)==false){
            System.out.println("Invalid phone number format");
        }
        String[] code = phoneNumber.split(" ");
        String[] phone = phoneNumber.split("-");
        String fullNumber = code[0].concat(phone[0]).concat(phone[1]);

        System.out.println("Phone number -- "+fullNumber);

    }

    public static boolean validatePhoneNumber(String phone){
        return phone.matches("[(][1-9]\\d{2}[)] [1-9]\\d{2}-\\d{4}");
    }
}

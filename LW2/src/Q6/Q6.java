package Q6;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        int currentYear = 2026;
        int age = currentYear - birthYear;

        System.out.println("You were born in " + birthYear + " and will be (are) " + age + " this year.");

    }
}


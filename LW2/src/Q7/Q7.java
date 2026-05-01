package Q7;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter weight in kilograms (integer): ");
        int w = scanner.nextInt();

        System.out.println("Enter height in centimeters (integer): ");
        int h = scanner.nextInt();

        double bmi = w / Math.pow((h / 100.0),2);

        System.out.printf("Your BMI is: %.2f\n" , bmi);

        if (bmi >= 20 && bmi <= 25)
            System.out.println("Result: Normal");
        else
            System.out.println("Result: Not in the normal range");
    }
}



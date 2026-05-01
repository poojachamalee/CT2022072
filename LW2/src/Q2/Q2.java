package Q2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter centimeters: ");
        double cm = input.nextDouble();

        double totalInches = cm/2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        System.out.printf("%.2f cm is equivalent to %d feet and %.2f inches.%n", cm, feet, inches);
    }
}



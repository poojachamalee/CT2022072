package Q4;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter your body weight in pounds: ");
        double bodyWeight = scanner.nextDouble();

        double calories = bodyWeight * 19;

        System.out.printf("The number of calories you need in one day is: %.2f" , calories);
    }
}


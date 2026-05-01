package Q9;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter investment amount (P): ");
        double p = scanner.nextDouble();

        System.out.println("Enter interest rate (R): ");
        double r = scanner.nextDouble();

        System.out.println("Enter number of year (N): ");
        int n = scanner.nextInt();

        double amount = p * Math.pow((1 + (r / 100.0)), n);

        System.out.printf("After %d years, your investment will grow to: %.2f" ,n, amount);
    }
}



package Q5;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature in degrees Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (5.0/9.0) * (fahrenheit - 32);
        System.out.printf( "%.2fF is equivalent to %.2fC",fahrenheit,celsius);
    }
}


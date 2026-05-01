package Q3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the  temperature in degrees Celsius: ");
        double c = input.nextDouble();
        double fahrenheit = ((1.8 * c) + 32);
        System.out.printf("%.2fcm is equivalent to %.2fF" ,c, fahrenheit );
    }
}



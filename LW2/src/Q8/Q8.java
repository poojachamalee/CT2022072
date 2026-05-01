package Q8;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PI = 3.14;

        System.out.println("Enter the radius of the sphere: ");
        double r = scanner.nextDouble();

        double volume = (4.0 / 3.0) * PI * Math.pow(r , 3);

        System.out.printf("The volume of the sphere is: %.2f" , volume);
    }
}



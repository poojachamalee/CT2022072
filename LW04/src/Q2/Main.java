package Q2;

import Q1.Temperature;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double inputFahrenheit = scanner.nextDouble();

        Q1.Temperature temp = new Temperature();

        temp.setFahrenheit(inputFahrenheit);

        System.out.printf("%.2f Fahrenheit is equivalent to %.2f Celsius.%n",
                inputFahrenheit, temp.toCelsius());
    }
}

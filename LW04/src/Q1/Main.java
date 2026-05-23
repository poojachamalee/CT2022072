package Q1;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        //Q1

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius: ");
        double inputCelsius = scanner.nextDouble();

        Temperature temp = new Temperature(inputCelsius);
        System.out.printf("%.2f Celsius is equivalent to %.2f Fahrenheit.%n",
                temp.toCelsius(), temp.toFahrenheit());

    }
}


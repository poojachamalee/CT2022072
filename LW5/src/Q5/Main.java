package Q5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pet[] petArray = new Pet[100];
        Dog[] dogArray = new Dog[100];

        int petCount = 0;
        int dogCount = 0;

        while (petCount < petArray.length) {

            System.out.print("Enter pet name (STOP to finish): ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("STOP")) {
                break;
            }

            System.out.print("Enter type (c/d): ");
            char type = scanner.nextLine().toLowerCase().charAt(0);

            if (type == 'c') {

                Cat cat = new Cat();

                cat.setName(name);

                System.out.print("Enter coat color: ");
                cat.setCoatColor(scanner.nextLine());

                petArray[petCount++] = cat;

            }

            else if (type == 'd') {

                Dog dog = new Dog();

                dog.setName(name);

                System.out.print("Enter weight: ");
                dog.setWeight(scanner.nextDouble());
                scanner.nextLine();

                petArray[petCount++] = dog;

                dogArray[dogCount++] = dog;
            }
        }

        if (dogCount > 0) {

            double total = 0;

            double min = dogArray[0].getWeight();

            double max = dogArray[0].getWeight();

            for (int i = 0; i < dogCount; i++) {

                double weight = dogArray[i].getWeight();

                total += weight;

                if (weight < min) {
                    min = weight;
                }

                if (weight > max) {
                    max = weight;
                }
            }

            double average = total / dogCount;

            System.out.println("\n--- Dog Statistics ---");

            System.out.println("Average Weight: " + average);

            System.out.println("Minimum Weight: " + min);

            System.out.println("Maximum Weight: " + max);

        } else {

            System.out.println("No dogs entered.");
        }

        scanner.close();
    }
}

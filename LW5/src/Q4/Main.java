package Q4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pet[] petArray = new Pet[100];
        int petCount = 0;

        while (petCount < petArray.length) {

            System.out.print("Enter pet name (STOP to finish): ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("STOP")) {
                break;
            }

            System.out.print("Enter pet type (c/d): ");
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
            }

            else {
                System.out.println("Invalid type!");
            }
        }

        System.out.println("\n--- Cats ---");

        for (int i = 0; i < petCount; i++) {

            if (petArray[i] instanceof Cat) {

                Cat cat = (Cat) petArray[i];

                System.out.println(
                        "Name: " + cat.getName()
                                + " | Type: Cat"
                                + " | Coat Color: " + cat.getCoatColor()
                );
            }
        }

        System.out.println("\n--- Dogs ---");

        for (int i = 0; i < petCount; i++) {

            if (petArray[i] instanceof Dog) {

                Dog dog = (Dog) petArray[i];

                System.out.println(
                        "Name: " + dog.getName()
                                + " | Type: Dog"
                                + " | Weight: " + dog.getWeight()
                );
            }
        }

        scanner.close();
    }
}
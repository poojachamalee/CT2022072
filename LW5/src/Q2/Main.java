package Q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pet[] petArray = new Pet[100];
        int petCount = 0;

        while ((petCount < petArray.length)) {
            System.out.println("Enter pet name (or 'STOP' to finish): ");
            String name = scanner.nextLine();

            if (name.equalsIgnoreCase("STOP")) {
                break;
            }

            System.out.println("Enter pet type ('c' for cat, 'd' for dog): ");
            char type = scanner.nextLine().toLowerCase().charAt(0);

            if (type == 'd') {
                Dog dog = new Dog();
                dog.setName(name);
                petArray[petCount++] = dog;

            } else if (type == 'c') {
                Cat cat = new Cat();
                cat.setName(name);
                petArray[petCount++] = cat;

            } else {
                System.out.println("Invalid pettype! Please enter 'c' or 'd'.");
            }

        }
        System.out.println("\n---List of Registered Pets ---");

        for (int i = 0; i < petCount; i++) {
            System.out.println(
                    "Name: " + petArray[i].getName()
                            + " | Type: "
                            + petArray[i].speak()
            );
        }
    }
}




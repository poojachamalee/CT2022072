package Q6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pet[] petArray = new Pet[100];
        Cat[] catArray = new Cat[100];
        Dog[] dogArray = new Dog[100];

        int petCount = 0;
        int catCount = 0;
        int dogCount = 0;

        int choice;

        do {

            System.out.println("\n1.Add Cat");
            System.out.println("2.Add Dog");
            System.out.println("3.Remove Cat");
            System.out.println("4.Remove Dog");
            System.out.println("0.Quit");

            System.out.print("Choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:

                    Cat cat = new Cat();

                    System.out.print("Name: ");
                    cat.setName(scanner.nextLine());

                    System.out.print("Coat Color: ");
                    cat.setCoatColor(scanner.nextLine());

                    petArray[petCount++] = cat;
                    catArray[catCount++] = cat;

                    break;

                case 2:

                    Dog dog = new Dog();

                    System.out.print("Name: ");
                    dog.setName(scanner.nextLine());

                    System.out.print("Weight: ");
                    dog.setWeight(scanner.nextDouble());

                    scanner.nextLine();

                    petArray[petCount++] = dog;
                    dogArray[dogCount++] = dog;

                    break;

                case 3:

                    System.out.print("Enter cat name: ");
                    String removeCat = scanner.nextLine();

                    for (int i = 0; i < catCount; i++) {

                        if (catArray[i].getName().equalsIgnoreCase(removeCat)) {

                            for (int j = i; j < catCount - 1; j++) {

                                catArray[j] = catArray[j + 1];
                            }

                            catCount--;

                            System.out.println("Cat removed");

                            break;
                        }
                    }

                    break;

                case 4:

                    System.out.print("Enter dog name: ");
                    String removeDog = scanner.nextLine();

                    for (int i = 0; i < dogCount; i++) {

                        if (dogArray[i].getName().equalsIgnoreCase(removeDog)) {

                            for (int j = i; j < dogCount - 1; j++) {

                                dogArray[j] = dogArray[j + 1];
                            }

                            dogCount--;

                            System.out.println("Dog removed");

                            break;
                        }
                    }

                    break;

                case 0:

                    System.out.println("Program ended");

                    break;

                default:

                    System.out.println("Invalid choice");
            }

        } while (choice != 0);

        System.out.println("\nCats:");

        for (int i = 0; i < catCount; i++) {

            System.out.println(
                    catArray[i].getName()
                            + " "
                            + catArray[i].getCoatColor()
            );
        }

        System.out.println("\nDogs:");

        for (int i = 0; i < dogCount; i++) {

            System.out.println(
                    dogArray[i].getName()
                            + " "
                            + dogArray[i].getWeight()
            );
        }

        scanner.close();
    }
}
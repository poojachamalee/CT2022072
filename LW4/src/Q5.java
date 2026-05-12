import java.util.Scanner;

public  class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double bill = 0;

        System.out.println("===== MyJava Lo-Fat Burgers =====");

        System.out.println("Entree");
        System.out.println("1. Tofu Burger      $3.49");
        System.out.println("2. Cajun Chicken    $4.59");
        System.out.println("3. Buffalo Wings    $3.99");
        System.out.println("4. Rainbow Fillet   $2.99");

        System.out.println("Side Dish");
        System.out.println("1. Rice Cracker     $0.79");
        System.out.println("2. No-Salt Fries    $0.69");
        System.out.println("3. Zucchini         $1.09");
        System.out.println("4. Brown Rice       $0.59");

        System.out.println("Drink");
        System.out.println("1. Cafe Mocha       $1.99");
        System.out.println("2. Cafe Latte       $1.90");
        System.out.println("3. Espresso         $2.49");
        System.out.println("4. Oolong Tea       $0.99");

        System.out.println("Select Entree (1-4): ");
        int entree = scanner.nextInt();

        switch (entree){
            case 1:
                bill += 3.49;
                break;
            case 2:
                bill += 4.59;
                break;
            case 3:
                bill += 3.99;
                break;
            case 4:
                bill += 2.99;
                break;
            default:
                System.out.println("Invalid Entree selection");

        }
        System.out.println("Select Side Dish (1-4): ");
        int sideDish = scanner.nextInt();
        switch (sideDish){
            case 1:
                bill += 0.79;
                break;
            case 2:
                bill += 0.69;
                break;
            case 3:
                bill += 1.09;
                break;
            case 4:
                bill += 0.59;
                break;
            default:
                System.out.println("Invalid Entree selection");

        }
        System.out.print("Select Drink (1-4): ");
        int drink = scanner.nextInt();

        switch (drink) {
            case 1:
                bill += 1.99;
                break;
            case 2:
                bill += 1.90;
                break;
            case 3:
                bill += 2.49;
                break;
            case 4:
                bill += 0.99;
                break;
            default:
                System.out.println("Invalid Drink selection");
        }
        System.out.println("Final Bill = $" + bill);
    }

}
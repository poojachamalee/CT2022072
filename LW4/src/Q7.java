import java.util.Scanner;

public class Q7 {
    public static int countDigits(int number){
        int count = 0;

        while (number !=0){
            number = number/10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int number;

         do {
             System.out.println("Enter an integer: ");
             number = scanner.nextInt();

             if (number >= 0) {
                 System.out.println("Number of digits: " + countDigits(number));
             }
         }while (number >= 0);
         System.out.println("Program stopped. ");
         }
    }


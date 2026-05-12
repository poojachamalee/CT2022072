import java.util.Random;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;
        int guess;

        do{
            System.out.println("Guess a number between 1 and 100: ");
            guess = scanner.nextInt();

            if (guess < randomNumber){
                System.out.println("This number is lower, Try Again");
            }else if (guess > randomNumber){
                System.out.println("This number is higher,Try Again");
            }else {
                System.out.println("Correct! You guessed the number. ");

            }
        }while (guess != randomNumber);

    }
}

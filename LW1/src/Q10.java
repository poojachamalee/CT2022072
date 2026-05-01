//10
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an odd-length word: ");
        String word = scanner.nextLine();

        int length = word.length();

        int middleIndex = length / 2;

        String middleChar = word.substring(middleIndex,middleIndex + 1);

        System.out.println(middleChar);
    }
}



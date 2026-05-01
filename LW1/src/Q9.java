//Q9
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sentence: ");
        String input = scanner.nextLine();

        int length = input.length();

        String first = input.substring(0,1);
        String last = input.substring(length - 1);

        System.out.println(length);
        System.out.println(first);
        System.out.println(last);
    }
}



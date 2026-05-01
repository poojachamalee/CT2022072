//Q8
import java.util.Scanner;

public class Q8 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string with an exclamation mark(!): ");
        String input = scanner.nextLine();

        int index = input.indexOf("!");

        String before = input.substring(0, index);
        String after = input.substring(index + 1);

        System.out.println(before.trim());
        System.out.println(after.trim());
    }
}


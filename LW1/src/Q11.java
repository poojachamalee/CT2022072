//Q11
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter full name(first middle last): ");
        String fullName = scanner.nextLine();

        int firstSpace = fullName.indexOf(" ");
        int secondSpace = fullName.indexOf(" ",firstSpace + 1);

        String first = fullName.substring(0,firstSpace);
        String middleInitial = fullName.substring(firstSpace + 1,firstSpace + 2);
        String last = fullName.substring(secondSpace+1);

        System.out.println(last +"," + " " + first + " " + middleInitial + ".");
    }
}



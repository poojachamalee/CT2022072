import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word or phrase: ");
        String text = scanner.nextLine();

        text = text.replace(" ","").toLowerCase();
        String reverse = "";

        for (int i = text.length() - 1; i >= 0; i--){
            reverse = reverse + text.charAt(i);
        }

    if (text.equals(reverse)){
            System.out.println("Palindrome");
    }else {
        System.out.println("Not a Palindrome");
    }
    }
}

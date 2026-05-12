import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the word to be replaced: ");
        String oldWord = scanner.nextLine();

        System.out.print("Enter replacement word: ");
        String newWord = scanner.nextLine();

        String[] words = sentence.split(" ");
        String result = "";

        for (int i=0; i < words.length; i++){
            if (words[i].equals(oldWord)){
                result = result + newWord + " ";
            }else {
                result = result + words[i] + " ";
            }
        }
        System.out.println("Updated sentence: " + result);
    }
}

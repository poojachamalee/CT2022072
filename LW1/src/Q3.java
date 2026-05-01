//Q3
import javax.swing.*;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
        System.out.println("First Name:");
        String fName = scanner.next();

        System.out.println("Middle Name:");
        String MName = scanner.next();

        System.out.println("Last Name:");
        String LName = scanner.next();

        System.out.println(fName+" "+ MName.substring(0,1) +"." +LName);

    }
}


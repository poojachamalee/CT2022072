//Q2
import javax.swing.*;
import java.util.Scanner;

public class Q2 {
public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    System.out.println("First Name:");
    String fName=scanner.next();

    System.out.println("Last Name:");
    String LName=scanner.next();

    JFrame myWindow = new JFrame();
    myWindow.setSize(800,600);
    myWindow.setTitle(fName +" "+ LName);
    myWindow.setVisible(true);

}
}



//String fullName = fName+" "+LName;
//myWindow.setTitle(fullName);
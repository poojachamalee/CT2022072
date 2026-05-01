//Q6
import java.util.Scanner;
import javax.swing.*;

public class Q6 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Frame Width: ");
        int w = scanner.nextInt();

        System.out.print("Enter Frame Height: ");
        int h = scanner.nextInt();

        System.out.print("Enter Frame Title: ");
        String title = scanner.nextLine();

        JFrame jFrame = new JFrame();
        jFrame.setSize(w, h);
        jFrame.setTitle(title);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

    }
}


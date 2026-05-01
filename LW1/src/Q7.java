//Q7
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q7 {

    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss:a");
        String timeNow = simpleDateFormat.format(today);

        JFrame myWindow = new JFrame();
        myWindow.setSize(300, 600);
        myWindow.setTitle(timeNow);
        myWindow.setVisible(true);
    }
}


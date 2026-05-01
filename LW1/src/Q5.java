//Q5
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q5 {
    public static void main(String[]  args){
        Date today = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE,MMMM dd,yyyy");
        System.out.println(simpleDateFormat.format(today));
    }
}


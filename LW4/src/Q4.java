import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("This ia a leap year.");
                }else {
                    System.out.println("This is not a leap year.");
                }
            }else {
                System.out.println("This is a leap year.");
            }
        }else{
            System.out.println("This is not a leap year.");
        }
    }
}

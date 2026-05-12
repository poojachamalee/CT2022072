import java.util.Scanner;

public class Q1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the first number: ");
        a = input.nextInt();
        System.out.println("Enter the second number: ");
        b = input.nextInt();
        System.out.println("Enter the third number: ");
        c = input.nextInt();

        int smallest = a;
        if(b<smallest){
            smallest = b;
        }
        if (c<smallest){
            smallest = c;
        }
        System.out.println("Smallest: "+smallest);

    }
}
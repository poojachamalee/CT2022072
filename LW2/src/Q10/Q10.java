package Q10;
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int MONTHS_IN_YEAR = 12;

        System.out.println("Enter loan amount: ");
        double loanAmount = scanner.nextDouble();
        System.out.println("Enter annual interest rate (e.g. 7.5): ");
        double annualInterestRate = scanner.nextDouble();
        System.out.println("Enter loan period (number of years): ");
        int loanPeriod = scanner.nextInt();

        double monthlyInterestRate = annualInterestRate / 100.0 / MONTHS_IN_YEAR;

        int numberOfPayment = loanPeriod * MONTHS_IN_YEAR;

        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1- Math.pow(1 / (1 + monthlyInterestRate), numberOfPayment));

        double totalPayment = monthlyPayment * numberOfPayment;

        System.out.println("--------------------------");
        System.out.printf("Monthly Payment: %.2f\n" , monthlyPayment);
        System.out.printf("Total Payment: %.2f\n" , totalPayment);
        System.out.println("--------------------------");
    }
}



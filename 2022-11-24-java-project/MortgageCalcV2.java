import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalcV2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int principal = 0;
        while (principal < 1000 || principal > 1000000) {
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt();
            if (principal < 1000 || principal > 1000000)
                System.out.println("Enter a number between 1,000 and 1,000,000.");
        }

        double interestRate = 0;
        while (interestRate <= 0 || interestRate > 30) {
            System.out.print("Annual Interest Rate: ");
            interestRate = scanner.nextDouble();
            if (interestRate <= 0 || interestRate > 30)
                System.out.println("Enter a value greater than 0 and less than or equal to 30.");
        }

        int period = 0;
        while (period <= 0 || period > 30) {
            System.out.print("Period (Years): ");
            period = scanner.nextInt();
            if (period < 0 || period > 30)
                System.out.println("Enter a value between 1 and 30.");
        }

        double det = (Math.pow(1 + interestRate/1200, period*12));
        double mortgagePayment = principal
            * ((interestRate/1200) * det)
            / (det - 1);
        String mortgage = NumberFormat.getCurrencyInstance().format(mortgagePayment);
        System.out.println("Mortgage: " + mortgage);
    }
}

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int p = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        float i = scanner.nextFloat();
        System.out.print("Period (Years): ");
        int n = scanner.nextInt();
        double det = Math.pow(1 + (i/1200), n*12);
        double payment = p*((i/1200*det)/(det-1));
        String mortgage = NumberFormat.getCurrencyInstance().format(payment);

        System.out.println("Mortgage: " + mortgage);
    }
}

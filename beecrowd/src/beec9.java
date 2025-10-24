import java.util.Locale;
import java.util.Scanner;
public class beec9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double salary = sc.nextDouble();
        double sales = sc.nextDouble();
        double total = salary + 0.15 * sales;
        System.out.printf("TOTAL = %.2f%n", total);
    }
}

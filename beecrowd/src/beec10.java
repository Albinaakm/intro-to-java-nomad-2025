import java.util.Locale;
import java.util.Scanner;
public class beec10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int c1 = sc.nextInt(), q1 = sc.nextInt(); double p1 = sc.nextDouble();
        int c2 = sc.nextInt(), q2 = sc.nextInt(); double p2 = sc.nextDouble();
        double total = q1*p1 + q2*p2;
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
    }
}

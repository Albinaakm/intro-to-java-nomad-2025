import java.util.Locale;
import java.util.Scanner;

public class beec3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double pi = 3.14159;
        double a = pi * r * r;
        System.out.printf("a = %.4f%n", a);
    }
}

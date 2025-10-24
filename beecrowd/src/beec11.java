import java.util.Locale;
import java.util.Scanner;
public class beec11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double R = sc.nextDouble();
        double PI = 3.14159;
        double volume = (4.0/3.0) * PI * R * R * R;
        System.out.printf("VOLUME = %.3f%n", volume);
    }
}

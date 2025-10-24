import java.util.Locale;
import java.util.Scanner;
public class beec12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble(), B = sc.nextDouble(), C = sc.nextDouble();
        double pi = 3.14159;
        double tri = A * C / 2.0;
        double circ = pi * C * C;
        double trap = (A + B) * C / 2.0;
        double sq = B * B;
        double rect = A * B;
        System.out.printf("TRIANGULO: %.3f%n", tri);
        System.out.printf("CIRCULO: %.3f%n", circ);
        System.out.printf("TRAPEZIO: %.3f%n", trap);
        System.out.printf("QUADRADO: %.3f%n", sq);
        System.out.printf("RETANGULO: %.3f%n", rect);
    }
}

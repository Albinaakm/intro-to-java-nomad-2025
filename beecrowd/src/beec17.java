import java.io.IOException;
import java.util.Scanner;

public class beec17 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        double h = scanner.nextInt();
        double vm = scanner.nextInt();

        System.out.printf("%.3f%n", (h * vm) / 12);
    }
}
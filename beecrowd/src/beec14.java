import java.io.IOException;
import java.util.Scanner;

public class beec14 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int x = Integer.valueOf(scanner.nextLine());
        double y = Double.valueOf(scanner.nextLine());

        System.out.println(String.format("%.3f km/l", x / y));
    }
}

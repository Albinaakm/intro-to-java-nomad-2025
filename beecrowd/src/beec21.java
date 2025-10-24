import java.util.Scanner;

public class beec21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double value = sc.nextDouble();

        int notes[] = {100, 50, 20, 10, 5, 2};
        double coins[] = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};

        System.out.println("notas:");

        for (int note : notes) {
            int count = (int) (value / note);
            System.out.printf("%d nota(s) de R$ %.2f%n", count, (double) note);
            value -= count * note;
        }

        System.out.println("moedas:");
        value = Math.round(value * 100.0) / 100.0; // округляем до копеек
        for (double coin : coins) {
            int count = (int) (value / coin);
            System.out.printf("%d moeda(s) de R$ %.2f%n", count, coin);
            value -= count * coin;
            value = Math.round(value * 100.0) / 100.0;
        }
    }
}

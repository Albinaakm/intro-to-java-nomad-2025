 import java.util.Scanner;

public class beec18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        System.out.println(N);

        int[] notas = {100, 50, 20, 10, 5, 2, 1};

        for (int nota : notas) {
            int quantidade = N / nota;
            System.out.println(quantidade + " nota(s) de R$ " + nota + ",00");
            N = N % nota;
        }

        sc.close();
    }
}


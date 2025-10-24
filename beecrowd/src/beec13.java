import java.util.Scanner;
public class beec13 {
    public static int maior(int a, int b){
        return (a + b + Math.abs(a - b)) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
        int m = maior(maior(A,B), C);
        System.out.printf("%d eh o maior%n", m);
    }
}

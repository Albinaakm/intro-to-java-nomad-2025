import java.util.Scanner;

public class beec40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N1 = sc.nextDouble();
        double N2 = sc.nextDouble();
        double N3 = sc.nextDouble();
        double N4 = sc.nextDouble();

        double media = (N1*2 + N2*3 + N3*4 + N4*1) / 10;
        System.out.printf("Media: %.1f%n", media);

        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            double exame = sc.nextDouble();
            System.out.printf("Nota do exame: %.1f%n", exame);
            double novaMedia = (media + exame) / 2;
            if (novaMedia >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f%n", novaMedia);
        }
    }
}

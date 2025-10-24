import java.util.Scanner;
import java.util.Arrays;

public class beec42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        int[] original = nums.clone();

        Arrays.sort(nums);

        for (int n : nums) System.out.println(n);
        System.out.println();
        for (int n : original) System.out.println(n);

    }
}

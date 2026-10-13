import java.util.Scanner;

public class TaskL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();

        int rounds;
        if (n <= k) {
            rounds = 2;
        } else {
            rounds = (2 * n + k - 1) / k;
        }

        System.out.println(rounds * m);
    }
}
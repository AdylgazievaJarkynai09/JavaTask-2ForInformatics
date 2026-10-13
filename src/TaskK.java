import java.util.Scanner;

public class TaskK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        boolean ok = false;
        for (int y = 0; 5 * y <= k; y++) {
            if ((k - 5 * y) % 3 == 0) {
                ok = true;
            }
        }

        if (ok) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number % 400 == 0) {
            System.out.println("YES");
        }

        else if (number % 100 == 0) {
            System.out.println("NO");
        }

        else if (number % 4 == 0) {
            System.out.println("YES");
        }

        else {
            System.out.println("NO");
        }
    }
}
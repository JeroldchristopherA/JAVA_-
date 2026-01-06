import java.util.Scanner;

public class StrongNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = s.nextInt();
        int temp = a;
        int sum = 0;

        while (a > 0) {
            int num = a % 10;
            int fact = 1;
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
            sum += fact;
            a = a / 10;
        }

        if (sum == temp) {
            System.out.println(temp + " is a Strong Number.");
        } else {
            System.out.println(temp + " is not a Strong Number.");
        }
    }
}

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int digits = 0;

        // Count the number of digits
        int temp = number;
        while (temp != 0) {
            temp /= 10;
            digits++;
        }

        int sum = 0;
        temp = number;

        // Calculate the sum of digits raised to the power of 'digits'
        while (temp != 0) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 0; i < digits; i++) {
                power *= digit;
            }
            sum += power;
            temp /= 10;
        }

        // Check if the number is an Armstrong number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}

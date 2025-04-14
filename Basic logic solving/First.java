import java.util.*;

class First {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = s.nextInt();

        int result = firstAndLast(a);
        System.out.println("Sum of first and last digit is: " + result);
    }

    // Static method to get the sum of first and last digit
    public static int firstAndLast(int a) {
        int lastDigit = a % 10;

        while (a >= 10) {
            a = a / 10;
        }
        int firstDigit = a;

        return firstDigit + lastDigit;
    }
}

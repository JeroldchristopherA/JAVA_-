import java.util.Scanner;

public class ScannerTest{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number");

        int number = reader.nextInt();
        System.out.println("You Entered :"+number);
    }
}
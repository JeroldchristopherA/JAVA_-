import java.util.*;

class Palindrome{
    public static void main(String[] args){
        Scanner s =  new Scanner(System.in);
        int sum = 0;
        int a =s.nextInt();
        int temp =a;
        int rev =0;

        for(int i =a;i>0;i /= 10){
            sum = i%10;
            rev =rev*10+sum;
            
        }
        if(temp==a){
            System.out.println("The number is palindrome");
        }else{
            System.out.println("The number is  not palindrome");
        }
    }
}
import java.util.*;
class Factors{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numer");
        int a = sc.nextInt();
        int sum =0;
        for(int i=1;i<a;i++){
            if(a%i==0){
                System.out.println("Factors of the number are"+i);
                //find the sum of factors
                if(i!=0){
                    System.out.println("The sumof factor is :"+(sum +=i));
                }
            }
        }
        
    }
}
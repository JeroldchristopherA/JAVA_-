import java.util.*;
class PerfectNum{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the numer");
        int a = sc.nextInt();
        int sum =0;

        for(int i=1;i<a;i++){
            if(a%i==0){
                System.out.println("the number is factor:"+i);
                if(i!=0){
                    System.out.println((sum +=i));
                    if(a==sum){
                        System.out.println("Perfect numer");
                    }else{
                        System.out.println("Not perfect numer");
                    }
                }else{
                    System.out.println("Not an perfect");
                }
            }
        }
    }

}
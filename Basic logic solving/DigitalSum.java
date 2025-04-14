import java.util.*;

class DigitalSum{
    public static void main(String[] args){
        int a =333;
        int res = sumNum(a);
        System.out.println("The result is :"+res);

    }

    public static int sumNum(int a){
        int s =0;

        while(a>0){
            s += a%10;
            a /= 10;
        }
        return s;
        
    }
}
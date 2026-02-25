import java.util.Scanner;

class LeapYearOrNot {
  
  public static void main(String [] args){

    Scanner sc = new Scanner(System.in);
    long year = sc.nextLong();
    if(year % 400 ==0 ||(year%4 == 0 && year % 100 != 0)){
      System.out.println("Its leap year");
    }else{
      System.out.println("Its not an leap year");
    }
      
    }

}


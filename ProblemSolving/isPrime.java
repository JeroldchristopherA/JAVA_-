import java.util.Scanner;

class isPrime {
  
  public static void main(String [] args){

    int n = 11;
    for(int i=2;i<n;i++){
      boolean isPrime =true;
      for(int j =2; j<i;j++){
        if(i%j==0){
          isPrime = false;
          break;
        }
      }
      if(isPrime){
        System.out.println(i);
      }
    }
      
    }

}
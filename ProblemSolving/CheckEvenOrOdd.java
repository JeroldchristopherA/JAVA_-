import java.util.Scanner;

class CheckEvenOrOdd{
	public static void main(String []) args){
	Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	if(n % 2 == 0){
		System.out.println(n+"It is even number");
	}else{
			System.out.println(n+"It is odd number");
	
	}
	}
}
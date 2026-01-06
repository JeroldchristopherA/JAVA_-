package Food_app_core;

import java.util.Scanner;

public class Swiggy {

    public static void main(String [] args){
        String usrEmail;
        String usrPass;
        System.out.println("\t\t\t\t*********  Welcome the Swiggy ********** ");
        System.out.println("1. Sign In \n 2. Login");
        Scanner sc =  new Scanner(System.in);
        int val = sc.nextInt();
        login_mssg = signInRLogin(val);
        flag = false;

        System.out.println("You can order the foods");
        System.out.println("Please do select VEG / NON VEG");
        String foodType = sc.nextLine();
        String orderedFoods = foodList(foodType);
    }

    public  static String foodList(String foodType){
        if (foodType == "VEG"){
            System.out.println("Below items are available \n1.IDLY\n2.DOSA\n3.POORI\n4.PONGAL");
            int itemNum = sc.nextInt();

        }else{

        }
    }

    public static String signInRLogin(int val){
        switch (val){
            case 1 :
                System.out.println("Enter the email");
                String usrEmail = sc.nextLine();
                System.out.println("Enter the password");
                String usrPass = sc.nextLine();
                System.out.println("Loading **************************");
                long otp_num = generateOtp();
                System.out.println(otp_num);
                System.out.println("Enter the OTP");
                long num1 = sc.nextlong();
                if(otp_num == num1){
                    System.out.println("Signd up successful");
                }else {
                    System.out.println("Sign up failed");
                }
                System.out.println("Verification on process");
                break;
            case 2 :
                System.out.println("Enter the email");
                String usrEmail = sc.nextLine();
                System.out.println("Enter the password");
                String usrPass = sc.nextLine();
                System.out.println("Loading **************************");
                System.out.println("login Successful");
                System.out.println("login Failed");
                break;
        }
        return flag;
    }

    public static long generateOtp(){
        double random = Math.random() *10000;
        long otp = (long)random;
        return otp;
    }
}

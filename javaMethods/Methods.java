package javaMethods;

import java.io.*;

class Test{
    public static int i=0;
    //Constructor to count the obj
    Test(){
        i++;
    }
    // Static method to get the 
    // number of objects created  
    public static int get(){
        return i;
    }

    public int m1(){
        System.out.println("Inside the method m1");
        this.m2();  // Calling m2 method
        return 1; 
    }

    public void m2(){
        System.out.println("In method m2");
    }
}

public class Methods
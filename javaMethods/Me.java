import java.io.*;
public class Test{
    static void jD(String a,int...b){

        System.out.println(a+"and"+b);

    }
}

public class Me{
    public static void main(String [] args){
        Test t = new Test();
        t.jD("Jerry", 1,2,5,6,6,7);
    }
}
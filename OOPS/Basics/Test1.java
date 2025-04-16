//Accesssing static and non static member inside static context
public class Test1 {
    static int a = 5;
    static{
        System.out.println(a);
    }
    public static void main(String [] args){
        System.out.println(a);
        demo();
        System.out.println(Test1.a);
        Test1.demo();

    }
    public static void demo(){
        System.out.println("Hi i'm static method");
    }
}

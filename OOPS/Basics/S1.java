//Acessing non static member inside the static context
public class S1 {
    int a =34;
    static int b=33;
    public static void main(String [] args){
        S1 s =  new S1();
        System.out.println(s.a);
        s.demo();
        System.out.println(s.b);
    }
    public void demo(){
        System.out.println("Hi i'm non static");
    }
}

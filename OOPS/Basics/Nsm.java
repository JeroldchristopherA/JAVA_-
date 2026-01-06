public class Nsm {
    static int a =5;
    static Nsm ref;
    Nsm(){

    }
    {

    }
    {
        //NSC
        System.out.println(a);
        System.out.println(Nsm.a);
       System.out.println(ref.a);

    }
    public static void main(String [] args){
        ref = new Nsm();
    }
}

class Mobile{
    Mobile(){
        System.out.println("Hi i'm no argumnet constructor");
    }

    Mobile(int a){
        System.out.println("Hi i'm argumnet constructor");   
     }
     public static void main(String []args){
        Mobile mb = new Mobile();
        Mobile mb1 = new Mobile(4);

     }
}
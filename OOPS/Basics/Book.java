public class Book {
    //States
    String name ="Java";
    String price ="323";
    String colour ="Red";

    Book(){
        //Constructor
    }

    //Behaviour
    public void detailsOfBook(){
        //NSM
        System.out.println("The book name is :"+name);
        System.out.println("The book price is :"+price);
        System.out.println("The  book colour is :"+colour);
    }
}

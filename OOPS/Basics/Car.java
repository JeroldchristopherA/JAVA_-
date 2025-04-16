public class Car {

    String name;
    String colour;
    String brand;

    Car(){

    }

    Car(String name){
        this.name =name;
    }

    Car(String name, String brand){
        this.name = name;
        this.brand = brand;
    }

    public void carDetails(){
        System.out.println("The car name is;" +name);
        System.out.println("The car clolour is:"+ colour);
        System.out.println("Brand is:"+brand);

    }
}

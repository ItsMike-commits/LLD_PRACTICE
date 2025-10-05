package design_principles.singleton;

public class Client{

    public static void main(String args[]){
        
        SingletonClass obj1 = new SingletonClass();
        SingletonClass obj2 = new SingletonClass();

        // Printing the address of objects to show that 2 different objects have been created.
        System.out.println("Address of obj1 is " + obj1);
        System.out.println("Address of obj2 is " + obj2);
    }
    

}
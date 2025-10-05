package design_principles.singleton;

public class Client{

    public static void main(String args[]){
     
/*    
        SingletonClass obj1 = new SingletonClass();
        SingletonClass obj2 = new SingletonClass();

        // Printing the address of objects to show that 2 different objects have been created.
        System.out.println("Address of obj1 is " + obj1);
        System.out.println("Address of obj2 is " + obj2);

        Output :
        Address of obj1 is design_principles.singleton.SingletonClass@77e9807f
        Address of obj2 is design_principles.singleton.SingletonClass@448ff1a8

        Problem:
        Since constructor is public, various objects can be created by client which we don't want.
        Solution:
        We have to make constructor private, so it can't be called directly.

*/

/* 
       // Since constructor has been made private, so you can't call constructor directly.
        SingletonClass obj1 = SingletonClass.getInstance();
        SingletonClass obj2 = SingletonClass.getInstance();

         // Printing the address of objects to show that 2 different objects have been created.
        System.out.println("Address of obj1 is " + obj1);
        System.out.println("Address of obj2 is " + obj2);

        Address of obj1 is design_principles.singleton.SingletonClass@491666ad
        Address of obj2 is design_principles.singleton.SingletonClass@176d53b2

        PROBLEM:
        Still we can call getInstance multiple times and create multiple objects.

        Solution:
        Do a null check everytime before returning the instance of class.
*/

/* 
        // Calling getInstance method again after implementing null check.
        SingletonClass obj1 = SingletonClass.getInstance();
        SingletonClass obj2 = SingletonClass.getInstance();
        
        // Printing the address of objects to show that 2 different objects have been created.
        System.out.println("Address of obj1 is " + obj1);
        System.out.println("Address of obj2 is " + obj2);
        
        OUTPUT:
        Address of obj1 is design_principles.singleton.SingletonClass@525f1e4e.
        Address of obj2 is design_principles.singleton.SingletonClass@525f1e4e.

        //Here, address of both objects are same, that means now it is following singleton priciple
        //i.e only one object will be there in the whole application

        NEXT PROBLEM:
        This works well in single-threaded env but in multithreaded env, it will fail.
        We have to make it multi-thread safe.
*/
/* 
        // Showcasing multi-thread issue

        Runnable task = () -> {
            SingletonClass instance = SingletonClass.getInstance();
            System.out.println("Address of instance from " + Thread.currentThread().getName() + ": " + instance);

        };
        
        for(int i = 0; i<5 ; i++){
           Thread t= new Thread(task, "Thread-" + i);
           t.start();
        }

        OUTPUT:
        Address of instance from Thread-2: design_principles.singleton.SingletonClass@2dd2da49
        Address of instance from Thread-0: design_principles.singleton.SingletonClass@61fa270
        Address of instance from Thread-4: design_principles.singleton.SingletonClass@3fa6c948
        Address of instance from Thread-3: design_principles.singleton.SingletonClass@5ed162ef
        Address of instance from Thread-1: design_principles.singleton.SingletonClass@d09962e.

        OBSERVE:
        Different instances have different addresses, which shows multi-threaded issue.

        SOLUTION:
        We can solve this problem by Synchronizing getInstance method or  EAGER LOADING or DOUBLE-CHECK LOCKING .
        DOUBLE-CHECK LOCKING is the most optimal solution for this problem.
*/

    
        Runnable task = () -> {
            SingletonClass instance = SingletonClass.getInstance();
            System.out.println("Address of instance from " + Thread.currentThread().getName() + ": " + instance);

        };
        
        for(int i = 0; i<5 ; i++){
           Thread t= new Thread(task, "Thread-" + i);
           t.start();
        }
        
    

    }
    

}
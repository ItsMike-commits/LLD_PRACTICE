package design_principles.singleton;

public class SingletonClass {
    
    private static volatile SingletonClass obj = null;
    //declaring constructor
    private SingletonClass()
    {
       // System.out.println("Constructor is being called");
    }
    public static SingletonClass getInstance()
    {
        if(obj == null)
        {
            try {
                Thread.sleep(100);
            } catch (Exception e) {

            }
            synchronized (SingletonClass.class) {
                if(obj == null)
                {
                  obj = new SingletonClass();
                }
            }
        }
        return obj;
    }

}

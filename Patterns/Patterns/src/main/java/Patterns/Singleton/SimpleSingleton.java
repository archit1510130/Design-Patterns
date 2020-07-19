package Patterns.Singleton;



// This Singleton method is not thread safe although i.e two threds may come and create two instance of our singleton class

public class SimpleSingleton {

  
    private static  SimpleSingleton onlyInstance=null; 
    private SimpleSingleton()
    {

    }

    public static SimpleSingleton getInstance()
    {
        if(onlyInstance==null)
        {
            
            onlyInstance=new SimpleSingleton();
        }
        return onlyInstance;

    }

    public void printMessage()
    {
        System.out.println("Hello Client");

    }

    
    
}
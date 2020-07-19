package Patterns.Singleton;

public class ThreadSafeSingleton {


    private static volatile  ThreadSafeSingleton onlyInstance=null;

    private ThreadSafeSingleton()
    {

    }

    public static ThreadSafeSingleton getInstance()
    {

        if(onlyInstance==null)
        {
            synchronized(ThreadSafeSingleton.class)
            {
                if(onlyInstance==null)
                {
                    onlyInstance=new ThreadSafeSingleton();
                }
            }
        }
        return onlyInstance;
    }
    
}
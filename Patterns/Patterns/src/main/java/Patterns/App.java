package Patterns;

import Patterns.Decorator.Product.ProductInterFace;
import Patterns.Decorator.Product.ProductImpl.Icecream;
import Patterns.Decorator.decorators.decoratorComponents.Choclate;
import Patterns.Singleton.SimpleSingleton;
import Patterns.Singleton.ThreadSafeSingleton;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // !-----------Test for Decorator!-------------------------

        // ProductInterFace product=new Icecream();
        // System.out.println(product.cost());
        // System.out.println(product.get_desc());


        // product=new Choclate(product);
        // System.out.println(product.cost());
        // System.out.println(product.get_desc());

        // product=new Choclate(product);
        // System.out.println(product.cost());
        // System.out.println(product.get_desc());


        //!-------- Singleton pattern Example!---------------


        // SimpleSingleton instance =SimpleSingleton.getInstance();
        // ThreadSafeSingleton threadSafeInstance=ThreadSafeSingleton.getInstance();
        // instance.printMessage();



        



        


    }
}

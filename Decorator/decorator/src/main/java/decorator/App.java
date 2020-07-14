package decorator;

import decorator.Components.Icecream;
import decorator.Components.ComponentsImpl.SimpleIcecream;
import decorator.Decorators.DecoratorComponent.Choclate;
import decorator.Decorators.DecoratorComponent.Vanila;

/**
 * Hello world!
 *
  */ public class App 
{
    public static void main( String[] args )
    {
        // I am treating this as the client class
        
        // Client want to order a Icecream ;

        Icecream icecream=new SimpleIcecream();
        System.out.println(icecream.cost());
        System.out.println(icecream.get_desc()); // This is Just a Simple Icecream


        // Now Client want to add Choclate in that

        icecream=new Choclate(icecream);
        System.out.println(icecream.cost());
        System.out.println(icecream.get_desc()); 


        //Now Client wants Icecream with vanila;

        icecream=new Vanila(icecream);
        System.out.println(icecream.cost());
        System.out.println(icecream.get_desc()); 


    

    }
}

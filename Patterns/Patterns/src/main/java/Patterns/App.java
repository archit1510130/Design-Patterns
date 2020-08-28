package Patterns;

import Patterns.Composite.Component.Airforce;
import Patterns.Composite.Leaf.F16;
import Patterns.Composite.Leaf.Rafel;
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



   // u s
        // /\ \
        // f16  rafel  Nato
        //             /\
        //             f16  rafelmples

        // clinet class

        Airforce Nato =new Airforce();
        Nato.add(new F16());
        Nato.add(new Rafel());


        // now 

        Airforce US=new Airforce();
        US.add(Nato);
        US.add(new F16());

        US.add(new Rafel());


        // so now structure is somewhat like

        // u s
        // /\ \
        // f16  rafel  Nato
        //             /\
        //             f16  rafel

        System.out.println(US.getPersonnel());
        System.out.println(Nato.getPersonnel());



    


        


    }
}

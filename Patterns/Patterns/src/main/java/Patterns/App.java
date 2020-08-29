package Patterns;

import Patterns.Bridge.Abstractcar;
import Patterns.Bridge.AsiaRules;
import Patterns.Bridge.ModelL;
import Patterns.Bridge.UnCarRules;
import Patterns.Chain_of_Responsiblity.AbstractChain;
import Patterns.Chain_of_Responsiblity.Request;
import Patterns.Chain_of_Responsiblity.RequestType.AddRequest;
import Patterns.Chain_of_Responsiblity.RequestType.Mul;
import Patterns.Chain_of_Responsiblity.RequestType.SubstractRequest;
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



//------------------------------------------------------------------------------------------------------------------------//


        // Bridge Patterns


        //now I can have any combination of model with any location that we have 
        // for adding another model we just need to add 1 class there but without Bridge that wouldb be 3


        // Abstractcar ModelLAsia=new ModelL(new AsiaRules());
        // Abstractcar ModelLUn=new ModelL(new UnCarRules());

        // System.out.println(ModelLAsia.isCarRightHanded());
        // System.out.println(ModelLUn.isCarRightHanded());
        // same you can do for all others models






        ////////////////////----------------------------------------------------------------/////////////////////////////////////////////

// Chain of Responsiblity

        // first we need to create chain , although in framework and all this is created at the time of creation 

        AbstractChain chain1Obj=new AddRequest();
       AbstractChain chainObj2=new SubstractRequest();
       AbstractChain chainObj3=new Mul();


       chain1Obj.setNextChain(chainObj2);
       chainObj2.setNextChain(chainObj3);

       // we can actully crate this septate class that is responsible for creating chain and return it to clien

       Request add=new Request(1,2,"sub");

       chain1Obj.calculate(add);
       


    }
}

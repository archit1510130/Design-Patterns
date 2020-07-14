package decorator.Decorators.DecoratorComponent;


import decorator.Components.Icecream;
import decorator.Decorators.DecoratorInterface;


public class Choclate implements DecoratorInterface {

    Icecream icecream;

    public Choclate(Icecream icecream) {
        this.icecream=icecream;
    }

    @Override
    public int cost() {

       return  this.icecream.cost()+50;    
    }

    @Override
    public String get_desc() {
        
        return "This Is Icream With Choclate";
    }

    
    
}
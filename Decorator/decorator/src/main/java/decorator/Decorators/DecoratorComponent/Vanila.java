package decorator.Decorators.DecoratorComponent;


import decorator.Components.Icecream;
import decorator.Decorators.DecoratorInterface;


public class Vanila implements DecoratorInterface {

    Icecream icecream;

    public Vanila(Icecream icecream) {
        this.icecream=icecream;
    }

    @Override
    public int cost() {

       return  this.icecream.cost()+25;    
    }

    @Override
    public String get_desc() {
        
        return "This Is Icream With Vanila";
    }

    
    
}
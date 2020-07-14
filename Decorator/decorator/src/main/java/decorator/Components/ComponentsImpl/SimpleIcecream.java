package decorator.Components.ComponentsImpl;

import decorator.Components.Icecream;


public class SimpleIcecream implements Icecream {

    @Override
    public int cost() {
        
        return 100;
    }

    @Override
    public String get_desc() {
        
        return "This is the example of Simple Icecream";
    }

    
    
}
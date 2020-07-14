package Patterns.Decorator.Product.ProductImpl;

import Patterns.Decorator.Product.ProductInterFace;

public class Icecream implements ProductInterFace{
    @Override
    public int cost() {
        
        return 100;
    }

    @Override
    public String get_desc() {
        
        return "This is the example of Simple Icecream";
    }
    
    
}
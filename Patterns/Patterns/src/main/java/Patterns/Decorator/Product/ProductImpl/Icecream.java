package main.java.Patterns.Decorator.Product.ProductImpl;

public class Icecream implements Product{
    @Override
    public int cost() {
        
        return 100;
    }

    @Override
    public String get_desc() {
        
        return "This is the example of Simple Icecream";
    }
    
    
}
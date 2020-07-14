package Patterns.Decorator.decorators.decoratorComponents;

import Patterns.Decorator.Product.ProductInterFace;
import Patterns.Decorator.decorators.DecoratorInterface;

public class Vanila implements DecoratorInterface {

    ProductInterFace product;

    @Override
    public int cost() {
        
        return this.product.cost()+50;
    }

    @Override
    public String get_desc() {
       
        return "This is Prodcut With Vanila";
    }

    public Vanila(ProductInterFace product) {

        this.product=product;

    }


    
    
}
package Patterns.Decorator.decorators.decoratorComponents;

import Patterns.Decorator.Product.ProductInterFace;
import Patterns.Decorator.decorators.DecoratorInterface;

public class Choclate implements DecoratorInterface {

    ProductInterFace product;

    @Override
    public int cost() {
        
        return this.product.cost()+100;
    }

    @Override
    public String get_desc() {
       
        return "This is Prodcut With Icecream";
    }

    public Choclate(ProductInterFace product) {

        this.product=product;

    }


    
    
}
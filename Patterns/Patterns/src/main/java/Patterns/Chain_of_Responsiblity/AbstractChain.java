package Patterns.Chain_of_Responsiblity;

public interface AbstractChain {

    public void setNextChain(AbstractChain chain);

    public void calculate(Request request);
    
    
}
package Patterns.Chain_of_Responsiblity.RequestType;

import Patterns.Chain_of_Responsiblity.AbstractChain;
import Patterns.Chain_of_Responsiblity.Request;

public class AddRequest implements AbstractChain {

    private AbstractChain nextChain;

    @Override
    public void setNextChain(AbstractChain chain) {

        nextChain=chain;
        // TODO Auto-generated method stub

    }

    @Override
    public void calculate(Request request) {

        if(request.getCal_type().equals("add"))
        {
            System.out.println("This is ADD"+" "+request.getNum1()+request.getNum2());
        }
        else{
            this.nextChain.calculate(request);
        }
        // TODO Auto-generated method stub

    }

   
    
}
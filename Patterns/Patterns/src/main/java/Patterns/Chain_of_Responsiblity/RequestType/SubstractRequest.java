package Patterns.Chain_of_Responsiblity.RequestType;

import Patterns.Chain_of_Responsiblity.AbstractChain;
import Patterns.Chain_of_Responsiblity.Request;

public class SubstractRequest implements AbstractChain{

    private AbstractChain nextChain;

	@Override
	public void setNextChain(AbstractChain chain) {
        // TODO Auto-generated method stub
        
        this.nextChain=chain;
		
	}

	@Override
	public void calculate(Request request) {

        if(request.getCal_type().equals("sub"))
        {
            System.out.println("This is SUB"+" "+(request.getNum1() - request.getNum2()));
        }
        else{
            this.nextChain.calculate(request);
        }
		// TODO Auto-generated method stub
		
	}
    

   }

    

package Patterns.Chain_of_Responsiblity.RequestType;

import Patterns.Chain_of_Responsiblity.AbstractChain;
import Patterns.Chain_of_Responsiblity.Request;

public class Mul implements AbstractChain {




    @Override
    public void setNextChain(AbstractChain chain) {
        // TODO Auto-generated method stub

    }

    @Override
    public void calculate(Request request) {

        if(request.getCal_type().equals("mul"))
        {
            System.out.println("MUltiply");
            System.out.println(request.getNum1()*request.getNum2());
        }
        else{

            System.out.println(" We only support add ,mul and sub");
        }


        // TODO Auto-generated method stub

    }
    
    
}
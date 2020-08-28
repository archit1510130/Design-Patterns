package Patterns.Bridge;

public class UnCarRules extends AbstractcarSafety{

    @Override
    void listSafetyEquipment() {
        System.out.println("Safety Can be here");

    }

    @Override
    boolean isCarRightHanded() {
        // TODO Auto-generated method stub
        return true;
    }
    
}
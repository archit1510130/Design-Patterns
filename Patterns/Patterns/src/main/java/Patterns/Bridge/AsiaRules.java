package Patterns.Bridge;

public class AsiaRules extends AbstractcarSafety{

    @Override
    void listSafetyEquipment() {
        System.out.println("IN ASIA No Safety");

    }

    @Override
    boolean isCarRightHanded() {
        // TODO Auto-generated method stub
        return false;
    }
    
    
}
package Patterns.Bridge;

public class ModelR extends Abstractcar{

    public ModelR(AbstractcarSafety safetyCar) {
        super(safetyCar);
       
    }

    @Override
    public void listSafetyEquipment() {

        safetyCar.listSafetyEquipment();
       

    }

    @Override
   public  boolean isCarRightHanded() {
       
        return safetyCar.isCarRightHanded();
    }
    

    
}
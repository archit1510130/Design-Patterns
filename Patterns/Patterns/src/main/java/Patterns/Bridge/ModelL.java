package Patterns.Bridge;

public class ModelL extends Abstractcar {

    public ModelL(AbstractcarSafety safetyCar) {
        super(safetyCar);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void listSafetyEquipment() {

        safetyCar.listSafetyEquipment();
        // TODO Auto-generated method stub

    }

    @Override
    public boolean isCarRightHanded() {
        return safetyCar.isCarRightHanded();

    }
    
    
}
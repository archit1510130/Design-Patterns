package Patterns.Bridge;

public abstract class Abstractcar {
    protected AbstractcarSafety safetyCar;
 
    public Abstractcar(AbstractcarSafety safetyCar) {
        this.safetyCar =safetyCar;
    }
 
    abstract void listSafetyEquipment();
 
    public abstract boolean isCarRightHanded();
    
}
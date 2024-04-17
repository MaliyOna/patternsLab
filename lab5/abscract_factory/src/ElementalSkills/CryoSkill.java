package ElementalSkills;

import Abstruction.IElementalSkill;

public class CryoSkill implements IElementalSkill {
    @Override
    public void useSkill() {
        System.out.println("Using Cryo elemental skill.");
    }
}

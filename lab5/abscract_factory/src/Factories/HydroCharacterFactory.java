package Factories;

import Abstruction.ICharacter;
import Abstruction.ICharacterFactory;
import Abstruction.IElementalSkill;
import Abstruction.IUltimateAbility;
import Characters.HydroCharacter;
import ElementalSkills.HydroSkill;
import Ultimates.HydroUltimate;

public class HydroCharacterFactory implements ICharacterFactory {
    @Override
    public ICharacter createCharacter() {
        return new HydroCharacter();
    }

    @Override
    public IElementalSkill createElementalSkill() {
        return new HydroSkill();
    }

    @Override
    public IUltimateAbility createUltimateAbility() {
        return new HydroUltimate();
    }
}

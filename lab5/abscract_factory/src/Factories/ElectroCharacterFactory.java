package Factories;

import Abstruction.ICharacter;
import Abstruction.ICharacterFactory;
import Abstruction.IElementalSkill;
import Abstruction.IUltimateAbility;
import Characters.ElectroCharacter;
import ElementalSkills.ElectroSkill;
import Ultimates.ElectroUltimate;

public class ElectroCharacterFactory implements ICharacterFactory {
    @Override
    public ICharacter createCharacter() {
        return new ElectroCharacter();
    }

    @Override
    public IElementalSkill createElementalSkill() {
        return new ElectroSkill();
    }

    @Override
    public IUltimateAbility createUltimateAbility() {
        return new ElectroUltimate();
    }
}

package Factories;

import Abstruction.ICharacter;
import Abstruction.ICharacterFactory;
import Abstruction.IElementalSkill;
import Abstruction.IUltimateAbility;
import Characters.PyroCharacter;
import ElementalSkills.PyroSkill;
import Ultimates.PyroUltimate;

public class PyroCharacterFactory implements ICharacterFactory {
    @Override
    public ICharacter createCharacter() {
        return new PyroCharacter();
    }

    @Override
    public IElementalSkill createElementalSkill() {
        return new PyroSkill();
    }

    @Override
    public IUltimateAbility createUltimateAbility() {
        return new PyroUltimate();
    }
}

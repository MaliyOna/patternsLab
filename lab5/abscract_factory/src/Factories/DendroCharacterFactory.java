package Factories;

import Abstruction.ICharacter;
import Abstruction.ICharacterFactory;
import Abstruction.IElementalSkill;
import Abstruction.IUltimateAbility;
import Characters.DendroCharacter;
import ElementalSkills.DendroSkill;
import Ultimates.DendroUltimate;

public class DendroCharacterFactory implements ICharacterFactory {
    @Override
    public ICharacter createCharacter() {
        return new DendroCharacter();
    }

    @Override
    public IElementalSkill createElementalSkill() {
        return new DendroSkill();
    }

    @Override
    public IUltimateAbility createUltimateAbility() {
        return new DendroUltimate();
    }
}

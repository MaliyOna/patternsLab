package Factories;

import Abstruction.ICharacter;
import Abstruction.ICharacterFactory;
import Abstruction.IElementalSkill;
import Abstruction.IUltimateAbility;
import Characters.AnemoCharacter;
import ElementalSkills.AnemoSkill;
import Ultimates.AnemoUltimate;

public class AnemoCharacterFactory implements ICharacterFactory {
    @Override
    public ICharacter createCharacter() {
        return new AnemoCharacter();
    }

    @Override
    public IElementalSkill createElementalSkill() {
        return new AnemoSkill();
    }

    @Override
    public IUltimateAbility createUltimateAbility() {
        return new AnemoUltimate();
    }
}

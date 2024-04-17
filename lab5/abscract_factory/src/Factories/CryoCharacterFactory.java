package Factories;

import Abstruction.ICharacter;
import Abstruction.ICharacterFactory;
import Abstruction.IElementalSkill;
import Abstruction.IUltimateAbility;
import Characters.CryoCharacter;
import ElementalSkills.CryoSkill;
import Ultimates.CryoUltimate;

public class CryoCharacterFactory implements ICharacterFactory {
    @Override
    public ICharacter createCharacter() {
        return new CryoCharacter();
    }

    @Override
    public IElementalSkill createElementalSkill() {
        return new CryoSkill();
    }

    @Override
    public IUltimateAbility createUltimateAbility() {
        return new CryoUltimate();
    }
}

package Factories;

import Abstruction.ICharacter;
import Abstruction.ICharacterFactory;
import Abstruction.IElementalSkill;
import Abstruction.IUltimateAbility;
import Characters.GeoCharacter;
import ElementalSkills.GeoSkill;
import Ultimates.GeoUltimate;

public class GeoCharacterFactory implements ICharacterFactory {
    @Override
    public ICharacter createCharacter() {
        return new GeoCharacter();
    }

    @Override
    public IElementalSkill createElementalSkill() {
        return new GeoSkill();
    }

    @Override
    public IUltimateAbility createUltimateAbility() {
        return new GeoUltimate();
    }
}

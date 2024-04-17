package Foods;

import Abstructions.Character;
import Abstructions.CharacterDecorator;

public class SweetMadame extends CharacterDecorator {
    public SweetMadame(Character character) {
        super(character);

        super.setHealth(
                character.getHealth() + character.getHealth() * 0.34 + 1900
        );
    }
}

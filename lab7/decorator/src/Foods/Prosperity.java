package Foods;

import Abstructions.Character;
import Abstructions.CharacterDecorator;

public class Prosperity extends CharacterDecorator {
    public Prosperity(Character character) {
        super(character);

        super.setHealth(
                character.getHealth() + character.getHealth() * 0.34 + 1900
                );
    }
}

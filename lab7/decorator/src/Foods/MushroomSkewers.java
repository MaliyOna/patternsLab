package Foods;

import Abstructions.Character;
import Abstructions.CharacterDecorator;

public class MushroomSkewers extends CharacterDecorator {
    public MushroomSkewers(Character character) {
        super(character);

        super.setHealth(
                character.getHealth() + character.getHealth() * 0.24 + 1500
        );
    }
}

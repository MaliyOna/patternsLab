package Foods;

import Abstructions.Character;
import Abstructions.CharacterDecorator;

public class JadeParcels extends CharacterDecorator {
    public JadeParcels(Character character) {
        super(character);

        super.setAttackPower(
                character.getAttackPower() + 320
        );

        super.setCriticalRate(
                character.getCriticalRate() + 10
        );
    }
}

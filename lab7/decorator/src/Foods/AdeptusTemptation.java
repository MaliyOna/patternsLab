package Foods;

import Abstructions.Character;
import Abstructions.CharacterDecorator;

public class AdeptusTemptation extends CharacterDecorator {
    public AdeptusTemptation(Character character) {
        super(character);

        super.setAttackPower(
                character.getAttackPower() + 375
        );

        super.setCriticalRate(
                character.getCriticalRate() + 12
        );
    }
}

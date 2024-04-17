import Abstractions.AbstractHandler;
import Abstractions.Character;

public class HealHandler extends AbstractHandler {
    @Override
    public void Handle(Character character, String request) {
        if (request.equals("Heal")) {  // Используйте equals для сравнения строк
            System.out.println("Healing " + character.getName() + " by 80 HP");
            character.setHp(character.getHp() + 80);
        } else {
            super.Handle(character, request);
        }
    }
}

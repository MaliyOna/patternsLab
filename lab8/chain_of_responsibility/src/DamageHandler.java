import Abstractions.AbstractHandler;
import Abstractions.Character;

public class DamageHandler extends AbstractHandler {

    @Override
    public void Handle(Character character, String request) {
        if (request.equals("Damage")) {  // Используйте equals для сравнения строк
            System.out.println("Dealing 100 damage to " + character.getName());
            character.setHp(character.getHp() - 100);
        } else {
            super.Handle(character, request);  // Вызов метода суперкласса
        }
    }
}

import Abstruction.ICharacter;
import Abstruction.ICharacterFactory;
import Abstruction.IElementalSkill;
import Abstruction.IUltimateAbility;

public class Game {
    private ICharacter _character;
    private IElementalSkill _elementalSkill;
    private IUltimateAbility _ultimateAbility;

    public Game(ICharacterFactory factory){
        _character = factory.createCharacter();
        _elementalSkill = factory.createElementalSkill();
        _ultimateAbility = factory.createUltimateAbility();
    }

    public void startGame(){
        _character.displayAbilities();
        _elementalSkill.useSkill();
        _ultimateAbility.useUltimate();
    }
}

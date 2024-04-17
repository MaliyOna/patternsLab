package Characters;

import Characters.Abstruction.BaseCharacter;
import Characters.Abstruction.ITeamMediator;

public class Raiden extends BaseCharacter {
    public Raiden(ITeamMediator mediator){
        super(mediator, "Raiden");
    }

    @Override
    public void performSkill() {
        mediator.PerformSkill("Elemental Skill ", this);
    }

    @Override
    public void skillPerformed(String skill) {
        System.out.println(getName() + " noticed " + skill + " was performed.");
    }
}

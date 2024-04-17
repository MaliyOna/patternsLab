package Characters;

import Characters.Abstruction.BaseCharacter;
import Characters.Abstruction.ITeamMediator;

public class Nahida extends BaseCharacter {
    public Nahida(ITeamMediator mediator){
        super(mediator, "Nahida");
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

package Characters;

import Characters.Abstruction.BaseCharacter;
import Characters.Abstruction.ITeamMediator;

public class Alhaitham extends BaseCharacter {
    public Alhaitham(ITeamMediator mediator){
        super(mediator, "Alhaitham");
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

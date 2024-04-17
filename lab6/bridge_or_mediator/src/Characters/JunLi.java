package Characters;

import Characters.Abstruction.BaseCharacter;
import Characters.Abstruction.ITeamMediator;

public class JunLi extends BaseCharacter {
    public JunLi(ITeamMediator mediator){
        super(mediator, "Jun Li");
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

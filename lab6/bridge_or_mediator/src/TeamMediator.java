import Characters.Abstruction.BaseCharacter;
import Characters.Abstruction.ITeamMediator;

import java.util.ArrayList;
import java.util.List;

public class TeamMediator implements ITeamMediator {
    private List<BaseCharacter> teamMembers;

    public TeamMediator()
    {
        teamMembers = new ArrayList<BaseCharacter>();
    }

    public void AddMember(BaseCharacter member)
    {
        teamMembers.add(member);
    }

    @Override
    public void PerformSkill(String skill, BaseCharacter baseCharacter) {
        System.out.println(baseCharacter.getName() + " is performing " + skill + ".");

        for (BaseCharacter member : teamMembers) {
            if (member != baseCharacter) {
                member.skillPerformed(skill);
            }
        }
    }
}

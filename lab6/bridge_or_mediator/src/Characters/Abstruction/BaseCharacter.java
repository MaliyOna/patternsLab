package Characters.Abstruction;

public abstract class BaseCharacter {
    protected ITeamMediator mediator;
    private String name;

    public BaseCharacter(ITeamMediator _mediator, String _name){
        mediator = _mediator;
        name = _name;
    }

    public String getName(){
        return name;
    }

    public abstract void performSkill();
    public abstract void skillPerformed(String skill);
}

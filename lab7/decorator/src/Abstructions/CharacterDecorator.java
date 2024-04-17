package Abstructions;

public abstract class CharacterDecorator extends Character {
    protected Character character;

    public CharacterDecorator(Character character){
        super(character.getName(), character.getHealth(), character.getAttackPower(), character.getCriticalRate(), character.getCriticalDamage());
        this.character = character;
    }

    public void displayStats()
    {
        System.out.println("Name: " + getName());
        System.out.println("Health: " + getHealth());
        System.out.println("Attack power: " + getAttackPower());
        System.out.println("Critical rate: " + getCriticalRate());
        System.out.println("Critical damage: " + getCriticalDamage());
    }
}

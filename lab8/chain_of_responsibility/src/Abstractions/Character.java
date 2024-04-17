package Abstractions;

public abstract class Character {
    private String name;
    private double hp;

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public double getHp() {
        return hp;
    }

    public Character(String _name, double _hp){
        name = _name;
        hp = _hp;
    }

    public void DisplayStats(){
        System.out.println(name + " has " + hp);
    }
}

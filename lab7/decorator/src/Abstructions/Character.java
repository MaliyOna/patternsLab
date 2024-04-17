package Abstructions;

public class Character {
    private String name;
    private double health;
    private double attackPower;
    private double criticalRate ;
    private double criticalDamage;

    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(double attackPower) {
        this.attackPower = attackPower;
    }

    public double getCriticalRate() {
        return criticalRate;
    }

    public void setCriticalRate(double criticalRate) {
        this.criticalRate = criticalRate;
    }

    public double getCriticalDamage() {
        return criticalDamage;
    }

    public void setCriticalDamage(double criticalDamage) {
        this.criticalDamage = criticalDamage;
    }

    public Character (String _name, double _health, double _attackPower, double _criticalRate, double _criticalDamage){
        name = _name;
        health = _health;
        attackPower = _attackPower;
        criticalRate = _criticalRate;
        criticalDamage = _criticalDamage;
    }

    public void displayStats(){
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Attack power: " + attackPower);
        System.out.println("Critical rate: " + criticalRate);
        System.out.println("critical damage: " + criticalDamage);
    }
}

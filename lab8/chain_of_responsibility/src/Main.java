public class Main {
    public static void main(String[] args) {
        var huTao = new HuTao();
        var damageHandler = new DamageHandler();
        var healHandler = new HealHandler();

        damageHandler.SetNext(healHandler);

        System.out.println("Before any action:");
        huTao.DisplayStats();

        damageHandler.Handle(huTao, "Damage");
        System.out.println("After taking damage:");
        huTao.DisplayStats();

        damageHandler.Handle(huTao, "Heal");
        System.out.println("After taking heal:");
        huTao.DisplayStats();
    }
}
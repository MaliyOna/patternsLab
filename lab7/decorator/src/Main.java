import Abstructions.Character;
import Foods.*;

public class Main {
    public static void main(String[] args) {
        var huTao = new Character("Hu Tao", 30000, 1700, 50, 190);
        huTao.displayStats();
        System.out.println("---------------------\n");

        huTao = new Prosperity(huTao);
        huTao.displayStats();
        System.out.println("---------------------\n");

        huTao = new AdeptusTemptation(huTao);
        huTao.displayStats();
        System.out.println("---------------------\n");

        huTao = new JadeParcels(huTao);
        huTao.displayStats();
        System.out.println("---------------------\n");

        huTao = new MushroomSkewers(huTao);
        huTao.displayStats();
        System.out.println("---------------------\n");

        huTao = new SweetMadame(huTao);
        huTao.displayStats();
    }
}
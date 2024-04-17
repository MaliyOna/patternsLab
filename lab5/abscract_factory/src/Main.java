import Abstruction.ICharacterFactory;
import Factories.*;

public class Main {
    public static void main(String[] args) {
        ICharacterFactory factory;
        Game game;

        factory = new PyroCharacterFactory();
        game = new Game(factory);
        game.startGame();
        System.out.println("\n");

        factory = new CryoCharacterFactory();
        game = new Game(factory);
        game.startGame();
        System.out.println("\n");

        factory = new AnemoCharacterFactory();
        game = new Game(factory);
        game.startGame();
        System.out.println("\n");

        factory = new DendroCharacterFactory();
        game = new Game(factory);
        game.startGame();
        System.out.println("\n");

        factory = new ElectroCharacterFactory();
        game = new Game(factory);
        game.startGame();
        System.out.println("\n");

        factory = new GeoCharacterFactory();
        game = new Game(factory);
        game.startGame();
        System.out.println("\n");

        factory = new HydroCharacterFactory();
        game = new Game(factory);
        game.startGame();
        System.out.println("\n");
    }
}
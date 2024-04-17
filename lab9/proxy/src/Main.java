public class Main {
    public static void main(String[] args) {
        var catWithAccess = new CatProxy(true);
        catWithAccess.petCat();
        catWithAccess.feedCat();
        catWithAccess.playWithCat();
        catWithAccess.takeCatToVet();

        System.out.println("----------");

        var catWithoutAccess = new CatProxy(false);
        catWithoutAccess.petCat();
        catWithoutAccess.feedCat();
        catWithoutAccess.playWithCat();
        catWithoutAccess.takeCatToVet();
    }
}
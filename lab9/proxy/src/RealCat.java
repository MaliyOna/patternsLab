public class RealCat implements ICat{
    @Override
    public void petCat() {
        System.out.println("The cat purrs contentedly.");
    }

    @Override
    public void feedCat() {
        System.out.println("The cat is happily eating.");
    }

    @Override
    public void playWithCat() {
        System.out.println("The cat is joyfully playing with a ball of yarn.");
    }

    @Override
    public void takeCatToVet() {
        System.out.println("You have taken the cat to the vet.");
    }
}

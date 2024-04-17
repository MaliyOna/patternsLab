public class CatProxy implements ICat{
    private RealCat _realCat;
    private boolean _hasAccess;

    public CatProxy(boolean hasAccess) {
        _hasAccess = hasAccess;
        _realCat = new RealCat();
    }

    @Override
    public void petCat() {
        if (_hasAccess)
        {
            _realCat.petCat();
            drawHappyCat();
        }
        else
        {
            System.out.println("Access denied: You cannot pet the cat.");
        }
    }

    @Override
    public void feedCat() {
        if (_hasAccess)
        {
            _realCat.feedCat();
            drawEatingCat();
        }
        else
        {
            System.out.println("Access denied: You cannot feed the cat.");
        }
    }

    @Override
    public void playWithCat() {
        if (_hasAccess)
        {
            _realCat.playWithCat();
            drawPlayfulCat();
        }
        else
        {
            System.out.println("Access denied: You cannot play with the cat.");
        }
    }

    @Override
    public void takeCatToVet() {
        if (_hasAccess)
        {
            _realCat.takeCatToVet();
            drawAnxiousCat();
        }
        else
        {
            System.out.println("Access denied: You cannot take the cat to the vet.");
        }
    }

    private void drawHappyCat()
    {
        System.out.println("   /\\_/\\ ");
        System.out.println("  ( o.o )");
        System.out.println("   > ^ < ");
    }

    private void drawEatingCat()
    {
        System.out.println("   /\\_/\\ ");
        System.out.println("  ( o.o )");
        System.out.println("   > 3 < ");
    }

    private void drawPlayfulCat()
    {
        System.out.println("   /\\_/\\ ");
        System.out.println("  ( >.< )");
        System.out.println("   > ^ < ");
    }

    private void drawAnxiousCat()
    {
        System.out.println("   /\\_/\\ ");
        System.out.println("  ( o.o )");
        System.out.println("   > - < ");
    }
}

public class Burger extends Food{
    public enum Size {
        Small,
        Medium,
        Large
    }
    private Size _size;

    public Burger(Size size)
    {
        super("Burger");
        _size = size;
    }

    public Burger(String name, Size size)
    {
        super(name);
        _size = size;
    }

    public Size getSize() { return _size; }

    public String getName() {
        return super.getName();
    }

    @Override
    public boolean equals(Object obj){
        return this==obj;
    }

    @Override
    public int calculateCalories() {
        if (_size == Size.Small)
            return 100;
        if (_size == Size.Medium)
            return 200;
        return 300;
    }
}

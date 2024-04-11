public class Burger extends Food implements INutritious {
    public enum Size {
        Small,
        Medium,
        Large
    }
    private Size _size;

    public Burger(Size size){
        _size = size;
    }

    public Size GetSize() { return _size; }


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

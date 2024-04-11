public class Burger extends Food{
    public enum Size {
        Small,
        Medium,
        Large
    }
    private Size _size;

    public Burger(Size size){
        _size = size;
    }

    public Size GetSize() {
        return _size;
    }
}

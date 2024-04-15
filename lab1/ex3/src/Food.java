public class Food implements INutritious {
    public Food(String name) {
        _name = name;
    }

    private String _name = "";

    public String getName(){
        return _name;
    }

    @Override
    public int calculateCalories() {
        return 0;
    }
}

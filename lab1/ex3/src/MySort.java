import java.util.Comparator;

public class MySort implements Comparator<Food>{
    @Override
    public int compare(Food food1, Food food2) {
        return Integer.compare(food1.getName().length(), food2.getName().length());
    }
}

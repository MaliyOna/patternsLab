import java.util.Comparator;

public class MySort implements Comparator<Burger>{
    @Override
    public int compare(Burger burger1, Burger burger2) {
        return burger1.GetSize().toString().compareTo(burger2.GetSize().toString());
    }
}

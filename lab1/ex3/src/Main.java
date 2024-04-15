import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Food> breakfast = new ArrayList<>(List.of(
                new Burger("name1", Burger.Size.Small),
                new Burger(Burger.Size.Medium),
                new Burger("name22", Burger.Size.Large),
                new Burger("name3",Burger.Size.Small),
                new Sandwich("name1", "test"),
                new Sandwich(),
                new Sandwich("name2", "test", "test")));

        List<Burger> burgersInBreakfast = new ArrayList<>();

        for (Food food: breakfast){
            if (food instanceof Burger)
                burgersInBreakfast.add(new Burger(((Burger) food).getSize()));
        }

        System.out.println("Small: " + countBurgerOfSize(burgersInBreakfast, Burger.Size.Small));
        System.out.println("Medium: " + countBurgerOfSize(burgersInBreakfast, Burger.Size.Medium));
        System.out.println("Large: " + countBurgerOfSize(burgersInBreakfast, Burger.Size.Large));

        if (Arrays.asList(args).contains("-calories")){
            int allCalories = 0;

            for(Food food: breakfast){
                allCalories += food.calculateCalories();
            }

            System.out.println("Calories: " + allCalories);
        }

        if(Arrays.asList(args).contains("-sort")) {
            Collections.sort(breakfast, new MySort());
            breakfast.forEach(b -> System.out.println(b.getName()));
        }
    }

    public static  int countBurgerOfSize(List<Burger> burgers, Burger.Size size) {
        int result = 0;

        for (Burger burger : burgers) {
            if (burger.getSize() == size){
                result++;
            }
        }

        return  result;
    }
}
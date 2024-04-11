import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Burger> breakfast = List.of(
                new Burger(Burger.Size.Small),
                new Burger(Burger.Size.Medium),
                new Burger(Burger.Size.Large),
                new Burger(Burger.Size.Medium));

        System.out.println("Small: " + countBurgerOfSize(breakfast, Burger.Size.Small));
        System.out.println("Medium: " + countBurgerOfSize(breakfast, Burger.Size.Medium));
        System.out.println("Large: " + countBurgerOfSize(breakfast, Burger.Size.Large));

        if (Arrays.asList(args).contains("-calories")){
            int allCalories = 0;

            for(Burger burger: breakfast){
                allCalories += burger.calculateCalories();
            }

            System.out.println("Calories: " + allCalories);
        }
    }

    public static  int countBurgerOfSize(List<Burger> burgers, Burger.Size size) {
        int result = 0;

        for (Burger burger : burgers) {
            if (burger.GetSize() == size){
                result++;
            }
        }

        return  result;
    }
}
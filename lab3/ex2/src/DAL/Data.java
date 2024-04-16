package DAL;

import DAL.Abstruction.IData;
import Models.Product;

import java.util.ArrayList;
import java.util.Arrays;

public class Data implements IData {
    public ArrayList<Product> getProduct() {
        return new ArrayList<>(Arrays.asList(
                new Product(1, "Milk", "1111111", "DairyCo", 50, 7, 10),
                new Product(2, "Bread", "2222222", "BakeryFresh", 25, 3, 50),
                new Product(3, "Apples", "3333333", "FruitFarm", 30, 15, 25),
                new Product(4, "Orange Juice", "4444444", "JuicyOranges", 70, 10, 30),
                new Product(5, "Coffee", "5555555", "BrewBros", 100, 365, 15),
                new Product(6, "Chocolate Bar", "6666666", "SweetTooth", 45, 180, 40),
                new Product(7, "Cheese", "7777777", "CheeseLand", 80, 20, 20),
                new Product(8, "Yogurt", "8888888", "DairyCo", 60, 14, 35),
                new Product(9, "Cereal", "9999999", "BreakfastBuddies", 110, 60, 22),
                new Product(10, "Peanut Butter", "1010101", "Nutty", 120, 90, 25),
                new Product(11, "Pasta", "1111112", "Italiano", 90, 300, 30),
                new Product(12, "Rice", "1212121", "GoldenGrains", 70, 180, 50),
                new Product(13, "Milk", "1313131", "VeggieGarden", 40, 10, 28),
                new Product(14, "Lettuce", "1414141", "VeggieGarden", 30, 7, 15),
                new Product(15, "Chicken Breasts", "1515151", "FarmersFowl", 200, 5, 20)
        ));
    }
}

import java.util.List;
import java.util.Scanner;

import Controllers.ProductsController;
import Views.ProductView;

public class Main {
    public static void main(String[] args) {
        var productView = new ProductView();

        Scanner in = new Scanner(System.in);
        int end = 0;

        while (end == 0){
            productView.printSentence("1-getProductsByName 2-getProductsByNameAndMorePrice 3-getProductsMoreTermStorage 4-end");
            int target = in.nextInt();

            switch (target){
                case 1:
                    getProductsByName();
                    break;
                case 2:
                    getProductsByNameAndMorePrice();
                    break;
                case 3:
                    getProductsMoreTermStorage();
                    break;
                case 4:
                    end = 1;
                    break;
            }
        }
    }

    public static void getProductsByName(){
        var productView = new ProductView();
        Scanner in = new Scanner(System.in);

        productView.printSentence("Enter name");
        var name = in.nextLine();

        var productsController = new ProductsController();
        try {
            var result = productsController.getProductsByName(name);

            productView.printTitle("Get products by name:");
            productView.printList(result);
        }
        catch (Exception ex){
            productView.printSentence(ex.getMessage());
        }
    }

    public static void getProductsByNameAndMorePrice(){
        var productView = new ProductView();
        Scanner in = new Scanner(System.in);

        productView.printSentence("Enter name");
        var name = in.nextLine();

        productView.printSentence("Enter min price");
        var minPrice = in.nextInt();

        var productsController = new ProductsController();

        try {
            var result = productsController.getProductsByNameAndMorePrice(name, minPrice);

            productView.printTitle("Get products by name and more than price:");
            productView.printList(result);
        }
        catch (Exception ex){
            productView.printSentence(ex.getMessage());
        }
    }

    public static void getProductsMoreTermStorage(){
        var productView = new ProductView();
        Scanner in = new Scanner(System.in);

        productView.printSentence("Enter min term storage");
        var minTermStorage = in.nextInt();

        var productsController = new ProductsController();

        try {
            var result = productsController.getProductsMoreTermStorage(minTermStorage);

            productView.printTitle("Get products by more than term storage:");
            productView.printList(result);
        }
        catch (Exception ex){
            productView.printSentence(ex.getMessage());
        }
    }
}
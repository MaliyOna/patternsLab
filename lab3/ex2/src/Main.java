import java.util.Scanner;

import Controllers.AuthenticationController;
import Controllers.ProductsController;
import Views.ProductView;

public class Main {
    public static void main(String[] args) {
        var productView = new ProductView();

        Scanner in = new Scanner(System.in);
        loginOrRegistration();

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

    public static void loginOrRegistration() {
        var productView = new ProductView();
        Scanner in = new Scanner(System.in);

        var authentication = false;

        while (!authentication){
            productView.printSentence("1-login\n2-registration");
            var target = in.nextInt();

            switch (target){
                case 1:
                    var resultLogin = login();
                    if (resultLogin){
                        productView.printSentence("You login in system");
                        authentication = true;
                    }
                    else {
                        productView.printSentence("Incorrect username or password, try again");
                    }
                    productView.printLine();
                    break;
                case 2:
                    registration();
                    productView.printLine();
                    break;
                default:
                    productView.printLine();
                    break;
            }
        }
    }

    public static boolean login(){
        var authenticationController = new AuthenticationController();
        var productView = new ProductView();
        Scanner in = new Scanner(System.in);

        productView.printSentence("Enter ur username");
        var username = in.nextLine();

        productView.printSentence("Enter ur password");
        var password = in.nextLine();

        return authenticationController.login(username, password);
    }

    public static void registration(){
        var authenticationController = new AuthenticationController();
        var productView = new ProductView();
        Scanner in = new Scanner(System.in);

        productView.printSentence("Enter ur username");
        var username = in.nextLine();

        productView.printSentence("Enter ur password");
        var password = in.nextLine();

        var registrationResult = authenticationController.registration(username, password);

        if (!registrationResult) {
            productView.printSentence("There is already a user with the same name");
        }
        else {
            productView.printSentence("Registration completed successfully");
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
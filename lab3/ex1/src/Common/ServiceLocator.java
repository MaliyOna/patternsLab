package Common;

import Services.Abstruction.IAuthenticationService;
import Services.Abstruction.IProductsService;
import Services.AuthenticationService;
import Services.ProductsService;

public class ServiceLocator {
    private static IProductsService productsService = new ProductsService();
    public static IProductsService getProductsService() {
        return productsService;
    }

    private static AuthenticationService authenticationService = AuthenticationService.getInstance();
    public static AuthenticationService getAuthenticationService() {
        return authenticationService;
    }
}

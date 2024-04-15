package Common;

import Services.Abstruction.IProductsService;
import Services.ProductsService;

public class ServiceLocator {
    private static IProductsService productsService = new ProductsService();

    public static IProductsService getProductsService() {
        return productsService;
    }
}

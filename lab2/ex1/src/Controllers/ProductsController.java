package Controllers;

import Controllers.Abstruction.IProductsController;
import Models.Product;
import Services.Abstruction.IProductsService;
import Common.ServiceLocator;

import java.util.ArrayList;

public class ProductsController implements IProductsController {
    private IProductsService _productsService;

    public ProductsController() {
        _productsService = ServiceLocator.getProductsService();
    }

    @Override
    public ArrayList<Product> getProductsByName(String name) {
        return _productsService.getProductsByName(name);
    }

    @Override
    public ArrayList<Product> getProductsByNameAndMorePrice(String name, int minPrice) {
        return _productsService.getProductsByNameAndMorePrice(name, minPrice);
    }

    @Override
    public ArrayList<Product> getProductsMoreTermStorage(int minTermStorage) {
        return _productsService.getProductsMoreTermStorage(minTermStorage);
    }
}

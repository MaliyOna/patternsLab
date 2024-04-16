package Services.Abstruction;

import Models.Product;

import java.util.ArrayList;

public interface IProductsService {
    public ArrayList<Product> getProductsByName(String name);
    public ArrayList<Product> getProductsByNameAndMorePrice(String name, int minPrice);
    public ArrayList<Product> getProductsMoreTermStorage(int minTermStorage);
}

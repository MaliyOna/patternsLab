package Services;

import Common.DALLocator;
import DAL.Abstruction.IData;
import Models.Product;
import Services.Abstruction.IProductsService;
import java.util.stream.Collectors;

import java.util.ArrayList;

public class ProductsService implements IProductsService {
    private IData _dalData;

    public ProductsService(){
        _dalData = DALLocator.getDalData();
    }

    @Override
    public ArrayList<Product> getProductsByName(String name) {
        var data = _dalData.getProduct();

        return data.stream()
                .filter(x -> x.getName().equals(name))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public ArrayList<Product> getProductsByNameAndMorePrice(String name, int minPrice) {
        var data = _dalData.getProduct();

        return data.stream()
                .filter(x -> x.getName().equals(name) && x.getPrice() > minPrice)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public ArrayList<Product> getProductsMoreTermStorage(int minTermStorage) {
        var data = _dalData.getProduct();

        return data.stream()
                .filter(x -> x.getTermStorage() > minTermStorage)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}

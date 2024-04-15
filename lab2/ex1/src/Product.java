import java.io.Serializable;
import java.util.Objects;

public class Product implements Serializable, Comparable<Product> {
    private int Id;
    private String Name;
    private String UPC;
    private String Manufacturer;
    private int Price;
    private int TermStorage;
    private int Count;

    public Product(){ }

    public int getId() { return Id; }
    public void setId(int _id) { Id = _id; }

    public String getName() { return Name; }
    public void setName(String _name) { Name = _name; }

    public String getUPC() { return UPC; }
    public void setUPC(String _upc) { UPC = _upc; }

    public String getManufacturer() { return Manufacturer; }
    public void setManufacturer(String _manufacturer) { Manufacturer = _manufacturer; }

    public int getPrice() { return Price; }
    public void setPrice(int _price) { Price = _price; }

    public int getTermStorage() { return TermStorage; }
    public void setTermStorage(int _termStorage) { TermStorage = _termStorage; }

    public int getCount() { return Count; }

    public void setCount(int _count) { Count = _count; }

    @Override
    public String toString(){
        return Id + " " + Name + " " + UPC + " " + Manufacturer + " " + Price + " " + TermStorage + " " + Count;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, Name, UPC, Manufacturer, Price, TermStorage, Count);
    }

    @Override
    public int compareTo(Product other) {
        return Integer.compare(this.Id, other.Id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Id == product.Id &&
                Double.compare(product.Price, Price) == 0 &&
                TermStorage == product.TermStorage &&
                Count == product.Count &&
                Name.equals(product.Name) &&
                UPC.equals(product.UPC) &&
                Manufacturer.equals(product.Manufacturer);
    }
}

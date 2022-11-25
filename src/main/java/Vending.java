import java.util.*;

public class Vending {
    private final List<Product> list;

    public Vending(List<Product> list){
        this.list = list;
    }

    public Product getProductByName(String name){
        for (Product item:this.list){
            if (name.equals(item.getName())){
                return item;
            }
        }
        throw new IllegalStateException("Product not found");
    }
}

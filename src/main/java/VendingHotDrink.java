import java.util.List;
public class VendingHotDrink extends Vending {
    private final List<Product> list;
    public VendingHotDrink(List<Product> list) {
        super(list);
        this.list = list;
    }

    public HotDrink getProduct(String name,Double volume, Double temp){
        for(Product product: list){
            if(product instanceof HotDrink){
                if((product.getName().equals(name)) && ((HotDrink) product).getTemp().equals(temp) && ((HotDrink) product).getVolume().equals(volume)){
                    return (HotDrink) product;
                }
            }
        }
        throw new IllegalStateException("Product not found");
    }


}


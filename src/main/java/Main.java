import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<Product>(
                Arrays.asList(
                        new Product("Mars", 100.5),
                        new Product("Twix", 50.00)
                )
        );

        Vending vending = new Vending(list);
        String key = "Mars";
        System.out.println(vending.getProductByName(key));

        List<Product> listDrink = new ArrayList<Product>(
                Arrays.asList(
                        new Drink("CocaCola", 99.90, 0.5),
                        new Drink("Sprite", 49.90, 0.75)
                )
        );
        Vending vendingDrink = new VendingDrink(listDrink);
        String keyDrink = "Sprite";
        System.out.println(vendingDrink.getProductByName(keyDrink));

    }
}

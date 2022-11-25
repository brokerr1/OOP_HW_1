import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>(
                Arrays.asList(
                        new Product("Mars", 100.5),
                        new Product("Twix", 50.00)
                )
        );

        Vending vending = new Vending(list);
        String key = "Mars";
        System.out.println(vending.getProductByName(key));
    }
}
